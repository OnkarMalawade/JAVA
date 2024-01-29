package myPack;

import java.util.Scanner;

public class TestDataDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataUsedArth da = (a,b)->{
			System.out.println(a+b);
		};
		
		DataUsedArth d2 = (a,b)->{
			System.out.println(a*b);
		};
		
		d2.add(12, 10);
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		da.add(10, 20);
		da.add(a, b);
	}

}
