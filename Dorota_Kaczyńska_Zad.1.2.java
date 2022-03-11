/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabela2;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Dorota
 */
public class Tabela2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Tabela przeliczników długości");
       int krok;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać wielkość kroku zwiększenia: ");
        krok = scanner.nextInt();
       int poczatek;
        System.out.println("Proszę podać wielkość początkową: ");
        poczatek = scanner.nextInt();       
       int koniec;
       System.out.println("Proszę podać wielkość końcową: ");
        koniec = scanner.nextInt();
        String space = scanner.nextLine();
        Formatter formatter = new Formatter();
        System.out.format("%-6s %-8s %-8s %-8s %-8s", "metry", "cale", "stopy", "jardy", "mile");
        System.out.println();
    int i = poczatek;
    int j = 1;
        for ( ; i <= koniec ;){
            
            double cal = i*39.370;
            double stopa = i*3.2808;
            double jard = i*1.0936;
            double mila = i*0.00062137;
            System.out.format("%-6d %-8.2f %-8.2f %-8.2f %-8.4f", i, cal, stopa, jard, mila);
            System.out.println();
            i += krok;
          
            j++;
            
            if (j%10 == 0){
                if (i > koniec) break;
                System.out.println("Naciśnij Enter by wyświetlić ciąg dalszy tabeli");
                String enter = scanner.nextLine();
            }
        }

   
     System.out.println("Naciśnij Enter aby zakończyć");
                String enter = scanner.nextLine();
                System.exit(0);  
    }
    
}
