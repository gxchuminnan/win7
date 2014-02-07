package book2;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
   public static void main(String[] args){
	   Set<String> set1 = new HashSet<String>();
	   set1.add("abc");
	   set1.add("def");
	   set1.add("hij");
	   set1.add("opq");
	   set1.add("def");
	   
	   System.out.println(set1);
	   System.out.println(set1.size()+" "+set1.toString());
	   for(Object o: set1){
		   
		   System.out.println(o);
	   }
	   
   }
 }
