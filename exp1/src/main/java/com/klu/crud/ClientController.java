package com.klu.crud;



import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientController 
{
public static void main(String args[]) 
{
	ClientController controller = new ClientController();
	//controller.addStudent();
 //controller.displayStudent();
	//controller.deleteStudent();
	controller.updateStudent();
}
public void addStudent()
{
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
     SessionFactory sf=cfg.buildSessionFactory();
     
     Session session =sf.openSession();
     Student student=new Student();
     student.setId(1002);
     student.setName("KLEF");
     student.setGender("FEMALE");
     student.setDepartment("ECE");
     student.setCgpa(9.01);
     student.setBacklogs(0);
     student.setEmail("klef@gmail.com");
     student.setContact("1234567898");
     student.setLocation("HYD");
     
     Transaction t= session.beginTransaction();
     
     session.persist(student); //inserting object 
     t.commit();
     
     System.out.println("Student Inserted Successfully");
     
     session.close();
     sf.close(); 
     
}
 public void displayStudent() 
 {
	 Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
	     SessionFactory sf=cfg.buildSessionFactory();
	     
	     Session session =sf.openSession();
	     	Scanner sc=new Scanner(System.in);
	     	System.out.println("Enter Student ID");
	     	int id= sc.nextInt();
	     	Student s= session.find(Student.class, id);
	     	if(s!=null)
	     	{
	     		//System.out.println("Student ID found");
	     		//System.out.println(s.toString());
	     		System.out.println("ID="+s.getId());
	     		System.out.println("Name="+s.getName());
	     		System.out.println("Contact="+s.getContact());
	     		System.out.println("Gender="+s.getGender());
	     		System.out.println("Backlogs="+s.getBacklogs());
	     		System.out.println("Location="+s.getLocation());
	     		System.out.println("cgpa="+s.getCgpa());
	     		System.out.println("email="+s.getEmail());
	     		System.out.println("Department="+s.getDepartment());
	     	}
	     	else
	     	{
	     		System.out.println("Student ID not found");
	     	}
	     	session.close();
	     	sc.close();
	     	sf.close();
	 
 }
 public void deleteStudent() {
	 Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
	     SessionFactory sf=cfg.buildSessionFactory();
	     
	     Session session =sf.openSession();
	     	Scanner sc=new Scanner(System.in);
	     	System.out.println("Enter Student ID to be deleted");
	     	int id= sc.nextInt();
	     	Student s=session.find(Student.class,id);
	     	
	     	Transaction t=session.beginTransaction();
	     	if(s!=null)
	     	{
	     	session.remove(s); // s is student object
	     	t.commit();
	     	System.out.println("student record deleted succesfully");
	     	}
	     	else
	     	{
	     		System.out.println("Student ID not found in delete");
	     	}
	     	sc.close();
	     	session.close();
	     	sf.close();
 }
 public void updateStudent()
 {
	 Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
	     SessionFactory sf=cfg.buildSessionFactory();
	     
	     Session session =sf.openSession();
	     	Scanner sc=new Scanner(System.in);
	     	System.out.println("Enter Student ID");
	     	int id= sc.nextInt();
	     	Student s= session.find(Student.class, id);
	     	Transaction t=session.beginTransaction();
	     	if(s!=null) 
	     	{
	     		System.out.println("Enter Student name");
	     		String name=sc.next();
	     		System.out.println("Enter Student cgpa");
	     		double cgpa=sc.nextDouble();
	     		System.out.println("enter student contact");
	     		String contact=sc.next();
	     		
	     		 s.setName(name);
	     		 s.setContact(contact);
	     		 s.setCgpa(cgpa);
	     		 t.commit();
	     		 
	     		 System.out.println("student record updated succesfully");
	     		}
	     	else 
	     	{
	     		System.out.println("student record not found");
	     	}
	     	sc.close();
	     	session.close();
	     	sf.close();
	     	
 }
}