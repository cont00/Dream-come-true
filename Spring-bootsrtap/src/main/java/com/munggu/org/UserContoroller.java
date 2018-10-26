package com.munggu.org;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.omg.CORBA.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserContoroller {
	private static final Logger logger = LoggerFactory.getLogger(UserContoroller.class);
	
	@Autowired
	SqlSession sqlsession;
	
	@RequestMapping(value = "/User/List", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		List<User> list = sqlsession.selectList("mappers.selectAllUser");
		
		for(int i =0; i< list.size() ; i++) {
			System.out.println(list.get(i).toString());
		}
		
		model.addAttribute("userlist", list);
		
		return "userlist";
	}
	
}
