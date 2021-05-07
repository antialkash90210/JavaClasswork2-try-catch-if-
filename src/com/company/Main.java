package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//    	int a = 8768;
//
//		Scanner input = new Scanner(System.in);
//		try{
//			a = input.nextInt();
//		}
//		catch (Exception e){
//			System.out.println("Ошибка ввода программа будет закрыта" +e.getMessage());
//			return;


        int a = 8768;

        Scanner input = new Scanner(System.in);
        try{
            a = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Ошибка ввода программа будет закрыта" +e.getMessage());
            a = 15;


        }

        System.out.println(a);
    }
}
