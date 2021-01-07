package com.company;

import java.util.Scanner;

public class Main1c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("N > 2: ");
        int N = sc.nextInt();
        System.out.println("M = 2: ");
        int M = sc.nextInt();
        int R = N % M;
        System.out.println("R: "+R);
        int P = N-1;
        System.out.println("P: "+P);
        if(R==0){System.out.println("N is NOT a prime number");}
            else {
            if (M < P) {System.out.println("M = M + 1 = " + (M + 1)); }
            else {System.out.println("N is a prime number"); }
        }
    }
}
