public class Employee{
	
	String name = new String("LetsUpgrade");
	String city = new String("Chennai");
	int age = 25;
	
	public void display(){
			System.out.println("The name is "+name);
			System.out.println("The age is "+age);
			System.out.println("The city is "+city);
	}
	
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.display();
		System.out.println();
		
		Employee e2 = new Employee();
		e2.name = "Java";
		e2.city = "Hyderabad";
		e2.age = 100;
		e2.display();
	}
}
