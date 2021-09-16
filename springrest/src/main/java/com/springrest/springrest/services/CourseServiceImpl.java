package com.springrest.springrest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	
//	List<Courses> list;
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Courses(145,"java core course","contains basics of java"));
//		list.add(new Courses(146,"spring boot course","contains spring boot"));
	}
	@Override
	public List<Courses> getCourses() {
		
//		return list;
		return courseDao.findAll();
	}
	@Override
	public Courses getCourseById(long courseId) {
//		Courses c=null;
//		for(Courses course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
	//	return c;
		
		return courseDao.getOne(courseId);
	}
	@Override
	public Courses addCourse(Courses course) {
		//list.add(course);
		//return course;
		
		courseDao.save(course);
		return course;
	}
	@Override
	public Courses updateCourse(Courses course) 
	{
//	  list.forEach(e->{
//		  if(e.getId()==course.getId())
//		  {
//			e.setTitle(course.getTitle());
//			e.setDescription(course.getDescription());
//		  }
//	  });	
	  //return course;
		
		return courseDao.save(course);
	}
	@Override
	public void deleteCourse(long parseLong) {
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Courses entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
