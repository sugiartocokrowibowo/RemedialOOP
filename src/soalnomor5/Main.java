package soalnomor5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("INPUT:");
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int jum = 0;
        for(int i=1;i<=n;i++){
            System.out.print("b"+i+" = ");
            int b = sc.nextInt();
            jum += b;
        }
        System.out.println("OUTPUT:");
        System.out.println(jum);
    }
    
}
