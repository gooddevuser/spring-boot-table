package com.mytable.bootboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytable.bootboard.mapper.BoardMapper;
import com.mytable.bootboard.vo.Board;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<Board> showList() {
		List<Board> boards = boardMapper.showList();
		return boards;
	}

	@Override
	public void doWrite(Board board) {
		boardMapper.doWrite(board);
		
	}


}
