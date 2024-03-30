/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hw2;
import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to cyris's tax calc n/");
        System.out.print("Enter your income $");
        double income = scanner.nextDouble();
        
        double taxRate;
        if (income < 500) {
            taxRate = 0.1; 
        } else if (income < 1500) {
            taxRate = 0.15; 
        } else if (income < 2500) {
            taxRate = 0.20; 
        } else {
            taxRate = 0.30; 
        }
        
        double taxWithholding = income * taxRate;
        
        
        System.out.println("After tax check " + taxWithholding);
        
        scanner.close();
    }
}
