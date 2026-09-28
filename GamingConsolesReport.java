/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamingconsolesreport;

/**
 *
 * @author Student
 */
public class GamingConsolesReport {

    public static void main(String[] args) {
        // 1. Declare and populate single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // 2. Declare and populate two-dimensional array for sales
        // Rows represent cities, Columns represent console types (PS5, XBOX, SWITCH)
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Print Header
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");

        // Print Sales Data
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = 0;
        String topCity = "";
        int[] cityTotals = new int[cities.length];

        // Calculate and print totals for each city, and track the highest
        for (int i = 0; i < cities.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                rowTotal += sales[i][j];
            }
            cityTotals[i] = rowTotal;
            System.out.printf("%-18s %d%n", cities[i], rowTotal);

            // Check for most sales
            if (rowTotal > maxSales) {
                maxSales = rowTotal;
                topCity = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------");
    }
}
    
    

