package com.skni.workshopspring3.repo;

import com.skni.workshopspring3.repo.entity.CourseTypeEnum;
import com.skni.workshopspring3.repo.entity.GenderEnum;
import com.skni.workshopspring3.repo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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

    //    @Query(
//            value = "SELECT all s.* FROM student s JOIN course c ON s.course_id = c.id WHERE s.gender = ?1 " +
//                    "AND c.universityName = ?2",
//            nativeQuery = true)
    @Query(
            value = "SELECT distinct s.* FROM student s JOIN course c ON s.course_id = c.id WHERE s.gender = ?1 AND c.university_name = ?2 ",
            nativeQuery = true)
    List<Student> findAllByGenderAndUniversityName(String gender, String universityName);
}
