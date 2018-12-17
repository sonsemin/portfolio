package com.portfolio.board.entity;

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
public class Board {

    @Id
    @GeneratedValue // pk값으로 자동생성처리
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 20,nullable = false)
    private String user_id;

    @Builder
    public Board(String title, String user_id) {
        this.title = title;
        this.user_id = user_id;
    }
}
