package com.chicago.controller;

import com.chicago.dao.UserRepository;
import com.chicago.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by color on 29.10.2016.
 */
@RestController
@RequestMapping("user")
public class UserController  extends CrudController<Users, Long>{
    @Autowired
    private UserRepository userRepository;

    @Override
    protected PagingAndSortingRepository<Users, Long> getRepository() {
        return userRepository;
    }
}