package com.lyh.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.rent;
import com.lyh.service.rentService;

@Controller
public class rentController {
	@Resource
	rentService service;
	
	@RequestMapping(value="topageRent")
	public String topageRent(){
		return "back/rentlist";
	}
	
	
	@RequestMapping(value="rentquery")
	@ResponseBody
	public List<rent> query(){
		System.out.println(service.query());
		return service.query();
	}
	
	@RequestMapping(value="add")
	@ResponseBody
	public Integer add(rent r){
		return service.add(r);
	}
	
	
	@RequestMapping(value="update")
	@ResponseBody
	public Integer update(rent r){
		return service.update(r);
	}
	
	@RequestMapping(value="del")
	@ResponseBody
	public Integer del(Integer rentid){
		return service.del(rentid);
	}
}
