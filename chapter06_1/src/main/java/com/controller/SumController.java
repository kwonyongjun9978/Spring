package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;

@Controller
public class SumController {
	
	//@RequestMapping(value="/input.do", method=RequestMethod.GET)
	@GetMapping(value="/input.do")
	public String input() {
		return "sum/input";
	}
	
	//@RequestMapping(value="/result.do", method=RequestMethod.POST)
//	@PostMapping(value="/result.do")
//	public String result() {
//		return "sum/result";
//	}
	
//	@PostMapping(value="/result.do")
//	public ModelAndView result(int x, int y) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x", x);
//		mav.addObject("y", y);
//		mav.addObject("sum", x+y);
//		mav.setViewName("sum/result");
//		return mav;
//	}
	
	// 400error방지
//	@PostMapping(value="/result.do")
//	public ModelAndView result(@RequestParam(required = false, defaultValue = "0") String x, 
//							   @RequestParam(required = false, defaultValue = "0") String y) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x", x);
//		mav.addObject("y", y);
//		mav.addObject("sum", Integer.parseInt(x)+Integer.parseInt(y));
//		mav.setViewName("sum/result");
//		return mav;
//	}
	
//	@PostMapping(value="/result.do")
//	public String result(@RequestParam Map<String, String> map, ModelMap modelMap) {
//		modelMap.put("x", map.get("x"));
//		modelMap.put("y", map.get("y"));
//		modelMap.put("sum", Integer.parseInt(map.get("x")) + Integer.parseInt(map.get("y")));
//		return "sum/result";
//	}
	
	@PostMapping(value="/result.do")
	public String result(@ModelAttribute SumDTO sumDTO, Model model) {
		int sum = sumDTO.getX() + sumDTO.getY();
		sumDTO.setSum(sum);
		
		model.addAttribute("x", sumDTO.getX());
		model.addAttribute("y", sumDTO.getY());
		model.addAttribute("sum", sumDTO.getSum());
		return "sum/result";
	}
}
