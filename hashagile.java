public class hashagile {
    public static void main(String[] args) {
        String str = "PROGRAM";
        int n = str.length();
        // for(int i = 0; i < str.length(); i++){
        //     for(int j = 0; j < str.length(); j++){
        //         // if(i == j || j == str.length() - 1 - i){
        //         //     System.out.print(str.charAt(i));
        //         // }
        //         // else{
        //         //     System.out.print(" ");
        //         // }

        //         if(i == j){
        //             System.out.print(str.charAt(i));
        //         }
        //         else if(i + j == str.length() - 1){
        //             System.out.print(str.charAt(str.length() - 1 - i));
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {

            for (int j = 0; j < (n - i - 2) * 2; j++) {
                System.out.print(" ");
            }

            System.out.println(str.charAt(i));
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
