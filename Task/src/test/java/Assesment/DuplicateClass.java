package Assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.AttributeSet.CharacterAttribute;

import org.checkerframework.checker.units.qual.Length;

public class DuplicateClass {

	public static void main(String[] args) {
     
 /*    List<Integer> Input = Arrays.asList(11,2,13,4,12,5);
     //convert List into Set - duplicate value not allowing
     
     Set<Integer>Unique =  new LinkedHashSet<>(Input);
		       
     List<Integer>Result = new LinkedList<>(Unique);
     
     System.out.println(Result);
		       		
		   
	*/
		
		
		String S = "  madam  ";
		String Rev ="";

		for(int i = S.length()-1;i>=0;i--) {
			
			Rev += S.charAt(i);
			
		}
       if(S.equals(Rev)) {
    	   System.out.println("its palindrome");
       }else {
    	   System.out.println("its not a palindrom");
       }
	}

}
