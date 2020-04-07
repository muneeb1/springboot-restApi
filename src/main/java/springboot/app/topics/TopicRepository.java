package springboot.app.topics;

import org.springframework.data.repository.CrudRepository;
/*
 * CrudRepository gives crud of given entity and id
 * 
 * */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
