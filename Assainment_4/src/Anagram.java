import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your first string Value to check");
        String str1 = scan.next().replace(" ","");
        //String str1="hello";
        System.out.println("Enter Your second string Value to check");
        String str2 = scan.next().replace(" ","");
        //String str2="ollhe";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a,b))
            System.out.println("its a anagram ");
        else
            System.out.println("its not an anagram ");
    }


}
