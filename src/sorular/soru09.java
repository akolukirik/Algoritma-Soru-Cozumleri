package sorular;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aakol
 */
public class soru09 {

    public static void main(String[] args) {

        //Girilen metinde sesli harf sayısı sayan yapan program
        Scanner scan = new Scanner(System.in);
        System.out.print("Yazınızı giriniz:");
        String yazi = scan.nextLine();
        int s = 0;
        int i;

        for (i = 0; i < yazi.length(); i++) {
            if (yazi.charAt(i) == 'a' || yazi.charAt(i) == 'e' || yazi.charAt(i) == 'ı' || yazi.charAt(i) == 'i'
                    || yazi.charAt(i) == 'o' || yazi.charAt(i) == 'ö' || yazi.charAt(i) == 'u'
                    || yazi.charAt(i) == 'ü') {
                s++;
            }

        }
        System.out.println("Sesli harf sayisi: " + s);

    }

}
