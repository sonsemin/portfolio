package com.portfolio.board.dto;

import com.portfolio.board.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BoardDto {

    private String title;
    private String user_id;

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .userId(user_id)
                .build();
    }
}
