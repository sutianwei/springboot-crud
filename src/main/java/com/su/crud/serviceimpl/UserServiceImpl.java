package com.su.crud.serviceimpl;

import com.su.crud.dao.UserMapper;
import com.su.crud.pojo.User;
import com.su.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    UserMapper userMapper;

    @Override
    public User loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }

    @Override
    public User queryUserById(String id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public int addUser(User user) {
        int aFlag = userMapper.insertUser(user);
        return aFlag;
    }

    @Override
    public int dropUser(String id) {
        int dFlag = userMapper.deleteUser(id);
        return dFlag;
    }

    @Override
    public int modifyfUser(User user) {
        int mFlag = userMapper.updateUser(user);
        return mFlag;
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.getAllUser();
    }


}
