package com.mytable.bootboard.service;

import java.util.List;

import com.mytable.bootboard.vo.Board;

public interface BoardService {

	List<Board> showList();

	void doWrite(Board board);

}
