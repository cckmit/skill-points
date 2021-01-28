package iilibxc.future.controller;

import iilibxc.future.entity.User;
import iilibxc.future.service.AllService;
import iilibxc.future.service.Service1;
import iilibxc.future.service.Service2;
import iilibxc.future.service.Service3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

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
            System.out.println("总共花费时间:" + (e - s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("testFuture")
    public void testFuture() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        Callable<User> idInfo47 = new Callable<User>() {
            @Override
            public User call() throws Exception {

                return service1.selectID(47);
            }
        };
        Callable<User> idInfo48 = new Callable<User>() {
            @Override
            public User call() throws Exception {

                return service1.selectID(48);
            }
        };

        Callable<User> idInfo46 = new Callable<User>() {
            @Override
            public User call() throws Exception {

                return service1.selectID(46);
            }
        };
        FutureTask<User> task1 = new FutureTask<>(idInfo46);
        new Thread(task1).start();
        FutureTask<User> task2 = new FutureTask<>(idInfo47);
        new Thread(task2).start();
        FutureTask<User> task3 = new FutureTask<>(idInfo48);
        new Thread(task3).start();
        List<User> list = new ArrayList<>();
        list.add(task1.get());
        list.add(task2.get());
        list.add(task3.get());
        long end = System.currentTimeMillis();
        System.out.println("总共花费时间:" + (end - start));

    }

    @GetMapping("futureAsync")
    public void futureAsync() {
        long start = System.currentTimeMillis();
        int x = 46;
        List<AllService> services = Arrays.asList(service1, service2, service3);
        ExecutorService executorService = Executors.newFixedThreadPool(Math.min(services.size(), 50));
        List<CompletableFuture<User>> completableFutures = services
                .stream()
                .map(service -> CompletableFuture.supplyAsync(service::selectID, executorService))
                .collect(toList());

        List<User> customerDetail = completableFutures
                .stream()
                .map(CompletableFuture::join)
                .collect(toList());
        System.out.println(customerDetail);
        long end = System.currentTimeMillis();
        System.out.println("总共花费时间:" + (end - start));
    }

}
