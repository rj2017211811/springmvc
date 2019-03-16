package cn.itcast.springmvc.web.controller;

import org.springframework.web.servlet.mvc.SimpleFormController;

import cn.itcast.springmvc.web.domain.Person;

public class PersonFormController extends SimpleFormController {
	public PersonFormController()
	{
		this.setCommandClass(Person.class);
		this.setCommandName("person");
	}
	@Override
	protected void doSubmitAction(Object command) throws Exception {
		Person p=(Person)command;
		
		System.out.println("p:"+p);
	}
	
}
