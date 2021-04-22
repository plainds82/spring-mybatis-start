package com.test.mybatis2.controller;

import com.test.mybatis2.dao.UserDAO;
import com.test.mybatis2.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserDAO userDAO;

    @RequestMapping("/users")
    public List<UserDTO> users(@RequestParam(value = "author", defaultValue = "") String author) throws Exception {
        UserDTO param = new UserDTO(0L, null, null, null, author, null);
        List<UserDTO> list = userDAO.selectUsers(param);
        return list;
    }
}
