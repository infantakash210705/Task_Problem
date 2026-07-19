import java.util.Scanner;

// // public class tcs {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         String word1 = sc.nextLine();
// //         String word2 = sc.nextLine();
// //         String word3 = sc.nextLine();

// //         StringBuilder result = new StringBuilder();

// //         for (char ch : word1.toCharArray()) {
// //             if ("aeiouAEIOU".indexOf(ch) != -1) {
// //                 result.append('*');
// //             } else {
// //                 result.append(ch);
// //             }
// //         }

// //         for (char ch : word2.toCharArray()) {
// //             if (Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) == -1) {
// //                 result.append('@');
// //             } else {
// //                 result.append(ch);
// //             }
// //         }

// //         result.append(word3.toUpperCase());

// //         System.out.print(result);
// //     }
// // }
// public class tcs {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // for (int i = 0; i < n; i++) {
//         // int num = 1;

//         // for (int j = 0; j < n - i; j++) {
//         // System.out.print(" ");
//         // }

//         // for (int j = 0; j <= i; j++) {
//         // System.out.print(num + " ");
//         // num = num * (i - j) / (j + 1);
//         // }

//         // System.out.println();
//         // }

//         // int[][] tri = new int[n][n];

//         // for (int i = 0; i < n; i++) {
//         // tri[i][0] = tri[i][i] = 1;

//         // for (int j = 1; j < i; j++) {
//         // tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
//         // }
//         // }

//         // for (int i = 0; i < n; i++) {
//         // for(int k = 0; k < n - i; k++){
//         // System.out.print(" ");
//         // }
//         // for (int j = 0; j <= i; j++) {
//         // System.out.print(tri[i][j] + " ");
//         // }
//         // System.out.println();
//         // }

//         String str = sc.next();

//         // for (int i = 0; i < str.length(); i++) {
//         //     int count = 1;
            
//         //     while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//         //         count++;
//         //         i++;
//         //     }
//         //     if(count == 1){
//         //         System.out.print(str.charAt(i)+" ");
//         //     }else{
//         //         System.out.print(count + " " + str.charAt(i) + " ");
//         //     }
//         // }

//         int count = 1;
//         for(int i = 0; i < str.length(); i++){
//             if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//             }else{
//                 if(count == 1){
//                     System.out.print(str.charAt(i));
//                 }
//                 else{
//                     System.out.print(count);
//                     System.out.print(str.charAt(i));
//                     count = 1;
//                 }
//             }
//         }
//     }
// }
    
public class tcs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int itemid = sc.nextInt();
        int maxdigit = 0;

        while(itemid > 0) {
            int digit = itemid % 10;
            if(digit > maxdigit) {
                maxdigit = digit;
            }
            itemid /= 10;
        }
        System.out.println(maxdigit);
    }
}

