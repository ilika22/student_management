package com.institute.student.service;

import java.util.List;

import com.institute.student.entity.Student;
import com.institute.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
     private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Save Student
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    // Delete Student
    public void deleteStudent(Long id) {

        studentRepository.deleteById(id);
    }

}
