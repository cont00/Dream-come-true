package com.munggu.org.freeboard;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FreeBoardDAOImpl implements FreeBoardDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<FreeBoardDTO> selectAll(Page page) {
		List<FreeBoardDTO> list = sqlSession.selectList("mappers.selectAllfreeBoard", page);
		return list;
	}

	@Override
	public FreeBoardDTO selectOne(FreeBoardDTO freeboardDto) {
		return sqlSession.selectOne("mappers.selectOne",freeboardDto);
	}

	@Override
	public void insertOne() {}

	@Override
	public void updateOne() {}

	@Override
	public void deleteOne() {}

	@Override
	public int selectCntFreeBoard() {
		int cnt = sqlSession.selectOne("mappers.selectCntfreeBoard");
		return cnt;
	}
}
