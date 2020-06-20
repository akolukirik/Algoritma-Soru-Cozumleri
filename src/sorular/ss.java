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
public class ss {

    public static void main(String[] args) {

        // Kullanıcıdan alınan 3 sayıdan en büyüğünü bulma ve büyükten küçüğe doğru sıralama.
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = scan.nextInt();
        System.out.print("Sayı giriniz: ");
        int b = scan.nextInt();
        System.out.print("Sayı giriniz: ");
        int c = scan.nextInt();

        //Aldığımız sayıların doğruluğunu kontrol etmek için yazdırdık
        System.out.println("Birinci sayı: " + a);
        System.out.println("İkinci sayı: " + b);
        System.out.println("İkinci sayı: " + c);

        int en_buyuk, ortanca, kucuk;

        /* Bu kısımda sayıların bir biri ile olan büyüklük kontrolünü sağladık, 39. sayırda gördüğünüz üzere && operatörü ve 
        *içeride bulunan işlemlerin tamamının doğru olması gerekmekte anlamında kullanılıyor
        * ve bu sayede bize daha rahat konrol sağlamamıza yardımcı oluyor.
        *|| operatörü ve anlamında gelir ve gerçekleşecek işlemlerden herhangi
        birisinin sağlamış olması yeterli olacaktır. 
         */
        if (a > b && a > c) {
            // eğer bu durum sağlanırsa en büyük sayı a sayıdır.
            System.out.println("En büyük sayı A sayısıdır: " + a);
            en_buyuk = a;
        } else if (b > c) {
            // yukarıda a>b durumu bypass edildiğinden doyaı else if kısmında b>a eklememize gerek kalmıyor.
            System.out.println("En büyük sayı B sayısıdır: " + b);
            en_buyuk = b;
        } else {
            // bu durumda a ve b en büyük değilse en büyük c dir.
            System.out.println("En büyük sayı C sayısıdır: " + c);
            en_buyuk = c;
        }

        if (a > b && a > c) {
            en_buyuk = a;
            if (b > c) {
                ortanca = b;
                kucuk = c;
            } else {
                ortanca = c;
                kucuk = b;
            }

        } else if (b > c) {
            en_buyuk = b;

        } else {
            c = en_buyuk;
        }

    }
