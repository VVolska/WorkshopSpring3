package com.skni.workshopspring3.repo;

import com.skni.workshopspring3.repo.entity.CourseTypeEnum;
import com.skni.workshopspring3.repo.entity.GenderEnum;
import com.skni.workshopspring3.repo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByGenderAndCourse_CourseType(GenderEnum gender, CourseTypeEnum courseType);

    @Override
    List<Student> findAll();

    @Override
    Optional<Student> findById(Long id);

    List<Student> findAllByLastname(String lastName);

    @Override
    void delete(Student student);
}