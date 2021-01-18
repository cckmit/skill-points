package iilibxc.future.controller;

import future.CustomerInfoService;
import future.LearnRecordService;
import future.Operate;
import future.RemoteLoader;
import iilibxc.future.entity.User;
import iilibxc.future.service.Service1;
import iilibxc.future.service.Service2;
import iilibxc.future.service.Service3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.stream.Collectors.toList;

@RestController
public class TestController {

    @Resource
    Service1 service1;
    @Resource
    Service2 service2;
    @Resource
    Service3 service3;

    @GetMapping("testSync")
    public void testSync() {

        try {
            long s = System.currentTimeMillis();
            User user1 = service1.selectID(46);
            User user2 = service1.selectID(47);
            User user3 = service1.selectID(48);
            List<Object> list = new ArrayList<Object>();
            list.add(user1);
            list.add(user2);
            list.add(user3);
            long e = System.currentTimeMillis();
            System.out.println(list);
            System.out.println("e-s:" + (e - s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("testFuture")
    public void testFuture() {
        long start = System.currentTimeMillis();
        List<Object> service = Arrays.asList(
                service1, service2, service3);

        ExecutorService executorService = Executors.newFixedThreadPool(Math.min(service.size(), 50));

        List<CompletableFuture<Object>> completableFutures = service
                .stream()
                .map(loader -> CompletableFuture.supplyAsync(loader::selectID, executorService))
                .collect(toList());

        List<Object> customerDetail = completableFutures
                .stream()
                .map(CompletableFuture::join)
                .collect(toList());

        System.out.println(customerDetail);
        long end = System.currentTimeMillis();
        System.out.println("总共花费时间:" + (end - start));

    }

}
