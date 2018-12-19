package cn.edu.hrbeu.secondhandsoftwaretestclass.service;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.User;
import cn.edu.hrbeu.secondhandsoftwaretestclass.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;
    }
    public User findUserByPhoneAndStudentId(User user){
        User user1 = userMapper.findUserByPhoneAndStudentId(user);
        return user1;
    }
    public User findUserByStudentIdAndPassword(User user){
        return userMapper.findUserByStudentIdAndPassword(user);
    }
}
