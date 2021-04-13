package com.bvr.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bvr.domain.Employee;
import com.bvr.repository.EmployeeRepository;

@Service
public class AppServiceImplementation implements AppServices {
	
	private EmployeeRepository apprepository;
	
	@Autowired
	public void setApprepository(EmployeeRepository apprepository) {
		this.apprepository = apprepository;
	}

	@Override
	public Iterable<Employee> listDetails() {
		
		return apprepository.findAll();
	}

	@Override
	public Employee getDetailById(Integer employee_id) {
	   Employee e;
		
		Optional<Employee> optional = apprepository.findById(employee_id);
		
		e = optional.get();
		return e ;
	}
	
	@Override
	public Employee saveDetails(Employee employee) {
		return apprepository.save(employee);
	}

	@Override
	public void deleteRecord(Integer employee_id) {
		apprepository.deleteById(employee_id);
	}

		
	@Override
	public void saveImage(MultipartFile imagefile, Employee employee) throws Exception {
		
		String folder="c:\\springbootproject\\src\\main\\resources\\static\\images\\";
		byte[] bytes=imagefile.getBytes();
		Path path = Paths.get(folder+imagefile.getOriginalFilename());
		System.out.println(path);
		Files.write(path,bytes);
		employee.setProfilePict(imagefile.getOriginalFilename());
		//File uploadedFile = new File(rootDir, name);
		//file.transferTo(uploadedFile);
	}

	public boolean findPKey(Integer employee_id) {
		boolean employee_exist;
		employee_exist=apprepository.existsById(employee_id);
		return employee_exist;
	}
	
	

}

