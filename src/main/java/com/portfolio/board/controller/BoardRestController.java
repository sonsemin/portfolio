package com.portfolio.board.controller;

import com.portfolio.board.dto.BoardDto;
import com.portfolio.board.entity.Board;
import com.portfolio.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardRestController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public List<Board> list(){

        return boardService.list();
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public void saveBoard(@RequestBody BoardDto dto){

        boardService.saveBoard(dto);
    }
}
