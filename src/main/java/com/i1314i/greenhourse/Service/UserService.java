package com.i1314i.greenhourse.Service;

import com.i1314i.greenhourse.Service.exception.UserException;
import com.i1314i.greenhourse.po.User;

import javax.servlet.http.HttpSession;

/**
 * @author 平行时空
 * @created 2018-04-28 14:49
 **/
public interface UserService {
    boolean isUser(User user,HttpSession session) throws UserException;
}
