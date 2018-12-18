package com.portfolio.user.service;

import com.portfolio.user.dto.UserDto;
import com.portfolio.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 사용자 관련 서비스
 * @author 손세민
 * @version 1.0.0
 * @since 2018-12-18 오후 11:34
 **/

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> list(){
        return userRepository.findAll().stream()
                .map(UserDto::new)
                .collect(Collectors.toList());
    }

    public void save(UserDto dto){
        userRepository.save(dto.toEntity());
    }
}
