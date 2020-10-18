import java.util.Scanner;
public class ArrayExample{
  public static void main(String[] args) {
    String[] arr1 = new String[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr1.length; i++) {
      System.out.print("Enter element at index 0 : ");
      arr1[i]=sc.nextLine();
    }
    System.out.println("Elements of the array are : ");
    for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
    }
  }
}
