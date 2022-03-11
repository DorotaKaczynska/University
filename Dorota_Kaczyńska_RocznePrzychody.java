/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roczneprzychody;

import java.util.Scanner;

/**
 *
 * @author Dorota
 */
public class RocznePrzychody {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Program służy do obliczania przychodów z dowolnej liczby miesięcy.");
        int liczbaMiesiecy;
        System.out.println("Proszę wprowadzić liczbę miesięcy:");
        Scanner scanner = new Scanner(System.in);
        liczbaMiesiecy = scanner.nextInt();
        double suma = 0;
        double srednia;
        double min = 0;
        double max = 0;
        
        for (int i = 0; i < liczbaMiesiecy; i++)
        {
        System.out.println("Proszę podać przychód za miesiąc " + (i+1));
        double przychod = scanner.nextDouble();
        suma += przychod;
            if (i == 0)
            {
                min = przychod;
                max = przychod;
            }
            else 
            {
                if (przychod < min) min = przychod;
                if (przychod > max) max = przychod;
            }
        }
        
        srednia = suma / liczbaMiesiecy;
        System.out.println("Suma przychodów wynosi: " + suma);
        System.out.println("Średni przychód wynosi: " + srednia);
        System.out.println("Minimalny przychód wynosi: " + min);
        System.out.println("Maksymalny przychoód wynosi: " + max);
        System.out.println("Koniec obliczeń");
    }
    
}
