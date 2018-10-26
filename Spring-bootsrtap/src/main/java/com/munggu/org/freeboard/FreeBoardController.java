package com.munggu.org.freeboard;

import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FreeBoardController {
	private static final Logger logger = LoggerFactory.getLogger(FreeBoardController.class);
	
	@Autowired
	FreeBoardService fbs;
	
	@RequestMapping(value = "/FREEBOARD", method = RequestMethod.GET)
	public String home(Locale locale, Model model, @RequestParam(defaultValue="1") int pagenum) {
		int rownum = 0;
		if(pagenum != 1)
		{
			rownum = (pagenum - 1) * 10;
		}
		
		Page page = new Page();
		page.setPagenum(pagenum);
		page.setRownum(rownum);
		
		int rowcnt = fbs.selectCnt();
		page.setRowcnt(rowcnt);
		page.setPagecnt(rowcnt/10);
		
		List<FreeBoardDTO> list = fbs.selectALL(page);
		model.addAttribute("list",list);
		model.addAttribute("page",page);
		
		return "freeboard";
	}
	
	@RequestMapping(value = "/FREEBOARDVIEW", method = RequestMethod.GET)
	public String freeboardview(Locale locale, Model model, @RequestParam(defaultValue="1") int idx) {
		
		System.out.println("내용"+idx);
		FreeBoardDTO freeboardDto = new FreeBoardDTO();
		freeboardDto.setIdx(idx);
		
		model.addAttribute("freeboard",fbs.selectOne(freeboardDto));
		
		return "freeboardview";
	}
	
	
	
	
	
	
	
	
}
