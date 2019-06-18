package com.lyh.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.customers;
import com.lyh.service.CustomersService;

@Controller
public class CustomersController {
	@Resource
	CustomersService service;
	
	@RequestMapping(value="topageCus")
	public String topageCus(){
		return "back/Customerslist";
	}
	
	@RequestMapping(value="CusQuery")
	@ResponseBody
	public List<customers> query(){
		return service.query();
	}
	
	
	@RequestMapping(value="CusQueryPage")
	@ResponseBody
	public List<customers> CusQueryPage(Integer offset,Integer pageSize){
		
		return service.queryPage(offset, pageSize);
	}
	
}
