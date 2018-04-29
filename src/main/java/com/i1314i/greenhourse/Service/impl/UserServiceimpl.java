package com.i1314i.greenhourse.Service.impl;

import com.i1314i.greenhourse.Service.UserService;
import com.i1314i.greenhourse.Service.exception.UserException;
import com.i1314i.greenhourse.mapper.UserMapper;
import com.i1314i.greenhourse.po.User;
import com.i1314i.greenhourse.po.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-04-28 14:49
 **/
@Component("UserService")
public class UserServiceimpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean isUser(User user, HttpSession session)throws UserException {
        boolean status=false;
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<User> userssql= userMapper.selectByExample(userExample);

        if(userssql.size()==0){
            throw new UserException("用户名或密码不存在");
        }else{
            User usersq=userssql.get(0);
            if(user.getUsername().trim().equals(usersq.getUsername())&&user.getPassword().trim().equals(usersq.getPassword())){
               status=true;
                session.setAttribute("userid",usersq.getUid());
            }else{
                throw new UserException("用户名或者密码错误");
            }
        }
        return status;
    }
}
