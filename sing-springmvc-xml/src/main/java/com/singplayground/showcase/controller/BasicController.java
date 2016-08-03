package com.singplayground.showcase.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/basic")
public class BasicController {

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ModelAndView testController() throws Exception {
		System.out.println("this is test controller");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("basic/index");
		return mav;
	}

	@RequestMapping(value = "test2", method = RequestMethod.GET)
	@ResponseBody
	public HashMap testController2() throws Exception {
		System.out.println("this is test controller 2");
		HashMap hm = new HashMap();
		hm.put("status", "Y");
		return hm;
	}

}
