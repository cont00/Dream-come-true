package com.munggu.org;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FreeBoardController {
	private static final Logger logger = LoggerFactory.getLogger(FreeBoardController.class);
	
	@Autowired
	FreeBoardService fbs;
	
	@RequestMapping(value = "/FREEBOARD", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
//		fbs.doA();
		List<FreeBoardDTO> list = fbs.selectALL();
		model.addAttribute("list",list);
		
		return "freeboard";
	}
}
