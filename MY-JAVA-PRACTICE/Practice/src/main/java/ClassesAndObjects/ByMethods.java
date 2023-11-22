package ClassesAndObjects;

public class ByMethods {
	int rollNo;
	String Name;
	
	void show(int roll, String name) {
		rollNo=roll;
		Name=name;		
	}
  void display() {
	  System.out.println("RollNo:"+ rollNo +" "+"Name:"+Name);
  }
  
	  public static void main (String[] args) {
		ByMethods bm = new ByMethods();
	    bm.show(121,"Ananya");
	    bm.display();
	    
  }
}
