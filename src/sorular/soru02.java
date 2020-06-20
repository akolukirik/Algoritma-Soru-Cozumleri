/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorular;

import java.util.Scanner;

/**
 *
 * @author aakol
 */
public class soru02 {

    public static void main(String[] args) {
        //1 ile 10 arasında olan sayıların ekrana yazılışı ve toplamını alma.

        int i;

        int toplam = 0;

        /*41 satırda başta 0 olan ifademize kendisi ve i sayısını ekleyerek toplama işlemi yaptırmış oluyoruz.
        bunu şu şekilde düşünebiliriz.
        başta 0 olan toplamamız için;
        toplam = toplam+i aslında bu şekilde yazıyor,
        0 = 0+1 bu işlem sonrası artık toplamımız 1 oldu
        1 = 1+2 = 3
        3 = 3+3 = 6
        6 = 6+4 = 10
        10 = 10+5 = 15
        15 = 15+6 = 21
        21 = 21+7 = 28
        28 = 28+8 = 36
        36 = 36+9 = 45 
        
        toplam en son 45 oldu.
      
         */
        for (i = 1; i < 10; i++) {
            toplam = toplam + i; // toplam+=i şeklinde de yazabiliriz aynısıdır.
            System.out.print(i + "+");

        }
        // '\n' komutu bir alt satıra geçme işlemi için kullanılır.
        
        System.out.println("\nsayılar toplamı: " + toplam);

    }

}
