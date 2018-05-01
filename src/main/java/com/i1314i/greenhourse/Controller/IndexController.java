package com.i1314i.greenhourse.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * @author 平行时空
 * @created 2018-04-27 23:14
 **/
@Controller
public class IndexController {

    @RequestMapping("/data/index")
    public String Index(Model model, HttpServletRequest request)throws Exception{
        return "index";
    }
    @RequestMapping("login")
    public String login(Model model, HttpServletRequest request)throws Exception{
        return "login";
    }
    @RequestMapping("/data/index2")
    public String Index2(Model model, HttpServletRequest request)throws Exception{
        return "index2";
    }

}
