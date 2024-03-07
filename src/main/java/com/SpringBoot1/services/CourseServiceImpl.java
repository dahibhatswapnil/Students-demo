package com.SpringBoot1.services;

import com.SpringBoot1.Repo.CourseDao;
import com.SpringBoot1.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class CourseServiceImpl implements CourseService{
  @Autowired
    private CourseDao courseDao;
    //List<Course> list;
    public CourseServiceImpl(){
//        list= new ArrayList<>();
//        list.add(new Course(150,"jslfsl","jslsl"));
//        list.add(new Course(250,"ksjjfkd","kjskfk"));

    }
    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
    }

   //@Override
//    public Course getCourse(Long id) {
////        Course c =null;
////        for (Course course :list){
////            if (course.getId() == courseId){
////                c =course;
////                break;
////            }
////        }
//
//        return courseDao.findById(id).orElse(null);
//    }
   public Optional<Course> findById(Long Id) {
       return courseDao.findById(Id);
   }

    @Override
    public Course addCourse(Course course) {
        //list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e ->{
//            if (e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parselong) {
       // list=this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
        Course entity = courseDao.getOne(parselong);
        courseDao.delete(entity);
    }
}
