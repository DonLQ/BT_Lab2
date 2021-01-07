package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("A:");
    int A =sc.nextInt();
    System.out.print("B:");
	int B =sc.nextInt();
	int C = A/B;
	if (B == 0){System.out.println("Error:divide by zero");}
    else{System.out.println("C:" + C);}

    }
}
