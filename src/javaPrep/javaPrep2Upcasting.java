package javaPrep;

class GrandParent{
	GrandParent(){
		System.out.println("This is default constructor of Grandparent");
	}
	public void display() {
		System.out.println("This is grandParent!");
	}
}

class Parent extends GrandParent{
	Parent(){
		System.out.println("This is default constructor of Parent");
	}
	public void display() {
		System.out.println("This is Parent!");
	}
}

class Child extends Parent{
	public void display() {
		System.out.println("This is grandChild!");
	}
}

public class javaPrep2Upcasting {
	public static void main(String[] args) {
		//upcasting  parent reference to child object method 1
		//p1 will access to overridding method of child as well as all method of parent
		Parent p1 = new Child();
		p1.display();//this will display overridden method in child
		
		//upcasting parent refernce to child object method 2
		Child child2 = new Child();
		GrandParent p2 = (GrandParent)child2;
		p2.display();//this will display overridden method of child
		
		//Note: when child created, constructor of parent and grandparent invoked.
	}
	
}
