package com.compro.miu.compro.service.impl;

import com.compro.miu.compro.domain.Student;
import com.compro.miu.compro.repository.StudentRepository;
import com.compro.miu.compro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return null;
    }
}
