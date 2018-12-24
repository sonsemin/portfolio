package com.portfolio.user.service;

import com.portfolio.system.exception.UserException;
import com.portfolio.user.dto.UserDto;
import com.portfolio.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NotContextException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 사용자 관련 서비스
 * @author 손세민
 * @version 1.0.0
 * @since 2018-12-18 오후 11:34
 **/

@AllArgsConstructor
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<UserDto> list(){
        return userRepository.findAll().stream()
                .map(UserDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void save(UserDto dto) throws Exception{

        if ( userRepository.findById(dto.getUserId()) != null )
        {
            throw new UserException("사용자 예외처리!!!");
        }

        userRepository.save(dto.toEntity());
    }
}
