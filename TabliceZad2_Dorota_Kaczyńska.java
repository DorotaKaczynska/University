/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablicezad2;

import java.util.Random;

/**
 *
 * @author Dorota
 */
public class TabliceZad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int [][] tab = new int[3][3];
        tab = WypelenijTablice(tab,3,12);
        Wypisz(tab);
        
        int [][] tab2 = new int[3][3];
        tab2 = WypelnijTabliceZJedynkami(tab2);
        Wypisz(tab2);
        
        int[][] tab3 = TransponujTablice1(tab);
        Wypisz(tab3);
       
        int [][] tab4 = TransponujTablice2(tab);
        Wypisz(tab4);
        int [][] tab5 = new int[3][2];
        int [][] tab6 = TransponujTablice2(tab5);
        Wypisz(tab6);
        
        int [][] tab7 = MnozenieMacierzy(tab, tab3);
        Wypisz(tab7);
    }
    
    public static void Wypisz(int[][] t)
    {
        if (t == null){
            System.out.println("Tablica jest pusta");
            System.out.println();
            return;
        }
        for(int i = 0;i<t.length;i++){
            for(int j = 0;j<t[i].length;j++){
                System.out.print(t[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static int[][] WypelenijTablice (int [][] t, int min, int max)
    {
       
       
        Random generator = new Random();
        for(int i = 0;i<t.length;i++){
            for(int j = 0;j<t[i].length;j++){
                 
                t[i][j] = generator.nextInt(max - min + 1) + min;
            }
        } 
        return t;
    }
    
    public static int[][] WypelnijTabliceZJedynkami(int[][] t)
    {
        
         for(int i = 0;i<t.length;i++){
            for(int j = 0;j<t[i].length;j++){
                if (j == i || j == t[i].length - (i - 1)){
                   t[i][j] = 1; 
                }
                else{
                    t[i][j] = 0;
                }
            }
        } 
        return t;
    }
    
    public static int [][] TransponujTablice1(int[][] t)
    {
        int [][] transT = new int[t[0].length][t.length];
         for(int i = 0;i<t.length;i++){
            for(int j = 0;j<t[i].length;j++){
                transT [j][i] = t[i][j];
            }
        } 
        return transT;
    }
    
    public static int[][] TransponujTablice2(int[][] t)
    {
        if(t.length != t[0].length){
            return null;
        }
        for(int i = 0;i<t.length - 2;i++)
        {
            for(int j = i+1;j<t.length - 1;j++)
            {
                t[i][j] = t[j][i];
            }
        }
        return t;
    }
    
    
    public static int[][] MnozenieMacierzy(int[][] A, int[][] B)
    {
        int tab[][] = new int[A.length][B[0].length];
        if (A[0].length == B.length)
        {
            for(int i=0; i<tab.length; i++)
            {
                for(int j=0; j<tab[i].length; j++)
                {
                    for (int k = 0; k < A[0].length; k++) {
                       tab[i][j] += A[i][k] * B[k][j];
                    }
                }
                
            }
        }
        return tab;
    }    
}
