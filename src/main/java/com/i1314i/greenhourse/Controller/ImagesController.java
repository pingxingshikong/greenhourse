package com.i1314i.greenhourse.Controller;

import com.i1314i.greenhourse.utils.VerifyCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 平行时空
 * @created 2018-04-28 15:11
 **/

@RestController
public class ImagesController {

    @RequestMapping(value = "/getimages")
    public void getImage(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setHeader("contentType", "text/html; charset=utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //存入会话session
        HttpSession session = request.getSession(true);
        //删除以前的
        session.removeAttribute("verCode");
        session.setAttribute("verCode", verifyCode.toLowerCase());
        //生成图片
        int w = 150, h = 37;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

    @RequestMapping(value = "/verifycodeValidate", method = {RequestMethod.GET, RequestMethod.POST})
    public boolean verifycode(String verifycode, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String verify = (String) session.getAttribute("verCode");
        if (verify.equalsIgnoreCase(verifycode)) {
            return true;
        } else
            return false;
    }
}
