package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCar {
 public static void main(String[] args) {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nihal");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		 Chassis ch=new Chassis();
		 ch.setChassis_number(67876764);
		 
		 
		Car car=new Car();
		car.setName("X5");
		car.setBrand("BMW");
		car.setChasis(ch);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityManager.persist(ch);
		entityTransaction.commit();
		System.out.println("all done");
		
}
 
}
