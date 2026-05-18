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

///////////// Problem -> 8
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

// Date: 30/04/2026
///////////// Problem -> 1
// Given an array the task is to rearrange in alternative positive
// and negative number without changing the relative order of positive
// and negative numbers in case extra positive, 
// negative they appear at the end of array

// I/P: 1 2 3 -4 -1 4
// O/P: 1 -4 2 -1 3 4

// public class problem{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int[] pos = new int[n];
//         int[] neg = new int[n];
//         int p = 0, q = 0;

//         for(int i = 0; i < n; i++){
//             if(arr[i] >= 0){
//                 pos[p++] = arr[i];
//             } else {
//                 neg[q++] = arr[i];
//             }
//         }

//         int i = 0, j = 0, k = 0;

//         while(i < p && j < q){
//             arr[k++] = pos[i++];  
//             arr[k++] = neg[j++];  
//         }

//         while(i < p){
//             arr[k++] = pos[i++];
//         }

//         while(j < q){
//             arr[k++] = neg[j++];
//         }

//         for(int l = 0; l < n; l++){
//             System.out.print(arr[l] + " ");
//         }
//     }
// }

///////////// Problem -> 2
// Given an array find the element that appears
//  more the n/2 time if no such element return -1

// I/P: 1 1 2 1 3 5 1
// O/P: 1

// I/P: 7
// O/P: 7

// I/P: 2 1 3
// O/P: -1

// public class problem{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int count = 1;
//         int can = arr[0];
//         for(int i = 1; i < n; i++){
//             if(arr[i] == can){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//             if(count == 0){
//                 can = arr[i];
//                 count = 1;
//             }
//         }

//         int freq = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] == can){
//                 freq++;
//             }
//         }
//         if(freq > n/2){
//             System.out.println(can);
//         }else{
//             System.out.println("-1");
//         }
//     }
// }

///////////// Problem -> 3
// Given an array at each operation we can select any one element
// and increase rest of n-1 elements by 1. we have to make all element 
// equal performing such operation as many time you wish find the 
// minimum number of operation needed

// I/P: [1, 2, 3]
// O/P: [3]

// I/P: [4, 3, 4]
// O/P: [2]

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int count = 0;

//         while(true){

//             boolean check = true;
//             for(int i = 0; i < n; i++){
//                 if(arr[i] != arr[0]){
//                     check = false;
//                     break;
//                 }
//             }
//             if(check){
//                 break;
//             }

//             int max = arr[0];
//             int ind = 0;
//             for(int i = 1; i < n; i++){
//                 if(arr[i] > max){
//                     max = arr[i];
//                     ind = i;
//                 }
//             }

//             for(int i = 0; i < n; i++){
//                 if(i != ind){
//                     arr[i] += 1;
//                 }
//             }
//             count++;

//         }
//         System.out.println(count);
//     }
// }

///////////// Problem -> 4
// Given an unsorted array with both pos & neg 
//elements find the smallest pos missing number.

// I/P: 2 -3 4 1 1 7
// O/P: 3

// I/P: -8 0 -1 -4 -3
// O/P: 1

// public class problem{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//             if(arr[i] < min && arr[i] >= 0){
//                 min = arr[i];
//             }
//         }
//         if(max < 0 && min > 0){
//             System.out.println("0");
//             return;
//         }
//         if(max == 0 && min >= 0){
//             max = max + 1;
//             for(int i = 0; i < n; i++){
//                 if(max == arr[i]){
//                     max = max + 1;
//                 }
//             }
//             System.out.println(max);
//         }else{
//             min = min + 1;
//             for(int i = 0; i < n; i++){
//                 if(min == arr[i]){
//                     min = min + 1;
//                 }
//             }
//             System.out.println(min);
//         }
//     }
// }




// Date: 05/05/2026
///////////// Problem -> 1
// Given an array, the task is to find number of subarrays with sum at least K.
// Input
// I/P : 6 1 2
// K = 10
// Output
// O/P : 0
// Input
// I/P : 3 3 3
// K = 5
// Output
// O/P : 3

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();

//         int count = 0;
//         for(int i = 0; i < n; i++){
//             int sum = 0;
//             int maxof = 0;
//             for(int j = i; j < n; j++){
//                 sum = Math.max(arr[j], sum + arr[j]);
//                 maxof = Math.max(sum, maxof);
//                 if(sum >= k){
//                     count++;
//                 }
//             }
//         }
//         System.out.println("O/P: "+count);
//     }
// }




