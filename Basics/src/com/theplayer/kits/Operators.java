package com.theplayer.kits;

import java.util.Random;

public class Operators {
	public static void main(String[] args) {
		ariths();
		compare();
		logic();
		bitwise();
	}

	private static void bitwise() {
		// TODO Auto-generated method stub
		
	}

	private static void logic() {
		// boolean va boolean return : boolean
		System.out.println( true && false );
		System.out.println( true || true );
		System.out.println( !false );
		
	}

	private static void compare() {
		// value va value return : boolean
		System.out.println( 1 < 10 ); // &lt
		System.out.println( 1 > 10 ); // &gt
		System.out.println( 1 <= 10 );
		System.out.println( 1 >= 10 );
		System.out.println( 1 == 10 ); // equal
		System.out.println( 1 != 10 ); // not equal
		
	}

	private static void ariths() {
		int min = 32; 
		int max = 117;
		
//		Random random = new Random();
//		random.nextInt();
		
		int number = (int) ( Math.random() * 1000000);
		number = number % (max + 1 - min); // ~ (max - min)
		number = number + min; // min <= (max)
		System.out.println((char)number);
		
//		int test1 = max - min + 1;
//		int count = 0;
//		for (int i = min; i <= max; i++) {
//			count++;
//		}
//		System.out.println(test1);
//		System.out.println(count);
		
//		// offset
//		System.out.println( 10 + 5 );
//		System.out.println( 10 - 5 );
//		// group
//		System.out.println( 10 * 5 );
//		System.out.println( 10 / 5 );
//		// limited
//		System.out.println( 10 % 5 );
//	
//		int a = 5;
//		int b = ++a; // --
//		int c = a++;
		
	}
	
}
