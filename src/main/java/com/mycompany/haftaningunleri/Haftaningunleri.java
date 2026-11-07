/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.haftaningunleri;

import java.util.Scanner;

/**
 *
 * @author sss
 */
public class Haftaningunleri {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = sc.nextInt();
        switch (sayi){
           case 1: System.out.println("pazartesi");break;
           case 2: System.out.println("sali");break;
           case 3:System.out.println("carsamba");break;
            case 4:System.out.println("persembe");break;
            case 5:System.out.println("cuma");break;
            case 6:System.out.println("cumartesi"); break;
            case 7:System.out.println("pazar");break;
            default:System.out.println("gecersiz");break;
            
        }
    }
}