///////////// Problem -> 2
// Given an array, the task is to calculate the sum of all subarrays of size K.
// Input
// I/P : 1 2 3 4 5 6
// K = 3
// Output
// O/P : 6 9 12 15
// Input
// I/P : 1 -2 3 4 -5 6
// K = 2
// Output
// O/P : -1 1 7 -1 1

// public class problem {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int k = sc.nextInt();

//         for(int i = 0; i <= n - k; i++) {

//             int[] arr2 = new int[k];

//             int sum = 0;
//             int x = 0;

//             for(int j = i; j < n; j++) {

//                 if(x == k) {
//                     break;
//                 }

//                 arr2[x] = arr[j];
//                 x++;
//             }

//             for(int l = 0; l < k; l++) {
//                 sum += arr2[l];
//             }

//             System.out.print(sum + " ");
//         }
//     }
// }




///////////// Problem -> 3
// Given an array, the task is to split the array into 2 subarrays 
// such that difference between their maximum elements is minimum.
// Input
// I/P : 7 9 5 10
// Output
// O/P : 1
// Input
// I/P : 6 6 6
// Output
// O/P : 0

// public class problem {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int min = Integer.MAX_VALUE;
//         for(int i = 0; i < n; i++){
//             int max1 = 0;
//             for(int k = 0; k < i; k++){
//                 if(arr[k] > max1){
//                     max1 = arr[k];
//                 }
//             }
//             int max2 = 0;
//             for(int j = i; j < n; j++){
//                 if(arr[j] > max2){
//                     max2 = arr[i];
//                 }
//             }
//             int temp = 0;
//             if(max1 >= max2){
//                 temp = max1 - max2;
//             }else{
//                 temp = max2 - max1;
//             }

//             if(temp < min){
//                 min = temp;
//             }
//         }
//         System.out.println(min);
//     }
// }




///////////// Problem -> 4
// Given an unsorted array, the task is to count number of subarrays 
// with exactly K perfect square numbers.
// Input
// I/P : 2 4 9 3
// K = 2
// Output
// O/P : 4
// Input
// I/P : 4 2 5
// K = 3
// Output
// O/P : 0

// public class problem {
//     static boolean check(int n){
//         boolean find = false;

//         for(int i = 1; i * i <= n; i++){
//             if(i * i == n){
//                 find = true;
//                 break;
//             }
//         }
//         return find;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();

//         int total = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 int count = 0;
//                 for(int x = i; x < j + 1; x++){
//                     if(check(arr[x])){
//                         count++;
//                     }
//                 }
//                 if(count == k){
//                     total++;
//                 }
//             }
//         }
//         System.out.println("total: "+total);
//     }
// }




///////////// Problem -> 5
// Given an array, the task is to find length of longest alternating even odd subarray.
// Input
// I/P : 1 2 3 4 5 7 9
// Output
// O/P : 5
// Input
// I/P : 1 3 5
// Output
// O/P : 0

// public class problem {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean change = true;
//         int count = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++){
//             if(arr[i] % 2 == 0){
//                 change = true;
//                 count = 1;
//             }else{
//                 change = false;
//                 count = 1;
//             }
//             for(int j = i + 1; j < n; j++){
//                 if(arr[j] % 2 == 0 && change == false){
//                     count++;
//                 }
//                 else if(arr[j] % 2 != 0 && change == true){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 count = 0;
//             }
//             max = Math.max(max, count);
//         }

//         System.out.println(max);

//     }
// }




// Date: 09/05/2026
///////////// Problem -> 1
// Given an array, the task is to find total count of subarrays such 
// that sum of elements at even positions and sum of elements at odd positions are equal.
// Input
// I/P : 1 2 3 4
// Output
// O/P : 0
// Input
// I/P : 2 4 6 4 2
// Output
// O/P : 2

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int ind = 1;
//                 int even = 0;
//                 int odd = 0;
//                 for (int k = i; k < j + 1; k++) {
//                     if (ind % 2 != 0) {
//                         odd += arr[k];
//                         ind++;
//                     } else {
//                         even += arr[k];
//                         ind++;
//                     }
//                 }
//                 if (odd == even) {
//                     count++;
//                 }
//             }
//         }

