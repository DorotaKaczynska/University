/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programdlasprintera;

import java.util.Scanner;

/**
 *
 * @author Dorota
 */
public class ProgramDlaSprintera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program służy do przyśpieszenia oceny wynkików sprintera.");
        System.out.println("Proszę podawać kolejne czasy. Czas równy 0 oznacza koniec wprowadzania danych.");
        
        double wynik = 1;
        double suma = 0;
        double najlepszy = 0;
        double najgorszy = 0;
        int liczbaWynikow = 0;
        double srednia;
        
        while (wynik != 0)
        {
            do
            {
                System.out.println("Proszę podać czas:");
                wynik = scanner.nextDouble();
                if (wynik < 0)
                    System.out.println("Podana wartość jest nieprawidłowa.");
            }
            while (wynik < 0);
            
            suma += wynik;
            liczbaWynikow++;
            if (wynik != 0){
              if (liczbaWynikow == 1)
                {
                    najlepszy = wynik;
                    najgorszy = wynik;
                }
                else
                {
                    if (wynik < najlepszy) najlepszy = wynik;
                    if (wynik > najgorszy) najgorszy = wynik;
                }  
            }
            
        }
        srednia = suma / (liczbaWynikow - 1);
        System.out.println("Najlepszy wynik wynosi: " + najlepszy);
        System.out.println("Najgorszy wynik wynosi: " + najgorszy);
        System.out.println("Średnia wyników wynosi: " + srednia);
        System.out.println("Koniec programu.");
    }
    
}
