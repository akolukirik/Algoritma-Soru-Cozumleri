package algoritma;

public class soru01 {

	public static void main(String[] args) {

		/*
		 * int x,y diye belirtmi� oldu�umuz k�s�mda, program�n�zda �al��mas� i�in
		 * verilecek say� de�erlerini tan�mlam�� olduk. Bunu bilinmeyenli denklem
		 * ��zmeye benzetebiliriz. K�saca x de�eri bizler i�in her hangi bir say�y�
		 * belirtecektir. Burayada kullan�l�n x,y yerine akl�n�za gecelecek ba�ka
		 * �ekillerde isim vermeniz ve de�i�ken tan�mlan�z m�mk�nd�r. Girilecek de�erler
		 * i�inde farkl� olarak bir ka� �ekilde de�i�kenlerime de�er atamam�z m�mk�nd�r.
		 * *
		 */

		// Bu k�s�mda de�i�kenlerimizi tan�mlad�ktan sonra de�er verdik.

		int x, y;
		x = 5;
		y = 2;

		// Dilersek bu �ekilde de yine de�i�kenlerimize de�er atamam�z m�mk�nd�r.

		int a = 7;
		int b = 8;

		// ��lemlerimizi yaparken matematikte kulland���m�z d�zende i�lemleri
		// ger�ekle�tiriyoruz.

		// "sonuc" de�i�kenimizi farkl� yollar� g�rebilmemiz ad�na kullanca��z. (integer
		// de�er ald���n� i�in int �eklinde tan�mlamam�z gerekmektedir.) Unutmay�n
		// de�i�kene istedi�iniz ad� verebilirsiniz

		// x eksi y i�lemini ger�ekle�tirdikten sonra, elde etmi� oldu�umuz say�y� sonuc
		// de�i�kenine e�itlemi� olduk ve ��kt�s�n� ald�k. Integer ifadelerde ��kt�
		// al�rken de�i�ken t�rnak i�inde yaz�lmaz.

		int sonuc;

		sonuc = x - y;

		System.out.println(sonuc);

		// ya da

		System.out.println(x - y);

		// her iki i�lemde ayn� sonucu verir.

		// Benzer �ekilde di�er i�lemlerimizi yapal�m..
		// toplama

		sonuc = x + y;

		System.out.println(sonuc);

		System.out.println(x + y);

		// �arpma

		sonuc = x * y;

		System.out.println(sonuc);

		System.out.println(x * y);

		// b�lme (b�lme i�lemini daha sa�l�kl� yapmak i�in sonuc de�i�kenimizi integer
		// yerine float ya da double olarak de�i�tirebiliriz)

		float sonuc1;

		sonuc1 = x / y;

		System.out.println(sonuc1);

		System.out.println((x / y)); // sonuc de�i�keni float de�er ald��� i�in ��kt�da g�r�lece�i �zere say� tam
										// say� olarak yaz�lm��t�r.
	}

}
