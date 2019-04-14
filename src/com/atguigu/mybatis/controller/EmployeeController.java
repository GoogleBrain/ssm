package com.atguigu.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.mybatis.bean.Student;
import com.atguigu.mybatis.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/getemps")
	public String emps(Map<String, Object> map) {
		List<Student> emps = employeeService.getEmps();
		map.put("allEmps", emps);
		return "list";
	}

}
