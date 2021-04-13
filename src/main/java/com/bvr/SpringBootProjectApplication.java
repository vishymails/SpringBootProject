package com.bvr;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bvr.domain.Employee;
import com.bvr.domain.EmploymentHistory;
import com.bvr.repository.EmployeeRepository;
import com.bvr.repository.EmploymentHistoryRepository;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(SpringBootProjectApplication.class);

    @Autowired
    private EmployeeRepository repository;
    
    
    @Autowired
    private EmploymentHistoryRepository repo2;

    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
		
	}
	

	@Override
    public void run(String... args) {

        log.info("StartApplication...");
        
        
        
        EmploymentHistory eh = new EmploymentHistory(2 , "IBM", new Date(2020,02,01), new Date(2020,02,01), "Bangalore", "India", "560036", "Java");
        
        repo2.save(eh);
        
        System.out.println("record updated 2");
        

        System.out.println("\nfindAll()");
        repo2.findAll().forEach(x -> System.out.println(x));

        
        
        System.out.println("\nfindById(1)");
        repo2.findById(1).ifPresent(x -> System.out.println(x));

        
        
        System.out.println("\nfindByEmpId(2)");
        repo2.findByEmpId(2).forEach(x -> System.out.println(x));


        

        Employee e1 = new Employee("rag", "bvr","male" , "hfjhfjhf" , "123456", "123456789012" , "8989898989", "brsreenath@gmail.com",
        		"brsreenath@gmail.com" , "bangalore", "bangalore", "o positive", "image", "fdfdff" , "3", "Sr. Application Developer", 30000, 40000);
        
        repository.save(e1);
        
        System.out.println("record updated");
     
        
        
        System.out.println("\nfindAll()");
        repository.findAll().forEach(x -> System.out.println(x));

        
        
        System.out.println("\nfindById(6)");
        repository.findById(6).ifPresent(x -> System.out.println(x));

        
        
        System.out.println("\nfindByFirstname('rag')");
        repository.findByFirstname("rag").forEach(x -> System.out.println(x));

    }


}
