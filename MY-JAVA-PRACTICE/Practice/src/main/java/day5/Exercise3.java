package day5;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		String str = new String();
		
        //for taking user input
	Scanner sc = new Scanner(System.in);
	//enter the number
    System.out.println("Enter the no. - ");
        int n=sc.nextInt();
        
        int sum=0; //taking sum as 0 at starting
        int res;
        while(n>0){
            res=n%10;
            sum=sum+res;
            n=n/10;            
        }
        System.out.println("Sum of digits: "+sum);
        
    }
}


