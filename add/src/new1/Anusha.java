package new1;

import java.util.Scanner;

public class Anusha {

	public static void main(String[] args) {
		  
		      int x, y, z;
		      System.out.println("Enter two integers to calculate their sum ");
		      @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
		      x = scan.nextInt();
		      y = scan.nextInt();
		      z = x + y;
		      System.out.println("Sum of entered integers = "+z);
		   }
      
	}

