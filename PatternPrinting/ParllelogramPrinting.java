import java.util.Scanner;

//      * * * * *
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *

class ParllelogramPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//      1 2 3 4 5
//     1 2 3 4 5
//    1 2 3 4 5 
//   1 2 3 4 5
//  1 2 3 4 5

class ParllelogramPrintingNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k = 0; k<n-i;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<n;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}

//      A B C D E
//     A B C D E
//    A B C D E 
//   A B C D E
//  A B C D E

class ParllelogramPrintingAlpha {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k = 0; k<n-i;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<n;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}