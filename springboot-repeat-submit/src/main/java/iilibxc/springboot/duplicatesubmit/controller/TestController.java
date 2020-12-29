package iilibxc.springboot.duplicatesubmit.controller;

import iilibxc.springboot.duplicatesubmit.annotation.DuplicateSubmitToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @description
 */
@RestController
public class TestController {

    @DuplicateSubmitToken(type = DuplicateSubmitToken.REQUEST)
    @RequestMapping(value = "/test/d", method = RequestMethod.GET)
    public Map<String, Object> test (HttpServletRequest request) throws Exception {

        /*Random r=new Random();
        int i = r.nextInt(3);
        if (i==2){
            throw new DuplicateSubmitException("=======duplicate submit exception=====");
        }*/

        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("request Url", request.getRequestURL());
        map.put("request Url", request.getRequestURL());
        return map;
    }

}