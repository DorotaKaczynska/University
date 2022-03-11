/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablice;

/**
 *
 * @author Dorota
 */
public class Tablice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double[][] m = {
            {1,2,3},
            {4,5,6}
            
        };
          
          /*{a1 = [0][0] ,b1 = [0][1] ,c1 = [0][2]}
            {a2 = [1][0], b2 = [1][1] ,c2 = [1][2]}*/
          
        double tw[][] = 
        {
            {m[0][0],m[0][1]},
            {m[1][0],m[1][1]}
        }; 
         //System.out.print(tw[0][1] + " " + tw[1][0]);
        double w  = det2(tw);
        
        System.out.println("Wyznacznik = " + w);
        
        double twx[][] =
        {
            {m[0][2],m[0][1]},
            {m[1][2],m[1][1]}
        };
        double wx = det2(twx)/w;
        
        System.out.println("X = " + wx);
        
        double twy[][] =
        {
            {m[0][0],m[0][2]},
            {m[1][0],m[1][2]}
        };
        double wy = det2(twy)/w;
        
        System.out.println("Y = " + wy);
    }
    
    public static double det2 (double[][] t)
    {
       double det = t[0][0]*t[1][1] - t[0][1]*t[1][0];  
       return det;
    }
    
    public static double det3 (double[][] t)
    {
        double det = t[0][0]*t[1][1]*t[2][2] + t[1][0]*t[2][1]*t[0][2]
                + t[2][0]*t[0][1]*t[1][2] - (t[0][2]*t[1][1]*t[2][0]
                + t[1][2]*t[2][1]*t[0][0] + t[2][2]*t[0][1]*t[1][0]);
        return det;
    }
    
    public static void rownanie ()
    {
        
    }
    
}
