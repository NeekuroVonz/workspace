package com.theplayer.kits;

import java.io.IOException;
import java.util.Scanner;

public class StdInOut {
	
	public static void main(String[] args) throws IOException {
		// TODO: Trong A co B --> A.B
//		System.out.print(" main calls print ");
//		System.out.print("\n" + 190); //be string
//		System.out.println();
		
		int val = System.in.read(); // ASCII value
		System.out.println(val);
		System.out.println((char) val);
		
		Scanner sc = new Scanner(System.in);
		sc.next();
		sc.nextDouble();
		sc.nextLine(); // <- \n
		sc.close();
		}
}
