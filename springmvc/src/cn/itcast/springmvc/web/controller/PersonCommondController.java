package cn.itcast.springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import cn.itcast.springmvc.web.domain.Person;

public class PersonCommondController extends AbstractCommandController {

	 //×¢²áÄ£ÐÍ
	public PersonCommondController()
	{
		this.setCommandClass(Person.class);
		this.setCommandName("person");
	}
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object commond, BindException arg3)
			throws Exception {
		Person p=(Person)commond;
		System.out.println("person:"+p);
		return new ModelAndView("index");
				
	}

}
