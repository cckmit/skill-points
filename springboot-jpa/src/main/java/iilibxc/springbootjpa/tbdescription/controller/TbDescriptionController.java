package iilibxc.springbootjpa.tbdescription.controller;

import iilibxc.springbootjpa.tbdescription.pojo.TbDescription;
import iilibxc.springbootjpa.tbdescription.vo.TbDescriptionVo;
import iilibxc.springbootjpa.tbdescription.service.TbDescriptionService;
import iilibxc.springbootjpa.common.controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tbDescription/")
public class TbDescriptionController extends CommonController<TbDescriptionVo, TbDescription, Integer> {
    @Autowired
    private TbDescriptionService tbDescriptionService;
}
