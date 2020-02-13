package com.duck.myapp.visualize_quality_data;

import java.util.List;
import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.duck.myapp.vo.WineVO;
import com.duck.myapp.service.WineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private WineService service;
	
	@RequestMapping(value = "/dateIncome", method = RequestMethod.GET)
	public String dateIncome(Locale locale, Model model) {
		return "dateIncome";

	}
	
	@RequestMapping(value = "/restex", method = RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public @ResponseBody String incomeList(Locale locale, Model model) throws Exception {
		Gson gson = new Gson();
		List<WineVO> list = service.selectWine();
		return gson.toJson(list);
	}


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
	 * home(Locale locale, Model model) throws Exception { logger.info("home");
	 * 
	 * List<WineVO> WineList = service.selectWine();
	 * 
	 * model.addAttribute("WineList", WineList);
	 * 
	 * return "home"; }
	 */
	
}
