package in.anubhav.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anubhav.dto.Student;

@RestController
public class RestControllerForEc2 {

	@GetMapping("/students")
	public List<Student> listOfStu(){
		Student s1=new Student(101,"abhay");
		Student s2=new Student(102,"ranjan");
		Student s3=new Student(103,"vivek");
		
		List li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		System.out.println(li);
		
		return li;
		
	}
}
