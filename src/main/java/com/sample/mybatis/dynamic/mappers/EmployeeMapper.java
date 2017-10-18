package com.sample.mybatis.dynamic.mappers;

import java.util.List;

import com.sample.mybatis.dynamic.vo.Criteria;
import com.sample.mybatis.dynamic.vo.Employee;

public interface EmployeeMapper {

	public List<Employee> getAllSelect(Criteria c);
}
