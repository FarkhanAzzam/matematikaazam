/*
import java.util.Scanner;


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daisy
 */
public class matematikaazamberaksi {
     public static void main (string[] args){
        Scanner input = new Scanner(System.in);
        
        matematikaazamberaksi mtk= new matematikaazamberaksi();
        mtk.pilihan();
        
         System.out.println("Masukkan Pilihan anda : ");
         mtk.pilihan = input.nextInt();
         
         System.out.println("Masukkan angka pertama : ");
         mtk.angka1 = input.nextInt();
         
         System.out.println("Masukkan angka kedua : ");
         mtk.angka2 = input.nextInt();
         
         mtk.getpilihan();
     }
}

    