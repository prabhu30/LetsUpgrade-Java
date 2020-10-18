import java.util.Scanner;
public class ArrayOdd{
  public static void main(String[] args) {
    String[] arr1 = new String[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr1.length; i++) {
      System.out.print("Enter element at index 0 : ");
      arr1[i]=sc.nextLine();
    }
    System.out.print("Elements of the array at odd indices are : ");
    for (int i = 0; i < arr1.length; i++) {
		if(i%2!=0){
			System.out.print(arr1[i]);
		}
		else{
			System.out.print(" ");
		}
    }
  }
}
