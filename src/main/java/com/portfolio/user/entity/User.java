package com.portfolio.user.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User {

    @Id
    @Column(name = "USER_ID",length = 50 , nullable = false)
    private String userId;

    @Column(name = "PASSWORD", length = 50 , nullable = false)
    private String password;

    @Column(name = "USER_NAME", length = 20,nullable = false)
    private String userName;

    @Column(name = "PHONE_NUMBER" , length = 20)
    private String phoneNumber;

    @Builder
    public User(String userId, String password, String userName, String phoneNumber) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }
}
