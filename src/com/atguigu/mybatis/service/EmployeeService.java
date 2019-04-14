package com.atguigu.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.mybatis.bean.Student;
import com.atguigu.mybatis.dao.StudentMapper;

@Service
public class EmployeeService {

	@Autowired
	private StudentMapper employeeMapper;

	@Transactional
	public List<Student> getEmps() {

		employeeMapper.insert();
		employeeMapper.insert();
		//
		return employeeMapper.getEmps();
	}

}
