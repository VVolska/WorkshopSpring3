package com.skni.workshopspring3.repo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name="course")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "semester")
    private int semester;

    @Column(name = "universityName")
    private String universityName;

    @Enumerated(EnumType.STRING)
    @Column(name = "courseType")
    private CourseTypeEnum courseType;
}
