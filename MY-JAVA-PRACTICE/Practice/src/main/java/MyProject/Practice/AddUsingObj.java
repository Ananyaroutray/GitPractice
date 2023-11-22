package MyProject.Practice;

public class AddUsingObj {
	int num1;
	int num2;
	int result;
 public void method() {
	 result=num1+num2;
 }

	public static void main(String[] args) {
		 AddUsingObj obj= new  AddUsingObj();
		 obj.num1=8;
		 obj.num2=9;
		 obj.method();
		 System.out.println(obj.result);
	}
	
}
