/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorular;

/**
 *
 * @author aakol
 */
public class soru03 {

    public static void main(String[] args) {

        //1’den 100’e kadar tek sayıları yazdıran algoritma
        
        /*döngümüz içerisinde 0'dan itibaren if kontrolümüzle sayının tek mi çift mi olduğunu kontrol ediyoruz
        2'ye mod aldığımızda sayımız ya 0 ya da 1 verecektir. 1 sonucu tek sonuc edeceğinde bu kontrolü sağladığı durumda
        sayımız tektir.
        */
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "-");
            }
        }
    }
}
