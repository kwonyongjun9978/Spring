package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() { //사용자 콜백 메소드
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Hello Spring !!"); //request.setAttribute("result", "Hello Spring !!"); 와 같은 의미
		//mav.setViewName("hello"); // 파일명 지정
		mav.setViewName("/view/hello"); // 폴더/파일명 지정
		//http://localhost:8080/chapter06/view/hello.jsp 호출
		return mav;
	}	
	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET)
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("result2", "Have a nice day!!");
		mav.setViewName("/WEB-INF/view2/hello2");
		//http://localhost:8080/chapter06/WEB-INF/view2/hello2.jsp 호출 안된다.
		return mav;
	}
	
	@RequestMapping(value="/hello3.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	@ResponseBody //return값이 단순 문자열로 변경된다.
	public String hello3() {
		//return "Welcome";
		return "안녕하세요";
	}
	
	//스프링에서는 return타입이 String 이면 단순 문자열이 아니라, 파일명으로 인식한다.
	//스프링은 Welcome.jsp 파일을 찾는다.
	//만약 단순 문자열로 웹 브라우저에 나타내려면 @ResponseBody를 써야한다.
}

/*
콜백 메소드
- 어떤 때가 되면 운영체제, 스프링에 의해서 호출되는 메소드
*/

/*
http://localhost:8080/Context명(Project명)/hello.do 요청

DispatcherServlet
	↕ HandlerMapping
HelloController.java
*/
