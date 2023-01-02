package Aggregation;

public class Employe {
	int id;
	String name;
	Address address;
	void display() {
		System.out.println("Id:"+id+" "+"Name:"+name+" "+"City:"+address.city+" "+"State:"+address.state+" "+"Pincode:"+address.zipcode);
	}
Employe(int id, String name, Address address){
	this.id=id;
	this.name=name;
	this.address=address;
}
	public static void main(String[] args) {
		Address b=new Address("TVM","Kerala",1234);
		Employe emp=new Employe(100,"Karuna",b);
		emp.display();
	}

}
