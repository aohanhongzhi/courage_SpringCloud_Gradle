package cn.hxy.user.ch.hxy.user.service;

import hxy.courage.entity.user.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    public User login()
    {
        User user = new User();
        user.setUserId(1);
        user.setUserName("eric");
        return user;
    }
}
