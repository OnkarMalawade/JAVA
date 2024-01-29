package mypack;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1 = new HashSet<Integer>(); 
		Set<Integer> s2 = new HashSet<Integer>(); 
		
		s1.add(12);
		s1.add(13);
		s1.add(22);
		s1.add(52);
		s1.add(62);
		s1.add(11);
		
		System.out.println(s1);
		
		if(s1.contains(11)) {
			System.out.println("Yes it Contain");
		}
		else {
			System.out.println("No its Not Contains");
		}
		
		s2.add(2);
		s2.add(3);
		s2.add(22);
		s2.add(2);
		s2.add(6);
		s2.add(11);
		
		s2.remove(22);
		
		System.out.println(s2);
		
		s1.addAll(s2);
		
		System.out.println(s1);
	}

}
