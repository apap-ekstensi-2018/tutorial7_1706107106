package com.example.tutorial7consumer.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.tutorial7consumer.model.StudentModel;

@Service
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel student =
				 restTemplate.getForObject(
				 "http://localhost:8080/rest/student/view/"+npm,
				 StudentModel.class);
				 return student;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		List<StudentModel> listStudents = new ArrayList<StudentModel>();
		ResponseEntity<StudentModel[]> responseEntity = restTemplate.getForEntity("http://localhost:8080/rest/student/viewall", StudentModel[].class);
		StudentModel[] students = responseEntity.getBody();
		for (StudentModel studentModel : students) {
			listStudents.add(studentModel);
		}
		return listStudents;
	}

}
