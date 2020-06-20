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
public class soru05 {

    public static void main(String[] args) {

        //Kullanıcıdan alınan vize ve final notunun harf karşılığını yazan program
        int v, f;
        float ort;

        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz: ");
        v = scan.nextInt();
        System.out.println("final notunuzu giriniz: ");
        f = scan.nextInt();

        ort = (float) (v * 0.4 + f * 0.6);
        System.out.println("\nOrtalamanız =" + ort);

        if (ort >= 90 && ort <= 100) {
            System.out.println("Not AA");
        } else if (ort >= 85 && ort < 90) {
            System.out.println("Not BA");
        } else if (ort >= 75 && ort < 85) {
            System.out.println("Not BB");
        } else if (ort >= 70 && ort < 75) {
            System.out.println("Not CB");
        } else if (ort >= 60 && ort < 70) {
            System.out.println("Not CC");
        } else if (ort >= 50 && ort < 60) {
            System.out.println("Not DC");
        } else {
            System.out.println("Not FF");
        }

    }

}
