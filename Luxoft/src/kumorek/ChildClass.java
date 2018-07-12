package kumorek;

import mariusz.BaseClass;

public class ChildClass extends BaseClass {
	
	ChildClass() {
		super();
		foo();
		// TODO Auto-generated constructor stub
	}
	
	

	void test(){
		BaseClass baseClass = new ChildClass();
//		baseClass.foo();
		foo();
	};
	
}
