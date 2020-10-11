import java.util.Scanner;

public class Tax{
	public static void main(String[] args){
		String ename;
		int dob,mob,yob,a,b,c;
		long ms,as,ta;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of employee: ");
		ename = sc.nextLine();
		System.out.print("Enter date of birth: ");
		dob = sc.nextInt();
		System.out.print("Enter month of birth: ");
		mob = sc.nextInt();
		System.out.print("Enter year of birth: ");
		yob = sc.nextInt();
		System.out.print("Enter monthly salary: ");
		ms = sc.nextLong();
		
		as = ms*12;
		
		ta=0;
		
		if(as > 500000){
			ta = (as/100)*20;
		}
		else if(as > 400000){
			ta = (as/100)*15;
		}
		else if(as > 300000){
			ta = (as/100)*10;
		}
		else if(as > 200000){
			ta = (as/100)*5;
		}
		else{
			ta = 0;
		}
		
		
		System.out.println();
		System.out.println("############################");
		if(dob > 31 || dob < 1 || mob < 1 || mob > 12 || yob < 1 || yob > 2020){
			System.out.println("Invalid age");
		}
		else{
			System.out.print("Till 13th october 2020, i.e, today, "+ename+" ");
			if(yob < 2020){
				if(mob < 10){
					System.out.println("Age is : "+(2020-yob)+" years");
				}
				else if(mob > 10){
					System.out.println("Age is : "+(2019-yob)+" years");
				}
				else{
					if(dob < 13){
						System.out.println("Age is : "+(2020-yob)+" years");
					}
					else if(dob > 13){
						System.out.println("Age is nearly "+(2020-yob)+" years");
					}
					else{
						System.out.println("Age is "+(2020-yob)+" years");
						System.out.println("HAPPY BIRTHDAY CHAMP !!!");
					}
				}
			}
			else{
				if(mob < 10){
					if(dob < 13){
						System.out.println("Age is : "+(11-mob)+" months");
					}
					else if(dob == 13){
						System.out.println("Age is : "+(10-mob)+" months");
					}
					else{
						System.out.println("Age is nearly "+(10-mob)+" months");
					}
				}
				else if(mob > 10){
					System.out.println("Invalid age");
				}
				else{
					if(dob < 13){
						System.out.println("Age is "+(13-dob)+" days");
					}
					else if(dob > 13){
						System.out.println("Invalid age");
					}
					else{
						System.out.println("You are just born");
						System.out.println("HAPPY BIRTHDAY CHAMP !!!");
					}
				}
			}
		}
		
		System.out.println("Tax to be paid is : "+ta+" rupees");
		System.out.println("############################");
		
	}
}
