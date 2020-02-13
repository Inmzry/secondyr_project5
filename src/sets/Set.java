package sets;
import java.util.*;
public class Set {
	 public static void main(String args[]) {
	      HashSet <Integer> set1 = new HashSet <Integer>();
	      HashSet <Integer> set2 = new HashSet <Integer>();
	      set1.add(1);
	      set1.add(2);
	      set1.add(3);
	      set1.add(4);
	      set1.add(10);
	      System.out.println("Set1 = "+ set1);
	      set2.add(3);
	      set2.add(4);
	      set2.add(5);
	      set2.add(6);
	      System.out.println("Set2 = "+ set2);
	      int num; 
	       
	        System.out.print("Enter the integer: "); 
	  
	        Scanner s = new Scanner(System.in); 
	        num = s.nextInt(); 
	        boolean contains1 = set1.contains(num);
	        boolean contains2 = set2.contains(num);
	        
	        if(contains2 == true && !contains1) {
	        	System.out.print(num+" is in set 2");
	        }
	        else if(contains1 == true && !contains2) {
	        	System.out.print(num+" is in set 1");
	        }
	        else if(contains2 == true && contains1 == true) {
	        	System.out.print(num+" is an intersection of set 1 and set 2");
	        }
	        else System.out.print(num+" cannot be found");
	   }
}
