package com.munggu.org.freeboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FreeBoardService {

	@Autowired
	FreeBoardDAO fbd;
	
	public void doA() {
		System.out.println("함수 호출입니다.");
	}
	
	public List<FreeBoardDTO> selectALL(Page page){
		return fbd.selectAll(page);
	}
	
	public int selectCnt() {
		return fbd.selectCntFreeBoard();
	}
	
	public FreeBoardDTO selectOne(FreeBoardDTO freeboardDto) {
		return fbd.selectOne(freeboardDto);
	}
	
}
