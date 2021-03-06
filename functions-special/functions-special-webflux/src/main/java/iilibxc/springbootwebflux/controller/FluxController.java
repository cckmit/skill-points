package iilibxc.springbootwebflux.controller;

import iilibxc.springbootwebflux.bean.Student;
import iilibxc.springbootwebflux.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class FluxController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/item")
    public Mono<Student> item(){
        return Mono.just(stuService.selectSimple());
    }

    @RequestMapping("/list")
    public Flux<Student> list(){
        return Flux.fromIterable(stuService.selectList());
    }
}
