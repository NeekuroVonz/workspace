package com.theplayer.kits;
/**
 *	Data Type
 *		Primitive literal value
 *			lowercase
 *		Reference point to address Object/Instance
 *			.dot
 *			uppercase	
 *
 *	@author bitcamp
 *	
 */

public class Primitive {
	public static void main(String[] args) {
//		defaultTypes();
		conversion();
		
	}

	private static void conversion() {

		System.out.println( 123 );
		System.out.println( 0x123 ); // Hexa
		System.out.println( Integer.toHexString(123) );
		System.out.println( Integer.toHexString(0x123) );
		
//		float f = 10.24F; // double
//		long n1 = (long) 100; // int
//		long n2 = 100L; // int
//		char c = 'A'; // char
//		int cn = 'A'; // 65
		
	}

	private static void defaultTypes() {
		// TODO Primitive type
		boolean bool; // true false : contional exp
		
		// integer
		byte	ascii; // 1 byte : unsigned ~ 255
		short	s; // 2 byte
		int		i; // 4 bytes : 999999999
		long	l; // 8 bytes : PrimaryKey(PK), ID
		
		char	unicode; // UTF-16 2 byte: utf8mb4 in DB
		
		// floating number
		double lf; // 8 byte;
		float f; // 4 bytes; 
	
	
	}
}
