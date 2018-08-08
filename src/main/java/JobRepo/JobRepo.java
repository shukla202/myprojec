package JobRepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Job;
import com.mongodb.client.MongoDatabase;

@Repository
public interface JobRepo  extends MongoRepository<Job, String>{
	
	

}
