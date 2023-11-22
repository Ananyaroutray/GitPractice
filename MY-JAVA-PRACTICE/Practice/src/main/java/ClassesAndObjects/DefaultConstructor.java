package ClassesAndObjects;

public class DefaultConstructor {
	int id;
	String name;
	
	
	void show() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
		dc.show();
		//it will give 0 and null due to the default constructor
	}
	

}
