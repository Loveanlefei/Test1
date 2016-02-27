package com.baidu.util;

public class UserDaoFactory {

    public static UserDao getUserDao()
    {
        return new UserDaoImpl();
    }
}
