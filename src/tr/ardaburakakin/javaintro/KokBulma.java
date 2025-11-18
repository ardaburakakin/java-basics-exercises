/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tr.ardaburakakin.javaintro;


import java.awt.BorderLayout;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Ardab 
 */
public class KokBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Scanner girdi=new Scanner(System.in);
         int a;
         System.out.println("Denklemdeki a sayısınızı giriniz");
         a=girdi.nextInt();
         int b;
         System.out.println("Denklemdeki b sayısını giriniz");
         b=girdi.nextInt();
         int c;
         System.out.println("Denklemdeki c sayısını giriniz");
         c=girdi.nextInt();
         double Delta=Math.pow(b, 2)-4*a*c;
         if (Delta>0) {
             System.out.println((-b+ Math.pow(Delta, 1/2))/2*a);
             System.out.println((-b- Math.pow(Delta, 1/2))/2*a);
         }
         
         else if (Delta==0) {
           System.out.println(-b/2*a);
        
             
         }
             else 
                     System.out.println("Reel Kok Yoktur");
                     
         }
         }
                
    
         

// TODO code application logic here
    
