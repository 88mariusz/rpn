package mariusz;

class ChildClass2 extends BaseClass {
	
	public static void main(String[] args) {
		new ChildClass2().foo();
	}
	
	void test(){
		BaseClass baseClass = new BaseClass();
		baseClass.foo();
		foo();
	};
	
	public void foo(){
		System.out.println("cc2");
	};
	
}
