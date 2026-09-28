/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamingconsolesreport;

/**
 *
 * @author Student
 */
public class ConsolesSales {
    public class ConsoleSales extends Consoles {

    // Constructor that accepts parameters and passes them to the superclass
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the report
    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("---------------------------------");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : R" + getTotalSales());
        System.out.println("---------------------------------");
    }
}
    
}
