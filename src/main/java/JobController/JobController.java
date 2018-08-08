package JobController;


import java.util.List;

import net.bytebuddy.description.type.TypeDefinition.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Job;
import com.sun.el.stream.Optional;

import JobRepo.JobRepo;

@RequestMapping("/user")
@RestController
public class JobController {
	
	private static org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager
			.getLogger(JobController.class);
	
	@Autowired
	private JobRepo jobRepo;
	
	@Autowired
	private BaseController basecontroller;
	
	@RequestMapping(method = RequestMethod.POST, value = "/job")
	public ResponseEntity<?> postJob(@RequestBody Job job) {
		if (job == null)
			return basecontroller.newresponseNotAcceptable(logger, "job is null");
		Job createdJob = null;
		createdJob = jobRepo.save(job);
		if (createdJob != null) {
			String log = "Job has been successfully created";
			logger.info(log);
			return ResponseEntity.status(HttpStatus.OK).body(createdJob);
		}
		return basecontroller.newresponseUnauthorized(logger);

	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getJob/{jobId}")
	public ResponseEntity<?> getJob(@PathVariable("jobId") String jobId) {
		java.util.Optional<Job>	job=jobRepo.findById(jobId);
	if (job.isPresent()) {
		return ResponseEntity.status(HttpStatus.OK).body(job.get());
	}
		
			return basecontroller.newresponseNotAcceptable(logger, "job is null");
		
	}
	
	

	
	@RequestMapping(method = RequestMethod.GET, value = "/getAllJob")
	public ResponseEntity<?> getAllJob() {
	List<Job>	job=jobRepo.findAll();
	if (job != null) {
		return ResponseEntity.status(HttpStatus.OK).body(job);
	}
		
			return basecontroller.newresponseNotAcceptable(logger, "job is null");
		
	}

	
}

