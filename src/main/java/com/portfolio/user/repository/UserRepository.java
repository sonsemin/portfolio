package com.portfolio.user.repository;

import com.portfolio.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 사용자 관련 repository
 * @author 손세민
 * @version 1.0.0
 * @since 2018-12-18 오후 11:35
**/
public interface UserRepository extends JpaRepository<User, String> {
}
