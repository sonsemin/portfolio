package com.portfolio.board.service;

import com.portfolio.board.dto.BoardDto;
import com.portfolio.board.entity.Board;
import com.portfolio.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> list(){
        return boardRepository.findAll();
    }

    public void saveBoard(BoardDto dto){
        boardRepository.save(dto.toEntity());
    }
}
