package javastatements;

import java.util.Scanner;

public class IfCondition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        isEligibleForVote(age);
    }
    public static void isEligibleForVote(int age) {
        if (age >= 18) {
            System.out.println("Eligible for vote");
        }
        System.out.println("Hello");
    }

    }

