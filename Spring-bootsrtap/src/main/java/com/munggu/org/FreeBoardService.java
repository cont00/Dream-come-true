package com.munggu.org;

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
	
	public List<FreeBoardDTO> selectALL(){
		return fbd.selectAll();
	}
	
}
