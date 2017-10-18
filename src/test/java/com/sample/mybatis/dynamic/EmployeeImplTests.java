package com.sample.mybatis.dynamic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.mybatis.dynamic.service.EmployeeService;
import com.sample.mybatis.dynamic.vo.Criteria;
import com.sample.mybatis.dynamic.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/spring/app-context.xml"})
public class EmployeeImplTests {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void getAllSelect() {
		Criteria c = new Criteria();
		
		c.setJobs(Arrays.asList("IT_PROG", "ST_MAN"));

		List<Employee> employees = employeeService.getAllSelect(c);
		assertEquals(10, employees.size());
	}
}
