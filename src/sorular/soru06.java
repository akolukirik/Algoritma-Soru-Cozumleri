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
public class soru06 {

    public static void main(String[] args) {

        // Tek dizi üzerinden, dizi elemanlarını tersten yazdırma.
        int i;

        int[] a = {0, 1, 2, 3, 4, 5, 6};

        // döngümüzü 0 --> x değeri yerine. x ---> 0 olarak kurduk ve tersten yazdırma işlemini gerçekleştirdik.
        for (i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + "-");
        }

    }

}
