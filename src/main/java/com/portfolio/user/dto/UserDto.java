package com.portfolio.user.dto;

import com.portfolio.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class UserDto {

    private String userId;
    private String password;
    private String userName;
    private String phoneNumber;

    public UserDto(User entity) {
        this.userId = entity.getUserId();
        this.password = entity.getPassword();
        this.userName = entity.getUserName();
        this.phoneNumber = entity.getPhoneNumber();
    }

    public User toEntity(){
        return User.builder()
                .userId(userId)
                .password(password)
                .userName(userName)
                .phoneNumber(phoneNumber)
                .build();
    }
}
