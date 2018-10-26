package com.munggu.org.freeboard;

import java.util.List;

public interface FreeBoardDAO {

	public List<FreeBoardDTO> selectAll(Page pge);
	public int selectCntFreeBoard();
	public FreeBoardDTO selectOne(FreeBoardDTO freeboardDto);
	public void insertOne();
	public void updateOne();
	public void deleteOne();
}
