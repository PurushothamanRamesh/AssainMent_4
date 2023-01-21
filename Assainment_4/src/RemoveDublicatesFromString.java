import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicatesFromString {
    public static void main(String[] args) {
       // String name="Puruusssshhhootthhaammaann";//[P, u, r, u, s, h, o, t, h, a, m, a, n]
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your string Value");
        String name = scan.next();
        char[] arr=name.toLowerCase().toCharArray();
        int length =arr.length;
        System.out.println(Arrays.toString(arr));
        char[] afterRemove =remover(arr,length);
        for (int i = 0; i <afterRemove.length ; i++)
        {
            char visited='#';
            if(afterRemove[i]!=visited)
            {
                System.out.print(afterRemove[i] +" ");
            }
        }
    }
    static char[] remover(char[] arr1, int length)
    {
        char[] A =new char[arr1.length];
        char visited='#';

        for (int i = 0; i < arr1.length-1; i++)
        {

            for(int j=i+1;j<= arr1.length-1;j++)
            {
                 if (arr1[i]==visited)
                 {
                    A[i]=arr1[i];
                    break;
                 }
                else if(arr1[i]!=arr1[j] && arr1[j]!=visited)
                {
                    A[i]=arr1[i];
                }
                else if (arr1[i]==arr1[j] && arr1[j]!=visited)
                {
                    arr1[j]= visited;
                }
            }
        }
        return arr1;
    }
}

