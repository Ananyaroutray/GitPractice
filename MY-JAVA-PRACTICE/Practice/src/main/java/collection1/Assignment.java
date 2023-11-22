package collection1;
import java.util.Scanner;

public class Assignment {
    public static boolean validateNum(String num) {
        boolean flag = false;

        if (num.startsWith("+91") && num.length() == 13) {
            flag = num.substring(3).chars().allMatch(Character::isDigit);
        }

        return flag;
    }

    public static void main(String[] args) {
        String num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Phone Number: ");
        num = sc.next();

        boolean result = validateNum(num);

        if (result) {
            System.out.println("Your phone number is Valid");
        } else {
            System.out.println("Sorry!! Invalid Phone Number.");
        }
    }
}
