package in.ac.famt;

import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		lst.add("Onkar");
		lst.add("Aditya");
		lst.add("Yuvi");
		lst.add("Bhushan");
		for (String str : lst) {
			System.out.println(str);
		}
		System.out.println("Enter More Items in List:");
		System.out.println("Enter you want to add:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Elements:");
		for(int i = 1; i <= n; i++) {
			String k;
			k = sc.next();
			lst.add(k);
		}
		for (String str : lst) {
			System.out.println(" " + str);
		}
		Collections.sort(lst);	
		for (String str : lst) {
			System.out.println(" " + str);
		}
		Collections.reverse(lst);
		for(String str : lst) {
			System.out.print(" " + str);
		}
		sc.close();
	}
}
