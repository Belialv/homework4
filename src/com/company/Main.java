package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	Scanner x =  new Scanner(System.in);
        System.out.println("Введите радиус первого шара:");
    int a = x.nextInt();
        System.out.println("Введите радиус второго шара:");
    int b = x.nextInt();
        System.out.println("Введите радиус третьего шара:");
    int c = x.nextInt();
        System.out.println("Введите коэффициент плотности снежных шаров:");
    int d = x.nextInt();
       double y = ((4/3)*Math.PI);
       double v1 = (y * a);
       double v2 = (y * b);
       double v3 = (y * c);
        System.out.println("Вес Вашего снеговика" + (d * v1) + (d * v2) + (d * v3));


    }
}
