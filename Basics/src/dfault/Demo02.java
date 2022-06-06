package dfault;

class Demo02 {

	// returnType methodName ( parameters ) { process }
	// method 
	//  define : returnType methodName ( parameters );
	//  implement : make { body }
	
	// not implement yet
	abstract void todo();
	
	// need to called
	void some() {
		// body
		// overload
		getValue();
		getValue('A'/*argument*/);
	}
	
	int getValue() {
		// process ....
		return 0;
	}
	
	int getValue(char letter) {
		// process ...
		return 0;
	}
	
}
