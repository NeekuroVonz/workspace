package com.theplayer.kits;

import java.util.Iterator;

// control statements
public class Controls {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("for");
		}
		
		int k = 0;
		while ( k < 10 ) {
			System.out.println("while");
			k++;
		}
		
		int m = 0;
		do {
			System.out.println("do-while");
			m++;
		} while (m < 10);
		
	}
	
	public static void switchsmt(String[] args) {
		int value = 10;
		switch ( value ) {
		case 1:
			System.out.println(" value is 1 ");
			break;
		case 3:
			System.out.println(" value is 3 ");
			break;
		case 7:
			System.out.println(" value is 7 ");
			break;
		case 10:
			System.out.println(" value is 10 ");
			break;
		}
	}

	private static void ifsmt(String[] args) {
		boolean expression = true;
		if ( expression ) {
			System.out.println("TRUE");
			if ( expression ) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}
		} else {
			System.out.println("FALSE");
			if ( expression ) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}
		}
	}

}
