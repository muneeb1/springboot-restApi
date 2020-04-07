package springboot.app.courses;

import org.springframework.data.repository.CrudRepository;
/*
 * CrudRepository gives crud of given class/table id
 * 
 * */
public interface CourseRepository extends CrudRepository<Course, String> {

}
