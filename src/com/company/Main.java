package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Tower of Hanoi Game. \n " +
                "This program will solve this problem for you.\n " +
                "Please input number of disks to solve for: ");

        Scanner sbr = new Scanner(System.in);
        Solve han = new Solve(sbr.nextInt());
        

    }
}
