package TaskModule;

public class Approved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int numb = 123456789, rem = 0, rev = 0;

        while (numb > 0) {
            rem = numb % 10;       // Get last digit
            rev = rev * 10 + rem;  // Build reversed number
            numb = numb / 10;      // Remove last digit 
        }

        System.out.println("Reversed number is: " + rev);
        
       
        //Palindrom number 
        
        int num = 123456789 , rev =0 ,rem =0 , temp=num ;
        
        while(num>0) {
        	rem = num%10;
        	rev =rev*10+rem;
        	num =num/10;
        }
        if(temp==rev) {
        	System.out.println("its a palindrom");
       }
        else {
        	System.out.println("its a not a palindrom");
        }
		
        
		
		//count the number of digit 
		
		int num = 123456789 , count =0;
		
		while(num >0){
		count ++;
		num = num/10;
		}
        
        System.out.println("Count the number of didgit : "+ count);
        
        
		
		//sum of the digit
		
		int num =123456789 , sum =0,rem=0;
		while(num>0) {
			rem = num%10;
			sum=sum+rem;
			num = num/10;
		}
		
		System.out.println(sum);
		
		*/
		
		//factorial 
		
		int num=5,fact=1;
		
		while(num>0) {
			fact = fact*num;
			num--;
		}
		System.out.println("factorial value is :" + fact);	
	}

}
