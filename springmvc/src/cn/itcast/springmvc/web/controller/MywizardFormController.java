package cn.itcast.springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import cn.itcast.springmvc.web.domain.Person;

public class MywizardFormController extends AbstractWizardFormController {
    public MywizardFormController()
    {
    	this.setCommandClass(Person.class);
    	this.setCommandName("person");
    }
	@Override
	protected ModelAndView processFinish(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			BindException arg3) throws Exception {
		// TODO Auto-generated method stub
		Person p=(Person)arg2;
		
		System.out.println("p"+p);
		return new ModelAndView("index");
	}
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("wizard/personBaseInfo");
	}
	
	

}
