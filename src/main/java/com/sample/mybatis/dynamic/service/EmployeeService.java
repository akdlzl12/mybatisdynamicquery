package com.sample.mybatis.dynamic.service;

import java.util.List;

import com.sample.mybatis.dynamic.vo.Criteria;
import com.sample.mybatis.dynamic.vo.Employee;


public interface EmployeeService {

	public List<Employee> getAllSelect(Criteria c);
}
