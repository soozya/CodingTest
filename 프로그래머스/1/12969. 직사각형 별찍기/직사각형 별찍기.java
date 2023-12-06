import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int n = 1; n <= b; n++){
            for (int m = 1; m <= a; m++){
                System.out.print("*");
            }
        System.out.println();    
        }
    }
}