//         System.out.println(count);

//     }
// }




///////////// Problem -> 2
// Given an array, the task is to split the array into 2 subarrays 
// such that difference between their sums is minimum.
// Input
// I/P : 7 9 5 10
// Output
// O/P : 1
// Input
// I/P : 6 6 6
// Output
// O/P : 6

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < n; i++) {
//             int sum1 = 0;
//             int sum2 = 0;
//             int diff = 0;
//             for (int j = 0; j < i; j++) {
//                 sum1 += arr[j];
//             }
//             for (int k = i; k < n; k++) {
//                 sum2 += arr[k];
//             }

//             if (sum1 >= sum2) {
//                 diff = sum1 - sum2;
//             } else {
//                 diff = sum2 - sum1;
//             }

//             if (diff < min) {
//                 min = diff;
//             }
//         }
//         System.out.println(min);
//     }
// }




///////////// Problem -> 3
// Given an array, the task is to print maximum number of non-overlapping 
// subarrays with sum equal to K.
// Input
// I/P : -2 6 6 3 5 4 1 2 8
// K = 10
// Output
// O/P : 3
// Input
// I/P : 1 1 1 1
// K = 2
// Output
// O/P : 2

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int k = sc.nextInt();
//         int count = 0;
//         int i = 0;
//         int ind = 0;
//         while(i < n) {
//             int sum = 0;
//             ind = i + 1;
//             while(true){
//                 if(i < n){
//                     sum += arr[i];
//                     if (sum == k) {
//                         count++;
//                         i++;
//                         break;
//                     } else if (sum > k) {
//                         i = ind;
//                         break;
//                     }
//                     i++;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// 18/05/2026
///////////// Problem -> 1
// Chef is planning to setup a secure password for his Codechef account. 
// For a password to be secure the following conditions should be satisfied:
// Password must contain at least one lower case letter 
// [a−z];
// Password must contain at least one upper case letter [A−Z] 
// strictly inside (first or the last character won’t be considered)
// Password must contain at least one digit 
// [0−9] strictly inside;
// Password must contain at least one special character from the set 
// {
// { '@', '#', '%', '&', '?' 
// }
// } strictly inside;
// Password must be at least 
// 10
// 10 characters in length, but it can be longer.

// Chef has generated several strings and now wants you to check whether 
// the passwords are secure based on the above criteria. Please help Chef in doing so.

// Input
// First line will contain 
// T
// T, number of testcases. Then the testcases follow.
// Each testcase contains of a single line of input, string 
// S
// S.
// Output
// For each testcase, output in a single line "YES" 
// if the password is secure and "NO" if it is not.


// public class problem {

//     static boolean check(String str){
//         if(str.length() < 10){
//             return false;
//         }

//         boolean lower = false;
//         boolean upper = false;
//         boolean digit = false;
//         boolean special = false;

//         String s = "@#%&?";

//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);

//             if(Character.isLowerCase(ch)){
//                 lower = true;
//             }

//             if(i > 0 && i < str.length() - 1){
//                 if(Character.isUpperCase(ch)){
//                     upper = true;
//                 }
//                 if(Character.isDigit(ch)){
//                     digit = true;
//                 }
//                 if(s.indexOf(ch) != -1){
//                     special = true;
//                 }
//             }
//         }

//         return lower && upper && digit && special;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();

//         for(int i = 0; i < t; i++){
//             String str = sc.next();

//             if(check(str)){
//                 System.out.println("YES");
//             }
//             else{
//                 System.out.println("NO");
//             }
//         }
//     }
// }




///////////// Problem -> 2
// Reverse a string:
// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         // method - 1
//         String rev = "";
//         for(int i = str.length() - 1; i >= 0; i--){
//             char ch = str.charAt(i);
//             rev += ch;
//         }

//         System.out.println(rev);

//         // method - 2
//         int left = 0;
//         int right = str.length() - 1;
//         char[] ch = str.toCharArray();

//         while(left <= right){
//             char temp = ch[left];
//             ch[left] = ch[right];
//             ch[right] = temp;

//             left++;
//             right--;
//         }
//         System.out.println(ch);
//     }
// }