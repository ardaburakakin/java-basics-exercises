/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package arda;

import java.util.Scanner;

/**
 *
 * @author ARDA
 */
public class VizeFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       Scanner girdi=new Scanner (System.in);
       int VizeN,FinalN;
       System.out.println("Vize Notunuzu Giriniz");
       VizeN=girdi.nextInt();
       System.out.println("Final Notunu Giriniz");
       FinalN=girdi.nextInt();
       double not=VizeN*0.4+FinalN*0.6;
       System.out.println("Ortalama Sonucunuz : "+not);
        // TODO code application logic here
    }
}
