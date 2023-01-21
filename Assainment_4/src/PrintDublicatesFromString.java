import java.util.Arrays;
import java.util.Scanner;

public class PrintDublicatesFromString {
    public static void main(String[] args) {
       // String name="Purushoth";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your string Value");
        String name = scan.next();
        char[] arr=name.toLowerCase().toCharArray();
        System.out.println("Before finding dublicate your string arrays is ");
        System.out.println(Arrays.toString(arr));
        //int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.print(arr[j] +" ");
            }
        }
    }
}
