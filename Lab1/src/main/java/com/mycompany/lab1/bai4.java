/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,delta;
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        System.out.print("Nhap c: ");
        c=sc.nextDouble();
        delta=Math.pow(b, 2)-4*a*c;
        System.out.println("Delta = "+delta);
        if (delta>=0) {
            System.out.println("Can delta la: "+Math.sqrt(delta));
        } else {
            System.out.println("Delta am nen khong co can");
        }
    }
}
