package collection1;

import java.util.ArrayList;

public class Exercise10 {
	public static void main(String[] args) {
		   ArrayList<String> c1= new ArrayList<String>();
		          c1.add("Red");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Pink");
		          System.out.println("List of original: " + c1);
		   
		          
		          ArrayList<String> a= (ArrayList<String>)c1.clone();
		          System.out.println("After clone:"+a);
		          
		          a.removeAll(a);//to remove all elements from list
		          System.out.println(a);
		          

}
}