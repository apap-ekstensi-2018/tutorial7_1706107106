package com.example.tutorial7producer.dao;

import java.util.List;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.example.tutorial7producer.model.StudentModel;

@Mapper
public interface StudentMapper {
	@Select("select npm, name, gpa from student where npm = #{npm}")
    StudentModel selectStudent (@Param("npm") String npm);

    @Select("select npm, name, gpa from student")
    List<StudentModel> selectAllStudents ();

    @Insert("INSERT INTO student (npm, name, gpa) VALUES (#{npm}, #{name}, #{gpa})")
    void addStudent (StudentModel student);
    
    @Delete("DELETE FROM student where npm = #{npm}")
    void deleteStudent (@Param("npm")String npm);
    
    @Update("UPDATE student set name = #{name}, gpa = #{gpa} where npm = #{npm}")
    void updateStudent (StudentModel student);
}
