package com.bianyiit.service.Impl;

import com.bianyiit.dao.IUserDao;
import com.bianyiit.domain.User;
import com.bianyiit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao userDao;
    @Override
    public List<User> findAll() {
        List<User> all = userDao.findAll();
        return all;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
