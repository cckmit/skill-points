package iilibxc.springbootmybatisplus.tbdescription.controller;

import iilibxc.springbootmybatisplus.common.controller.CommonController;
import iilibxc.springbootmybatisplus.tbdescription.entity.TbDescription;
import iilibxc.springbootmybatisplus.tbdescription.entity.TbDescriptionVo;
import iilibxc.springbootmybatisplus.tbdescription.service.TbDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
@RequestMapping("/tbDescription/")
public class TbDescriptionController extends CommonController<TbDescriptionVo,TbDescription> {

    @Autowired
    private TbDescriptionService tbDescriptionService;

}