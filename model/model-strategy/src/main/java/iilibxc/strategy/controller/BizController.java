package iilibxc.strategy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 模拟一次http调用
 */
@RestController
public class BizController {

    @Resource
    private BizService bizService;

    @PostMapping("/v1/biz/test1")
    public String test1(String order) {
        return bizService.getCheckResultComX(order, 3);
    }
}