package com.munggu.org;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.omg.CORBA.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	/*
	 *	xml 에 bean 태그사용 객체 생성
	 *
	 *  @Component 어노테이션을 이용해서 객체를 생성
	 *  @Contorller -> url 맵핑 하는 역활을 하는 객체를 생성
	 *  @Service -> dao객체를 호출하면서 세션을 등록 쿠키를 등록 객체
	 *  @Repository -> dao객체 생성하는 역활
	 */
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Nanum nanum;
	
	@Autowired
	private A a;
	
	@Autowired
	private B b;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		HomeController homecontoller = new HomeController();
//		logger.info("Welcome home! The client locale is {}.", locale);
		
//		nanum.doA();
//		nanum.doB();

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("MyName", "박명회" );
		
		return "home";
	}
	
	@RequestMapping(value = "/LOTTO", method = RequestMethod.GET)
	public String lotto(Locale locale, Model model) {
		
		model.addAttribute("lottoNumber", "01, 22, 47, 46" );
		
		return "lotto";
	}
	
	@RequestMapping(value = "/LOTTONUMBER1{idx}")
	@ResponseBody
	public String lottoNumber1(Locale locale, Model model, @RequestParam String lottoNumber
			, @PathVariable int idx) {
		System.out.println(lottoNumber);
		System.out.println(idx);
		return nanum.getNumber(lottoNumber);//json 리턴
	}
	
	@RequestMapping(value = "/LOTTONUMBER2")
	@ResponseBody
	public String lottoNumber2(Locale locale, Model model) {
		return "bbbbbbbbbbbb";
	}
	
	@RequestMapping(value = "/LOTTONUMBER3")
	@ResponseBody
	public String lottoNumber3(Locale locale, Model model) {
		return "cccccccccccc";
	}
	
	@RequestMapping(value = "/DIV")
	@ResponseBody
	public String div(Locale locale, Model model) {
		return "<div><ul><li>aaaaa1</li></ul><ul><li>bbb2</li></ul></div>";
	}

	/*
	 * 
	 * mybatis 설정
	 * select * from user;
	 * 1. pom.xml mybatis jar 추가하고, mysql-connector.jar 추가
	 * 2. sqlSession 객체를 생성을 servlet-content.xml 추가
	 * 3. sql.xml 파일을 작성하고
	 * 4. java 테스트를 진행
	 * 
	 */
	
}
