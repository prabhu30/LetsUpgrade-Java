import java.util.Scanner;

public class Percentage{
	public static void main(String[] args){
		float sub1,sub2,sub3,sub4,sub5,perc;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks of subject 1: ");
		sub1 = sc.nextFloat();
		System.out.print("Enter marks of subject 2: ");
		sub2 = sc.nextFloat();
		System.out.print("Enter marks of subject 3: ");
		sub3 = sc.nextFloat();
		System.out.print("Enter marks of subject 4: ");
		sub4 = sc.nextFloat();
		System.out.print("Enter marks of subject 5: ");
		sub5 = sc.nextFloat();
		
		perc = (sub1+sub2+sub3+sub4+sub5)/5;
		
		System.out.println("Percentage is "+perc);
		
		if(perc > 90){
			System.out.println("Grade is A");
		}
		else if(perc > 80){
			System.out.println("Grade is B");
		}
		else if(perc > 70){
			System.out.println("Grade is C");
		}
		else if(perc > 60){
			System.out.println("Grade is D");
		}
		else{
			System.out.println("Sorry, you have failed. BETTER LUCK NEXT TIME!!!");
		}
	}
}
