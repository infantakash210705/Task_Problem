import java.util.*;

public class zoho {
    public static void main(String[] args) {
        String str = "PROGRAM";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1)
                    System.out.print(str.charAt(j));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // int arr[]={10,36,54,89,12};

        // Arrays.sort(arr);

        // for(int x:arr)
        // {
        //     System.out.println("<"+x+","+weight(x)+">");
        // }
    }

    // static int weight(int n) {

    //     int w = 0;

    //     int root = (int)Math.sqrt(n);

    //     if(root*root==n)
    //         w+=5;

    //     if(n%4==0 && n%6==0)
    //         w+=4;

    //     if(n%2==0)
    //         w+=3;

    //     return w;
    // }
}
