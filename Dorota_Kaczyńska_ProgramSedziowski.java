/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programsedziowski;

import java.util.Scanner;

/**
 *
 * @author Dorota
 */
public class ProgramSedziowski {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Program służy do obliczania średniej oceny sędziów.");
        int liczbaSedziow;

        Scanner scanner = new Scanner(System.in);
        boolean poprawnoscDanych = true;
        
        do 
        {
          System.out.println("Proszę wprowadzić liczbę sędziów (od 3 do 10):");
          liczbaSedziow = scanner.nextInt();
          if (liczbaSedziow < 3 || liczbaSedziow > 10)
            {
                poprawnoscDanych = false;
                System.out.println("Nieprawidłowa liczba sędziów.");
            }
            else poprawnoscDanych = true;
        }
        while (!poprawnoscDanych);
        
        char znak;
        do
        {
        
            double suma = 0;
            double srednia;
            double min = 0;
            double max = 0;
            double punkty = 0;
        
            for (int i = 0; i < liczbaSedziow; i++)
            {
             boolean poprawnoscPunktow = true;
                do
                {
                    System.out.println("Proszę podać ocenę sędziego nr " + (i+1));
                    punkty = scanner.nextDouble();
                    if (punkty < 0 || punkty > 10)
                    {
                     poprawnoscPunktow = false;
                     System.out.println("Nieprawidłowa liczba punktów.");
                    }
                    else poprawnoscPunktow = true;
                }
                while (!poprawnoscPunktow);
            
        
                suma += punkty;
                    if (i == 0)
                    {
                        min = punkty;
                        max = punkty;
                    }
                    else 
                    {
                        if (punkty < min) min = punkty;
                        if (punkty > max) max = punkty;
                    }
            }
        
            suma = suma - min - max;
            srednia = suma / (liczbaSedziow - 2);
            System.out.println("Średni punktów wynosi: " + srednia);
            System.out.println("Czy chcesz wprowadzić wyniki kolejnego zawodnika? [T = tak, Inny znak = nie]");
             
               znak = scanner.next().charAt(0);
        }
        while (znak == 'T');
        System.out.println("Koniec programu.");
    }
    
}
