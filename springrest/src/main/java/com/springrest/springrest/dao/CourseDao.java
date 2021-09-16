package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> {

}
