package reverse;

public class Test {
		// TODO Auto-generated method stub
		 public int reverseNumber(int number){
	         
		        int reverse = 0;
		        while(number != 0){
		            reverse = (reverse*10)+(number%10);
		            number = number/10;
		        } 
		        return reverse;
		    }
		     
		    public static void main(String a[]){
		        Test nr = new Test();
		        System.out.println("Reult: "+nr.reverseNumber(17868));
		    }
		
	}


