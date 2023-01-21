import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String name ="abcdefghijklmnopqrstuvwxyz";
            String name2="";
            System.out.println("Enter Your string Value to check");
            String name1 = scan.next().toLowerCase().replace(" ","");
            char[] c1=name.toCharArray();
            char[] c2=name1.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int i=0;i< c2.length;i++){
                name2+=c2[i];
            }
            if (name.equals(name2))
                System.out.println("Its a Pangram");
            else
                System.out.println("Its not a Pangram");

        }

    }
