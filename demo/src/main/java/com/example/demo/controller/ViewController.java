package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	
	@GetMapping("/{urlId1}")
	public ModelAndView viewController(@PathVariable("urlId1") String urlId1, @RequestParam Map<String,Object> param, ModelAndView mv) {
		
		mv.addObject("param", param);
		mv.setViewName(urlId1);
		
		return mv;
	}
	
	@GetMapping("favicon.ico")
    @ResponseBody
    void returnNoFavicon() {
    }
}
