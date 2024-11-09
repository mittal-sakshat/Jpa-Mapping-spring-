package com.hibernate.project;

import com.hibernate.project.entities.*;
import com.hibernate.project.studentRepository.CategoryRepository;
import com.hibernate.project.studentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {


	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CategoryRepository categoryRepository;

//	@Autowired
//	private LaptopRepository laptopRepository;

	public static void main(String[] args) {SpringApplication.run(ProjectApplication.class, args);}

		@Override
		public void run(String[] args){

//			Student student = new Student();
//			student.setStudentName("sakiifdios");
//			student.setStudentId(22);
//			student.setAbout("I am SDE at Applsselieid");

			Categories categories1 = new Categories();
			categories1.setCategoryId(789);
			categories1.setCategoryName("Electronics");

			Categories categories2 = new Categories();
			categories2.setCategoryId(791);
			categories2.setCategoryName("phone");


			Products product1 = new Products();
			ArrayList<Categories> categoriesList = (ArrayList<Categories>) product1.getCategories();
			categoriesList.add(categories1);
			categoriesList.add(categories2);
			product1.setProductName("IPhone");
			product1.setProductId(289);
			product1.setCategories(categoriesList);

			Products product2 = new Products();
			product2.setProductName("Samsung M35");
			product2.setProductId(290);
			product2.setCategories(categoriesList);


			categories1.getProducts().add(product1);
			categories1.getProducts().add(product2);

			categories2.getProducts().add(product1);
			categories2.getProducts().add(product2);

			categoryRepository.save(categories1);
			categoryRepository.save(categories2);

//			Address address1 = new Address();
//			address1.setAddressId(8998);
//			address1.setCity("Bulandshahr");
//			address1.setCountry("india");
//			address1.setStreet("Gandhi Nagar");
//			address1.setZipCode(203408);
//			address1.setStudent(student);
//
//			Address address2 = new Address();
//			address2.setAddressId(8999);
//			address2.setCity("Bulandshahr");
//			address2.setCountry("india");
//			address2.setStreet("Gandhi Nagar");
//			address2.setZipCode(203408);
//			address2.setStudent(student);
//
//			List<Address> addressList = new ArrayList<>();
//			addressList.add(address1);
//			addressList.add(address2);
//
//			Laptop laptop = new Laptop();
//			laptop.setBrand("Dell");
//			laptop.setLaptopId(17);
//			laptop.setModelNum(13435);
//			laptop.setStudent(student);
//			student.setLaptop(laptop);
//			student.setAddressList(addressList);
//			studentRepository.save(student);
		}




	}
