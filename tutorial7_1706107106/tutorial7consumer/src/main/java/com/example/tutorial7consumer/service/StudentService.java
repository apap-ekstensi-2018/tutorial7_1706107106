package com.example.tutorial7consumer.service;

import java.util.List;
import com.example.tutorial7consumer.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	List<StudentModel> selectAllStudents();
	void addStudent(StudentModel student);
	boolean deleteStudent(String npm);
	void updateStudent(StudentModel student);
}
