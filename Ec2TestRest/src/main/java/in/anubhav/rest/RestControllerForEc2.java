package in.anubhav.rest;

import java.util.ArrayList;

import java.util.List;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anubhav.dto.Student;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RestControllerForEc2 {

	private static final Logger logger = LoggerFactory.getLogger(RestControllerForEc2.class);

	@GetMapping("/students")
	public List<Student> listOfStu(){
		
	   logger.info("execution start at in.anubhav.rest.RestControllerForEc2.listOfStu()");

		Student s1=new Student(101,"abhay");
		Student s2=new Student(102,"ranjan");
		Student s3=new Student(103,"vivek");
		
		List li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		logger.info("Returning result: { list of student is }"+ li);
		System.out.println(li);		
		return li;
		
	}
}
