package com.munggu.org;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FreeBoardDAOImpl implements FreeBoardDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<FreeBoardDTO> selectAll() {
		List<FreeBoardDTO> list = sqlSession.selectList("mappers.selectAllfreeBoard");
		return list;
	}

	@Override
	public void selectOne() {}

	@Override
	public void insertOne() {}

	@Override
	public void updateOne() {}

	@Override
	public void deleteOne() {}
}
