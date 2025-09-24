/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d,r;
        System.out.print("Nhap chieu dai: ");
        d=sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        r=sc.nextDouble();
        System.out.println("Chu vi hinh chu nhat la: "+((d+r)*2));
        System.out.println("Dien tich hinh chu nhat la: "+(d*r));
        System.out.println("Canh nho nhat la: "+Math.min(d, r));
    }
}
