package Assesment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaProgramm {

	public static void main(String[] args) {
		
	/*	
		List<Integer>Numbers= Arrays.asList(9,6,5,4,1,2,3,4,7,1,2,3,4,5,6,7,8,9);
		
		Set<Integer>Unique = new LinkedHashSet<Integer>(Numbers);
		
		System.out.println(Unique);
		
		
		*/
		
		String S = "madaM";
		String Rev="";
		
		for(int i=S.length()-1;i>=0;i--) {
			Rev+=S.charAt(i);
		}
		if(S.equals(Rev)) {
		
		System.out.println("Its reversed");
		

	}
		else {
			System.out.println(" its not reversed");
		}
}
}