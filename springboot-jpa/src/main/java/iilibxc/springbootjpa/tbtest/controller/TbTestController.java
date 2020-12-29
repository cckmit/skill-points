package iilibxc.springbootjpa.tbtest.controller;

import iilibxc.springbootjpa.common.controller.*;
import iilibxc.springbootjpa.tbtest.pojo.TbTest;
import iilibxc.springbootjpa.tbtest.vo.TbTestVo;
import iilibxc.springbootjpa.tbtest.service.TbTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tbTest/")
public class TbTestController extends CommonController<TbTestVo, TbTest, Integer> {
    @Autowired
    private TbTestService tbTestService;
}
