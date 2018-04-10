package com.example.tutorial7producer.service;

import java.util.List;
import com.example.tutorial7producer.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	List<StudentModel> selectAllStudents();
	void addStudent(StudentModel student);
	boolean deleteStudent(String npm);
	void updateStudent(StudentModel student);
}
