package sindhu;

public class student {
	String name;
	int age;
	public void display() {
		System.out.println("name : " + name +  "\nAge = " + age);
	}
	public static void main( String[] args) {
		student s1= new student();
		s1.name="Sindhu";
		s1.age=19;
		s1.display();
	}

}
