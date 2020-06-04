package com.su.crud.service;

import com.su.crud.pojo.User;

import java.util.List;

public interface UserService {

    /*
    登录i信息核对
     */
    User loginIn(String name, String password);

    /*
     * 用户查询
     * */
    User queryUserById(String id);

    int  addUser(User  user);

    /*
     * 删除用户
     * */
    int dropUser(String id);

    /*
     * 修改用户
     * */
    int modifyfUser(User user);


    List<User> queryAllUser();

}
