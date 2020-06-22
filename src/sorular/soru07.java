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
public class soru07 {

    public static void main(String[] args) {

        // diskriminant çözümü
        int a, b, c;
        float delta, x1, x2;

        //Kullanıcıdan a b c değerlerini aldık
        Scanner scan = new Scanner(System.in);
        System.out.print("a sayısı:");
        a = scan.nextInt();
        System.out.print("b sayısı:");
        b = scan.nextInt();
        System.out.print("c sayısı:");
        c = scan.nextInt();

        //deltayı hesapladık. b²-4ac 
        delta = (b * b) - 4 * a * c;
        System.out.println("Delta: " + delta);

        //Math.sqrt(x) işlemi bizlere sayının karakökünü almamızı sağlar.
        if (delta > 0) {
            System.out.println("Sistemim iki kökü var");
            x1 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
            x2 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            System.out.println("Çakışık kök var");
            x1 = (float) ((-b) / 2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("Sistemin kökü yoktur");
        }

    }

}
