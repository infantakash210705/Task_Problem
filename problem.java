import java.util.*;

///////////// Problem -> 1
//jack is excited about Sundays. Given the number of days in a month and the starting day 
// of that month, count how many Sundays occur in that month.
// input:
// 31
// monday
// output:
// 4

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         String day = sc.next();
//         int num = 0;

//         if(day.equals("monday"))
//             num = 2;
//         else if(day.equals("tuesday"))
//             num = 3;
//         else if(day.equals("wednesday"))
//             num = 4;
//         else if(day.equals("thursday")) 
//             num = 5;
//         else if(day.equals("friday")) 
//             num = 6;
//         else if(day.equals("saturday")) 
//             num = 7;
//         else if(day.equals("sunday")) 
//             num = 8;

//         int count = 0;
//         int i = 1;

//         while(i <= n) {
//             if ((num + i - 1) % 7 == 0) {
//                 count++;
//             }
//             i++;
//         }
//         System.out.println(count);
//     }
// }


///////////// Problem -> 2
// given a number from 1 to 9, find the next smallest palindrome strictly greater than the given number.
// input:
// 9 4 1 8 7 9 7 8 3 2 2
// output:
// 9 4 1 8 8 0 8 8 1 4 9


///////////// Problem -> 3
// check whether a given number is a palindrome or not.
// input:
// 121
// output:
// palindrome

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int ori = n;
//         int rev = 0;
//         while(n != 0){
//             int dig = n % 10;
//             rev = rev * 10 + dig;
//             n /= 10;
//         }

//         if(rev == ori){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
//     }
// }


///////////// Problem -> 4
// one chocolate costs 1 rupee. Rohit has n rupees.
// the shop offers 1 free chocolate for every 3 wrappers returned.
// find the total chocolates Rohit can eat.
// input:
// 15
// output:
// 22

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int total = n;

//         while(n >= 3){
//             int q = n / 3;
//             int r = n % 3;
//             total += q;
//             n = q + r;
//         }
//         System.out.println(total);
//     }
// }


///////////// Problem -> 5
// in a farm, there are rabbits and chickens.
// given total number of heads and legs, find the number of rabbits and chickens.
// input:
// 15 40
// output:
// rabbit: 5
// chicken: 10

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int h = sc.nextInt();
//         int l = sc.nextInt();

//         int rabbit = (l - 2 * h) / 2;
//         int chicken = h - rabbit;

//         System.out.println("rabbit: " + rabbit);
//         System.out.println("chicken: " + chicken);
//     }
// }


///////////// Problem -> 6
// given an array, find all the leaders in the array.
// an element is a leader if it is greater than or equal to all elements to its right.
// input:
// 7
// 16 17 4 3 5 2
// output:
// 17 5 2

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] res = new int[n];
//         int k = 0;
//         int max = arr[n - 1];
//         res[k++] = max;

//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] >= max) {
//                 max = arr[i];
//                 res[k++] = max;
//             }
//         }

//         for (int i = k - 1; i >= 0; i--) {
//             System.out.print(res[i] + " ");
//         }
//     }
// }


///////////// Problem -> 7
// given a sorted array, rearrange the elements in place to form a wave like array.
// an array is said to be in wave form if:
// arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]
// input:
// 5
// 1 2 3 4 5
// output:
// 2 1 4 3 5

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0; i < n - 1; i += 2){
//             int temp = arr[i];
//             arr[i] = arr[i + 1];
//             arr[i + 1] = temp;
//         }

//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// Problem -> 8
// given a non-negative number represented as an array of digits,
// add one to the number and return the result as an array.
// input:
// 3
// 1 2 4
// output:
// 1 2 5

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = n-1; i >= 0; i--){
//             if(arr[i] < 9){
//                 arr[i] = arr[i] + 1;
//                 break;
//             } else {
//                 arr[i] = 0;
//             }
//         }

//         if(arr[0] == 0) {
//             System.out.print("1 ");
//         }

//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }