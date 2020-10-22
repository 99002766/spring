package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactor;
import com.lts.carwiring.VehicleDetails;
import com.lts.constr.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.jbased.Vehicle;
import com.lts.setter.Employee;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
@Autowired
ApplicationContext context;
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	//Employee employee1 = context.getBean("employee", Employee.class);
    //System.out.println("emp 1"+employee1);
   
    //Employee employee2 = context.getBean("employee", Employee.class);
    //System.out.println("emp 2"+employee2);
   
    //employee2.setName("Kumaran");
    //System.out.println("emp 1"+employee1);
    //System.out.println("emp 2"+employee2);
	//Student  student = context.getBean("student",Student.class);
	//System.out.println(student);
	ShapeFactor shapeFactor = context.getBean(ShapeFactor.class);
	shapeFactor.printArea(20,10);
	//FoodPanda foodPanda=context.getBean(FoodPanda.class);
	//List<String> l =foodPanda.showMenu("chinese");
	//for(String s:l) {
		//System.out.println(s);
	VehicleDetails vehicleDetails= context.getBean("vehicleDetails",VehicleDetails.class);
	vehicleDetails.getMilegae(100,200);
    //Vehicle vehicle = context.getBean("vehicle",Vehicle.class);
    //System.out.println(vehicle);
	
	}
	
}




