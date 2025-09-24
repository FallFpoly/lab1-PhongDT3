/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhap a: ");
        a=sc.nextInt();
        System.out.print("Nhap b: ");
        b=sc.nextInt();
        System.out.print("Nhap c: ");
        c=sc.nextInt();
        double TB=(double)(a+b+c)/3;
        System.out.println("Trung binh cua 3 so la: "+TB);
    }
}
