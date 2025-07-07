package TaskModule;

public class AssignedUser {

	public static void main(String[] args) {
		
		  /*
		    int num = 125;
    if(num %2==0) {
    	System.out.println("Even number");
    }else {
    	System.out.println("Odd");
    }
		
		
    
    
 for(int i=0;i<100;i++) {
    	if(i%2==1) {
    		System.out.println("Odd number between 1 to 100 : "+i);
    	}
   
		
		int count =0;
		for(int i=1;i<100;i++) {
			if(i%2==1) {
				count++;
			}
		}
		System.out.println("beween 0 to 100 add number count : " + count);
		
		
    
    
    
    int sum=0;
    for(int i=1;i<100;i++) {
    	if(i%2==1) {
    		sum = sum+i;
    	}
    }
    System.out.println("1 to 100 odd numbers sum ;" + sum);
    	 
    	int a = 10,b=20 ,c=0;
    	
    	c=a;
    	a=b;
    	b=c;
    	
    	System.out.println("After swapping a value is :"+ a);
    	System.out.println("After swapping b value is :"+ b);
    	
    	
    	
    //without using 3 rd variable 
    	int a=10 , b=20 ;
    	
    	a=a+b;
    	b=a-b;
    	a=a-b;
    	
     	System.out.println("After swapping a value is :"+ a);
    	System.out.println("After swapping b value is :"+ b);
    	
    	
    	}
    	*/
		
    	//reverse number
    	
    	int numb = 123456789 , rem=0 ,rev=0;
    	
    	while(numb>0) {
    		rem = numb%10;
    		rev = rev*10+rem;
    		numb = numb/10;
    		
    	}
    	System.out.println("reverse number is" + rev);
    	
    	
    	
    }

}
