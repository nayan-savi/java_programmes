class Student{

	String name;
	int age;

	Student(){
	name = "Unknown";
	age = 0;
	}

	Student(String s,int i){
	name = s;
	age = i;
	}

	 void display(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);

	}
}
class ConstructorDemo{

	public static void main(String a[]){
	Student s = new Student("Hari",10);
	s.display();

	Student s1 = new Student("Ravi",11);
	s1.display();

	Student s2 = new Student();
	s2.display();
	Student s3 = new Student();
	s3.display();
	
	}
}