package com.mytable.bootboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mytable.bootboard.vo.Board;

@Mapper
public interface BoardMapper {

	List<Board> showList();

	void doWrite(Board board);
	
}
