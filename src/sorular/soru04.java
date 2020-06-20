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
public class soru04 {

    public static void main(String[] args) {
        //Kullanıcıdan alınacak 2 sayı aralığında ve kullanıcının istediği sayıya tam bölünen sayıları bulan program

        int buyuk, kucuk;

        // Kullanıcıdan verilerimizi aldık.
        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int a = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();

        System.out.print("Bölüm kontrol sayısı: ");
        int c = scan.nextInt();

        //Bu kısım, girilecek sayıların hangisinin büyük hangisinin küçük olduğunu bilmek ve ona göre döngü kurmamızı sağlıyor.
        if (a > b) {
            buyuk = a;
            kucuk = b;
        } else {
            buyuk = b;
            kucuk = a;
        }

        //küçük sayımızdan büyük sayımıza doğru döngümüzü kurduk ve tam bölünmesi istenen sayının 
        //modu alınarak tam bölünmesi kontrol edilip ekrana yazıldı.
        for (int i = kucuk; i < buyuk; i++) {
            if (i % c == 0) {
                System.out.print(i + "-");
            }
        }

    }

}
