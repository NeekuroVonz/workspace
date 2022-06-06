package com.theplayer.kits;

class Data {
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int arg) {
		if (arg > 0) {
			value = arg;
		}
	}
	
	
}

public class Scope {
	
	public static void main(String[] args) {
		Scope obj = new Scope();
		Data data = new Data();
//		data.value = 10;
		obj.edit(data);
//		System.out.println(data.value);
		
		int arg = 10;
		obj.update(arg);
		System.out.println(arg);
	}
	
	public void edit(Data param) {
//		param.value = 100;
		param = new Data();
	}
	public void update(int param) {
		param = 100;
	}
	
	
//	private int InstVar; // instance variable
//	private static int ClassVar; // class variable
//	int a = 10;
//	
//	public static void main(String[] args) {	
//		
//		{// block scope
//			System.out.println(a);
//		}
//		System.out.println(a);
//	}
//	
//	public void todo() {
//		a = 100;
//	}
//	
//	
//	public static void main1(String[] args) {// class method
//		// range to use
//		Scope obj1 = new Scope();
//		Scope obj2 = new Scope();
//		System.out.println(obj1.ClassVar);
//		System.out.println(obj2.ClassVar);
//		Scope.ClassVar = 10;
//		System.out.println(obj1.ClassVar);
//		System.out.println(obj2.ClassVar);
//		obj1.InstVar = 100;
//		obj2.InstVar = 100;	
//		System.out.println(obj1.InstVar);
//		System.out.println(obj2.InstVar);
//		obj2.InstVar = 200;
//		System.out.println(obj2.InstVar);
//	}
}
