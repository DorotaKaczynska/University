/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk_przeliczanie_jednostek;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class DK_Przeliczanie_jednostek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        do {
       
       System.out.println("Przeliczanie jednostek długości");
       
       double metry;
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj wartość w metrach: ");
        metry = scanner.nextDouble();
        
        if (metry >= 0) {
        
       double cale = metry*39.370;
       double c1 = Math.round(cale * 10000.0) / 10000.0;
       System.out.println("Wartość w przeliczeniu na cale: " + c1);
       
       double stopa = metry*3.2808;
       double s1 = Math.round(stopa * 10000.0) / 10000.0;
       System.out.println("Wartość w przeliczeniu na stopy: " + s1);
       
       double jard = metry*1.0936;
       double j1 = Math.round(jard * 10000.0) / 10000.0;
       System.out.println("Wartość w przeliczeniu na jardy: " + j1);
      
       double mila = metry*0.00062137;
       double m1 = Math.round(mila * 10000.0) / 10000.0;
       System.out.println("Wartość w przeliczeniu na mile lądowe: " + m1);
       
       double saznia = metry*0.5468066491688539;
       double sa1 = Math.round(saznia * 10000.0) / 10000.0;
       System.out.println("Wartość w przeliczeniu na sążnie: " + sa1);
       
       double milam = metry*0.00054;
       double mm1 = Math.round(milam * 10000.0) / 10000.0;
       System.out.println("Wartość w przeliczeniu na mile morskie: " + mm1);
       
       double lokiec = metry*1.6404199475065617;
       double l1 = Math.round(lokiec * 10000.0) / 10000.0;
       System.out.println("Wartość w przeliczeniu na łokcie: " + l1);
        }else {
            
            if (metry < 0) {
                System.out.println("Wartość ujemna nie może być wprowadzona");
            }    
        }
        System.out.println("Koniec");
        } while (true);
 
         
    }

   
}
