package com.munggu.org;

import java.util.List;

public interface FreeBoardDAO {

	public List<FreeBoardDTO> selectAll();
	public void selectOne();
	public void insertOne();
	public void updateOne();
	public void deleteOne();
}
