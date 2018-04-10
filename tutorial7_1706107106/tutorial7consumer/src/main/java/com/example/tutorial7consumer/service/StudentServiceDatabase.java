package com.example.tutorial7consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tutorial7consumer.dao.StudentMapper;
import com.example.tutorial7consumer.model.StudentModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteStudent(String npm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateStudent(StudentModel student) {
		// TODO Auto-generated method stub

	}

}
