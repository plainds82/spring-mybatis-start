package com.test.mybatis2.dao;

import com.test.mybatis2.dto.UserDTO;

import java.util.List;

public interface UserDAO {
    List<UserDTO> selectUsers(UserDTO param) throws Exception;
}
