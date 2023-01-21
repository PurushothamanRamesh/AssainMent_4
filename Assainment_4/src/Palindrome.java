import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your string Value to check");
        String name = scan.next();
        String name1 = "";
        for (int i =name.length()-1; i>=0 ; i--)
        {
            name1=name1+name.charAt(i);
        }
        if (name.equals(name1))
            System.out.println("Its a Palindrom");
        else
            System.out.println("Its not a Palindrom");
    }
}