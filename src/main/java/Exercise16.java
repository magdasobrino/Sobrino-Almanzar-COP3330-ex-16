/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args){

        int age, legalAge = 16;
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is your age?");
        age = scnr.nextInt();

        if(age >= legalAge){
            System.out.println("You are old enough to legally drive.");
        }
        else{
            System.out.println("You are not old enough to legally drive.");
        }


        System.exit(0);
    }//end of main

}//end of program

