package com.company;

import java.util.Random;

public class Main2 {
    public static void main(String[] args){

        int age;
        Random rnd = new Random();

        age = rnd.nextInt(200) + 1;
        System.out.println("Age = "+age);

        if(age>0 && age<=6){
            System.out.println("детсадовец");
        }
        if(age>=7 && age<=17){
            System.out.println("школьник");
        }
        if(age>=18 && age<=25){
            System.out.println("студент");
        }
        if(age>=26 && age<=55){
            System.out.println("рабочий");
        }
        if(age>=56 && age<=120){
            System.out.println("рабочий");
        }
        if(age>120){
            System.out.println("столько не живут");
        }

    }
}
