package com.bsb.house.mapper;

import com.bsb.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zeng on 18-11-27.
 * @version 1.0
 */
@Mapper
public interface IUserMapper {

    List<User> selectUsers();

}
