package com.generator;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo
{
	public static void main(String args[]) {
		MainDemo demo=new MainDemo();
		//demo.addEmployee();
		demo.addEvent();
		
	}
	public void addEmployee() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
	     SessionFactory sf=cfg.buildSessionFactory();
	     
	     Session session =sf.openSession();
	 Employee emp=new Employee();
	 emp.setName("RAMU");
	 emp.setGender("MALE");
	 emp.setContact("1234567897");
	 session.persist(emp);
	 Transaction t=session.beginTransaction();
	 t.commit();
	 System.out.println("Employee added successfully");
	 
	 session.close();
	 sf.close();
	}

public void addEvent() {
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
     SessionFactory sf=cfg.buildSessionFactory();
     
     Session session =sf.openSession();
     Event event=new Event();
     event.setName("Hackathon");
     event.setDescription("FSAD Hackathon");
     session.persist(event);
     Transaction t=session.beginTransaction();
     t.commit();
     System.out.println("Event added succesfully");
     session.close();
     sf.close();
     		

    }}
