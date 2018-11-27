package com.bsb.house.service.impls;

import com.bsb.house.common.model.User;
import com.bsb.house.mapper.IUserMapper;
import com.bsb.house.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zeng on 18-11-27.
 * @version 1.0
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
