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
public class soru01 {

    public static void main(String[] args) {
        
        // Kullanıcıdan alınan 2 sayıdan büyük olanı bulan program.

        //Kullanıcıdan sayılarımızı aldık
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = scan.nextInt();
        System.out.print("Sayı giriniz: ");
        int b = scan.nextInt();

        //Aldığımız sayıların doğruluğunu kontrol etmek için yazdırdık
        System.out.println("Birinci sayı: " + a);
        System.out.println("İkinci sayı: " + b);

        /*Sayılarımız arasından büyük olanı bulmak için if ile kontrol sağlıyoruz
        * Bu işlemde 3 durumumuz olacak, a büyük, b büyük ya da 2 sayı birbirine eşit
        * sırasıyla bunların kontrolü sağlıyoruz.
         */
        if (a > b) {
            // a sayısı b den büyükse büyük olan sayı a dan büyüktür.
            System.out.println("a sayısı b sayısından büyüktür");
        } else if (a == b) {
            // sayıların eşit olmadı durumunu kontrol ediyoruz.
            System.out.println("a ve b sayıları birbirine eşittir ");
        } else {
            // a saysı b'den büyük değil ve ya a ve be birbirine eşit değilse, b sayısı a sayısından büyüktür. Bu yüzden else if kullanmamıza gerek kalmıyor.
            System.out.println("b sayısı a sayısından büyüktür");
        }

    }

}
