package iilibxc.future.controller;

import iilibxc.future.service.Service1;
import iilibxc.future.service.Service2;
import iilibxc.future.service.Service3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
            service1.selectID(46);
            service1.selectID(47);
            service1.selectID(48);
            long e = System.currentTimeMillis();
            System.out.println("e-s:" + (e - s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping
    public void testFuture(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);

    }

}
