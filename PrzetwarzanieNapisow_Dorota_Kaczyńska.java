/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package przetwarzanienapisow;

import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 *
 * @author Dorota
 */
public class PrzetwarzanieNapisow 
{

    public static String Odwrocony(String napis)
    {
        StringBuilder sb = new StringBuilder(napis);
        StringBuilder reverse = sb.reverse();
        String odwr = sb.toString();
        System.out.println("Słowo odwrócone: " + odwr);
        return napis;
    }
    
    public static String PrzestawioneSlowa(String napis)
    {
        String[] tabela1 = napis.split(" ");
        String builder = "";

        for (int i = (tabela1.length - 1); i >= 0; i--) {
            builder += tabela1[i] + " ";
        }
        System.out.println("Zdanie od końca: " + builder);
        return builder;
    }
    
    
    public static String Szyfruj(String napis,int klucz)
    {
        String szyfruj = "";
        
        for (int i = 0; i < napis.length(); i++)
        {
           if (Character.isUpperCase(napis.charAt(i)))
           {
               int characterIndex = (char)(napis.charAt(i)) - (char)('A');
               int characterShifted = (characterIndex + klucz) % 26 +  (char)('A');
               szyfruj += (char)(characterShifted);
           }
           else if (Character.isLowerCase(napis.charAt(i)))
           {
                int characterIndex = (char)(napis.charAt(i)) - (char)('a');
                int characterShifted = (characterIndex + klucz) % 26 +  (char)('a');
                szyfruj += (char)(characterShifted);
           }
           else if (Character.isDigit(napis.charAt(i)))
           {
               int  characterNew = ((int)(napis.charAt(i)) + klucz) % 10;
               szyfruj += (char)(characterNew);
           }
           else
           {
               szyfruj += napis.charAt(i);
           }
        }
        System.out.println("Treść zaszyfrowana: " + szyfruj);
        return szyfruj; 
    }
    
    public static String Odszyfruj(String napis, int klucz)
    {
       String odszyfruj = "";
        
        for (int i = 0; i < napis.length(); i++)
        {
           if (Character.isUpperCase(napis.charAt(i)))
           {
               int characterIndex = (char)(napis.charAt(i)) - (char)('A');
               int characterShifted = (characterIndex + klucz) % 26 +  (char)('A');
               odszyfruj += (char)(characterShifted);
           }
           else if (Character.isLowerCase(napis.charAt(i)))
           {
                int characterIndex = (char)(napis.charAt(i)) - (char)('a');
                int characterShifted = (characterIndex + klucz) % 26 +  (char)('a');
                odszyfruj += (char)(characterShifted);
           }
           else if (Character.isDigit(napis.charAt(i)))
           {
               int  characterNew = ((int)(napis.charAt(i)) + klucz) % 10;
               odszyfruj += (char)(characterNew);
           }
           else
           {
               odszyfruj += napis.charAt(i);
           }
        }
        System.out.println("Treść odszyfrowana: " + odszyfruj);
        return odszyfruj; 
    }
    
    public static String Uporzadkuj(String napis)
    {
        String tekst = napis.replaceAll("\\s+"," ").replaceAll("\\s+(?=[!,?.:;])", "");
        System.out.println("Tekst uporządkowany: " + tekst);
        return tekst;
    }
    
    public static int LiczbaWystapien(String napis, char znak) 
    {
        int suma = 0;
        char[] symbol = napis.toCharArray();
        for(int i = 0; i < symbol.length; i++) 
        {
            if(symbol[i] == znak)
            suma+=1;
        }
        System.out.println("Tekst uporządkowany: " + suma);
        return suma;
    }
    
    public static String Histogram(String napis)
    {
        napis = napis.toLowerCase();
        int[] litery = new int[26];
        for(int i = 0; i < 26; i++)
        {
            litery[i] = 0;
        }

        for(char s : napis.toCharArray())
        {
            int converted = (int) s;
            converted -= 97;
        if(converted >=0 && converted <=25)
            {
                litery[converted] += 1;
            }
        }
        
        for(int i = 0; i < 26; i++)
        {
            char konwersjaZAscii = (char) (i+97);
            String iks = "";
            for(int j = 0; j < litery[i]; j++)
            {
                iks += "x";
            }
        System.out.println(konwersjaZAscii + " " + iks + " - " + litery[i]);
        }
        return null;
    }
        
    public static boolean Palindrom(String napis) 
    {
        for (int i = 0; i < napis.length() /2; i++) 
        {
            char znak1 = napis.charAt(i);
            char znak2 = napis.charAt(napis.length() -1 -i);

            if (znak1 != znak2) {
                System.out.println("Słowo nie jest palindromem");
                return false;
            }
        }
        System.out.println("Słowo jest palindromem");
        return true;
    }
    
    public static boolean Anagram(String napis1, String napis2)
    {
        if (napis1.length() != napis2.length())
        {
            return false;
        }
        char[] znaki = napis1.toCharArray();  
  
        for (char c : znaki)   
        {  
            int index = napis2.indexOf(c);  
            if (index != -1)   
            {    
                napis2 = napis2.substring(0, index) + napis2.substring(index + 1, napis2.length());  
            }   
            else   
            {  
                return false;  
            }  
        }  
        return napis2.isEmpty();  
    }
    
}
    
   
