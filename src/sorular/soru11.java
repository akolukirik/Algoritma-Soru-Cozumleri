/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorular;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author aakol
 */
public class soru11 {

    public static void main(String[] args) {

        //magic square yapan program
        int toplam = 0;
        int toplam2 = 0;
        int toplam3 = 0;
        int toplam4 = 0;
        int toplam5 = 0;

        int[][] m = new int[3][3];

        List<Integer> liste = Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6);
        // shuffle etmede bunu denerseniz çalıştığını görebilirsiniz
        //Collections.shuffle(liste);

        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = liste.get(k);
                k++;
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");

        }
        for (int i = 0; i < 3; i++) {
            toplam += liste.get(i);
        }
        System.out.println("Birinci satır "+toplam);
        
        for (int j = 3; j < 6; j++) {
            toplam2 += liste.get(j);
        }
        System.out.println("İkinci satır " +toplam2);
        
        for (int l = 6; l < 9; l++) {
            toplam3 += liste.get(l);
        }
        System.out.println("Üçüncü satır "+toplam3);
        
        toplam4 = liste.get(0) + liste.get(4) + liste.get(8);
        System.out.println("Soldan çapraz "+toplam4);
        
        toplam5 = liste.get(2) + liste.get(4) + liste.get(6);
        System.out.println("Sağdan çapraz "+toplam5);
        
        if (toplam == 15 && toplam2 == 15 && toplam3 == 15 && toplam4 == 15 && toplam5 == 15) {
            System.out.println("doğru sonuç");

        }

    }

}
