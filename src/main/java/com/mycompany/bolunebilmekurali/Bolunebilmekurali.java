/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bolunebilmekurali;

import java.util.Scanner;

/**
 *
 * @author sss
 */
public class Bolunebilmekurali {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("sayiyi giriniz"); int sayi = sc.nextInt();
    if (sayi%15==0){System.out.println("sayi hem 3 e hemde 5 e bolunur.");
    }else{ if(sayi%3==0){System.out.println("sayi sadece 3 e bolunur");
    }else{ if(sayi%5==0){System.out.println("sayi sadece 5 e bolunur");
    }else{ System.out.println("sayi 5 veya 3 e bolunmez");
    }
    }
        
    }
}
}