/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesapp;

/**
 *
 * @author Student
 */
public class MattressSalesApp {

    public static void main(String[] args) {
    int[][] sales = {
        {300, 150, 700},   // Month 1: Q1, Q2, Q3
        {250, 200, 600}    // Month 2: Q1, Q2, Q3
       
    };

    // Create a ProductSales object so we can use its methods
    MattressSales report = new MattressSales();

    System.out.println("PRODUCT SALES REPORT - 2026");
    System.out.println("-----------------------------");
    System.out.println("Total product sales:   " + report.TotalSales(sales));
    System.out.println("Average product sales: " + Math.round(report.AverageSales(sales)));
    System.out.println(report. PopularSales (product) + "Most Popular Product:  ");
    System.out.println("-----------------------------");
}
}

