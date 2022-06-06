package com.theplayer.kits;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		//quiz01();
		//quiz02(6);
		quiz03();
	}

	private static void quiz03() {
			
		int digits = 3;
		int r = 0; // 0 ~ 9
		
		for(int i = 0; i < 8; i++){
			int number = 0;
			for (int j = 0; j < digits; j++){
		        do {
		            r = (int)(Math.random() * 10);
		            // remove duplicated value
		        } while ( isDuplicated(number, r) );
		        number = number * 10 + r;
		    }
		    System.out.println(number);
		}
		    
	}
	
	
	
	private static boolean isDuplicated(int number, int r) {
		{
			while (number > 0) {
				if (number % 10 == r) {
					return true;
				}
				number /= 10;
			}
		}
		return false;
	}

	private static void quiz02(int col) {
		
//		int p = 2;
//		
//		while (p < 10) {
//					
//			for (int i = 1; i <= 10; i++) {
//				for (int j = 0; j < col; j++) {
//					if ((p+j) < 10) {
//						System.out.print((p+j) + " x " + i + " = " + ((p+j)*i) + "\t");
//					}
//				}
//				System.out.println();
//			}
//			p = p + col;
//			System.out.println();
//		}
		
		for(int base = 2; base <= 9; base += col){
		    for(int v = 1; v <= 9; v++){
		        for(int a = 0; a < col; a++){
		            int dan = base + a;
		            int multi = dan * v;
		            if (dan <= 9){
		                 System.out.print(dan + " x " + v + " = " + multi + "\t");
		            }
		        }
		        System.out.println();
		    }
		}
	}


	private static void quiz01() {
		// TODO 1 ~ 27 +1 int -> print

		for (int i = 1; i <= 27; i++) {
			
			if (i % 5 == 0) {
				System.out.println(i);
			} else if (i == 27) {
				System.out.print(i);
			} else {
				System.out.print(i + " ");
			}
			
		}
	}
}
