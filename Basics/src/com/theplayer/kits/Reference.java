package com.theplayer.kits;

public class Reference {
	
	public static void main(String[] args) {
		// TODO: Point to address (ID)
		Reference inst1 = new Reference(); // <-- constructor
		Reference inst2 = new Reference();
		System.out.println(inst1 + "vs" + inst2);
		Reference inst3 = inst1;
		
		// equals ??? --> hasCode --> field value
		
	}
}
