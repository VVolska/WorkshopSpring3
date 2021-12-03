package com.skni.workshopspring3.service;

import com.skni.workshopspring3.repo.CourseRepository;
import com.skni.workshopspring3.repo.entity.Course;
import com.skni.workshopspring3.repo.entity.CourseTypeEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course addCourse(String faculty, int semester, String universityName, CourseTypeEnum courseType){

        Course course = Course.builder()
                .faculty(faculty)
                .semester(semester)
                .universityName(universityName)
                .courseType(courseType)
                .build();

        //nadanie ID
        return courseRepository.save(course);
    }
}
