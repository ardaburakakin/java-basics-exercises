/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tr.ardaburakakin.javaintro;


import java.util.Scanner;

/**
 *
 * @author Arda B
 */
public class KullaniciadiVeSifre {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
	Scanner input = new Scanner (System.in);
	String username="ArdaB1",pasword="123456";
	
	String kullanici_adi, sifre;
	System.out.println("Kullanıcı adını giriniz:");
	kullanici_adi=input.next();
	System.out.println("Şifrenizi giriniz:");
	sifre=input.next();
	
	if (username.equals(kullanici_adi) && pasword.equals(sifre))
	{
		System.out.println ("Sisteme başarıyla girildi!");
	}
	else 
	{
		System.out.println ("Kullanıcı adı veya şifre yanlış! Kontrol ederek tekarar deneyiniz.");
	}
	}
}
    
