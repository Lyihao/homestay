package com.lyh.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;

import com.aaa.entity.customers;

@Mapper
public interface CustomersDao {
	@Select("select * from customers")
	public List<customers> query();
	
	@Select("select * from customers limit #{offset},#{pageSize}")
	public List<customers> queryPage(Integer offset, Integer pageSize);
}
