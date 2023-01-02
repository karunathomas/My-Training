package Aggregation;

public class Student {
	int rollno;
	String name;
	Address address;
	void display() {
		System.out.println("Roll NO:"+rollno+" "+"Name:"+name+" "+"City:"+address.city+" "+"State:"+address.state+" "+"Pincode:"+address.zipcode);
	}
Student(int rollno, String name, Address address){
	this.rollno=rollno;
	this.name=name;
	this.address=address;
}
	public static void main(String[] args) {
		Address b=new Address("PTA","Kerala",689648);
		Student stud=new Student(31,"Karuna",b);
		stud.display();
	}

}
