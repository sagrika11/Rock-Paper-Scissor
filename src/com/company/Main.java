package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("\tWELCOME IN MY JAVA WORLD\t");
        System.out.println("________________________________________");

            System.out.println("Choose out of Them : ");
            System.out.println("0 : Rock");
            System.out.println("1 : Paper");
            System.out.println("2 : Scissor");
        System.out.println("________________________________________");

        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Player 1 : Enter your name");
        String a=s.next();
        System.out.println("ENTER your choice " +a);
        int a1 = s.nextInt();

        int b1 = random.nextInt(3);


        if (a1 == b1) {
            System.out.println("opps!! Match Drawn");
        } else if (a1 == 0 && b1== 2 || a1==1 && b1==0||a1==2 && b1==1 )
        {
            System.out.println( " Hurray!! You won ");
        }
        else
        {
            System.out.println( " Poor !! You Loose");
        }

        System.out.println(" System Random input: " + b1);
        System.out.println("________________GAME OVER__________________");
    }
}