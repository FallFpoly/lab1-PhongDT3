/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double diem; 
        String hoten;
        System.out.print("Nhap ho ten: ");
        hoten=sc.nextLine();
        System.out.print("Nhap diem TB: ");
        diem=sc.nextDouble();
        System.out.println("<<Ho va ten>>: "+hoten);
        System.out.println("<<Diem>>: "+diem);
    }
}
