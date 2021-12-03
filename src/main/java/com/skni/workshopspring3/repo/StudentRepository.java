package com.skni.workshopspring3.repo;

import com.skni.workshopspring3.repo.entity.CourseTypeEnum;
import com.skni.workshopspring3.repo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Override
    List<Student> findAllByGenderAndCourse_CourseType(String lastName, CourseTypeEnum courseType);

    @Override
    List<Student> findAll();

    List<Student> findAllByLastname(String lastName);

}