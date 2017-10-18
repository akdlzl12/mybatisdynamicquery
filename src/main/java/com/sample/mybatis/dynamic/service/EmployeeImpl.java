package com.sample.mybatis.dynamic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.mybatis.dynamic.mappers.EmployeeMapper;
import com.sample.mybatis.dynamic.vo.Criteria;
import com.sample.mybatis.dynamic.vo.Employee;

@Service
public class EmployeeImpl implements EmployeeService{

	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllSelect(Criteria c) {
		
		return employeeMapper.getAllSelect(c);
	}
}
