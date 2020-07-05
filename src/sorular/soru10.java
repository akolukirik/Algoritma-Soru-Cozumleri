/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorular;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aakol
 */
public class soru10 {

    public static void main(String[] args) {
        
        //girilen sayıyı rakam rakam ayıran program

        Scanner scan = new Scanner(System.in);
        System.out.println("sayıları giriniz");
        String a = scan.nextLine();

        ArrayList<Integer> liste = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            liste.add(Integer.parseInt(Character.toString(a.charAt(i))));

        }

        System.out.println(liste);

    }

}
