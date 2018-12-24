package com.portfolio.user.controller;

import com.portfolio.user.dto.UserDto;
import com.portfolio.user.entity.User;
import com.portfolio.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 사용자관련 컨트롤러
 *
 * @author 손세민
 * @version 1.0.0
 * @since 2018-12-18 오후 11:34
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<UserDto> list() {
        return userService.list();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestBody UserDto dto) throws Exception {
        userService.save(dto);
    }

}
