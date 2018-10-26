package com.cont00.org;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private Nanum nanum = new Nanum();

	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		nanum.doA();
		nanum.doB();
		System.out.println(nanum.getAddr());

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("MyName", "HynuNo Kim");

		return "home";
	}

	@RequestMapping(value = "/Lotto", method = RequestMethod.GET)
	public String lotto(Locale locale, Model model) {
		model.addAttribute("lottoNumber", "12, 18, 19, 29, 31, 39 + 7");

		return "lotto";
	}

	@RequestMapping(value = "/LottoNumber1")
	@ResponseBody
	public String lottonumber1(Locale locale, Model model) {
		return "LottoNumber 1";
	}

	@RequestMapping(value = "/LottoNumber2")
	@ResponseBody
	public String lottonumber2(Locale locale, Model model) {
		return "LottoNumber 2";
	}

	@RequestMapping(value = "/LottoNumber3")
	@ResponseBody
	public String lottonumber3(Locale locale, Model model) {
		return "LottoNumber 3";
	}
}