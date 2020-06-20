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
public class soru00 {

    public static void main(String[] args) {

        // Kullanıcıdan alnın ifadenin istenilen sayı kadar ekrana yazan program.
        
        //Kullanıdan yazılması istenen ifade ve kaç adet yazılmasını istediği bilgisini aldık
        Scanner scan = new Scanner(System.in);
        System.out.print("Yazılmasını istedğini ifadeyi giriniz: ");
        String a = scan.nextLine();
        System.out.print("Yazı kaç defa yazılsın: ");
        int b = scan.nextInt();

        //Kullanıcının istediği sayıya kadar kurduğumuz döngüyle birlikte istenilen sayı kadar
        //yazılması istenilen ifadeyi ekrana yazdırma işlemini gerçekleştirdik.
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }

    }

}
