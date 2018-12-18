package com.portfolio.board;

import com.portfolio.board.entity.Board;
import com.portfolio.board.repository.BoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void test(){
        boardRepository.save(Board.builder()
        .title("제목입니다")
        .userId("sonsemin")
        .build());
    }
}
