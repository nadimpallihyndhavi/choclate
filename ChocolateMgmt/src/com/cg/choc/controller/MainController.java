package com.cg.choc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.choc.dto.Chocolate;
import com.cg.choc.service.IChocolateService;

@Controller
public class MainController 
{
	@Autowired
	IChocolateService service;
	
	@RequestMapping(value="run",method=RequestMethod.GET)
	public String sayHello()
	{
		return "Welcome";
	}
	
	@RequestMapping("insert")
	public String insert(@ModelAttribute("my") Chocolate chocolate){
		
		return "Insert";
		
	}
	@RequestMapping("insertChocAction")
	public ModelAndView insertChocolateList(@ModelAttribute("my") Chocolate chocolate)
	{
		Chocolate id = service.insertChocolate(chocolate);
		return new ModelAndView("success","id",id) ;
	}
	
	@RequestMapping(value="getAllChocolates")
	public String getChocolateList(Model model){
		List<Chocolate> list= service.getAllChocolates();
		model.addAttribute("list",list);
		return "home";
	}
	
}
