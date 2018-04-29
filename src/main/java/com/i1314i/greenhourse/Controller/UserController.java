package com.i1314i.greenhourse.Controller;

import com.i1314i.greenhourse.Service.UserService;
import com.i1314i.greenhourse.Service.exception.UserException;
import com.i1314i.greenhourse.po.JsonResult;
import com.i1314i.greenhourse.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 平行时空
 * @created 2018-04-28 14:44
 **/
@RestController
public class UserController {
    Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    private JsonResult msg=null;

    @RequestMapping(value = "/logincheck",method = {RequestMethod.POST})
    public JsonResult login(@RequestBody User user, HttpServletRequest request) {
        msg=new JsonResult();
        boolean staus=false;
        HttpSession session=request.getSession();
        try{
           staus= checked(user,session);
        } catch (UserException e) {
            msg.setMsg(e.getMessage());
            msg.setSuccess(0);
        }

        if(staus){
            try {
                if(userService.isUser(user,session)){
                    msg.setSuccess(1);
                    msg.setMsg("success");
                    logger.info(user.getUsername()+":登陆成功");
                    System.out.println("登陆成功");
                }
            } catch (UserException e) {
                msg.setSuccess(0);
                msg.setMsg(e.getMessage());
                logger.info(user.getUsername()+":登录失败 "+e.getMessage());
            }
        }
        return msg;
    }

    public boolean checked(User user,HttpSession session) throws UserException {
        String verCode= (String) session.getAttribute("verCode");
        if(user!=null){
            if(user.getUsername().trim().equals("")&&user.getUsername()==null){
                throw new UserException("用户名不能为空");
            }else if(user.getPassword()==null&&user.getPassword().trim().equals("")){
                throw new UserException("密码不能为空");
            }else if(!user.getVerifycode().trim().equals(verCode)){
                throw new UserException("验证码不正确");
            }
        }
        return true;
    }
}
