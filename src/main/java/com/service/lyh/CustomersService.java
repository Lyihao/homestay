package com.service.lyh;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.lyh.CustomersDao;
import com.entity.lyh.customers;


@Service
public class CustomersService {
	@Resource
	CustomersDao dao;

	public List<customers> query(){
		return dao.query();
	}
	public List<customers> queryPage(Integer offset, Integer pageSize){
		return dao.queryPage(offset, pageSize);
	}
}
