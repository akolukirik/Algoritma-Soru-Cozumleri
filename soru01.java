package algoritma;

public class soru01 {

	public static void main(String[] args) {

		/*
		 * int x,y diye belirtmiþ olduðumuz kýsýmda, programýnýzda çalýþmasý için
		 * verilecek sayý deðerlerini tanýmlamýþ olduk. Bunu bilinmeyenli denklem
		 * çözmeye benzetebiliriz. Kýsaca x deðeri bizler için her hangi bir sayýyý
		 * belirtecektir. Burayada kullanýlýn x,y yerine aklýnýza gecelecek baþka
		 * þekillerde isim vermeniz ve deðiþken tanýmlanýz mümkündür. Girilecek deðerler
		 * içinde farklý olarak bir kaç þekilde deðiþkenlerime deðer atamamýz mümkündür.
		 * *
		 */

		// Bu kýsýmda deðiþkenlerimizi tanýmladýktan sonra deðer verdik.

		int x, y;
		x = 5;
		y = 2;

		// Dilersek bu þekilde de yine deðiþkenlerimize deðer atamamýz mümkündür.

		int a = 7;
		int b = 8;

		// Ýþlemlerimizi yaparken matematikte kullandýðýmýz düzende iþlemleri
		// gerçekleþtiriyoruz.

		// "sonuc" deðiþkenimizi farklý yollarý görebilmemiz adýna kullancaðýz. (integer
		// deðer aldýðýný için int þeklinde tanýmlamamýz gerekmektedir.) Unutmayýn
		// deðiþkene istediðiniz adý verebilirsiniz

		// x eksi y iþlemini gerçekleþtirdikten sonra, elde etmiþ olduðumuz sayýyý sonuc
		// deðiþkenine eþitlemiþ olduk ve çýktýsýný aldýk. Integer ifadelerde çýktý
		// alýrken deðiþken týrnak içinde yazýlmaz.

		int sonuc;

		sonuc = x - y;

		System.out.println(sonuc);

		// ya da

		System.out.println(x - y);

		// her iki iþlemde ayný sonucu verir.

		// Benzer þekilde diðer iþlemlerimizi yapalým..
		// toplama

		sonuc = x + y;

		System.out.println(sonuc);

		System.out.println(x + y);

		// çarpma

		sonuc = x * y;

		System.out.println(sonuc);

		System.out.println(x * y);

		// bölme (bölme iþlemini daha saðlýklý yapmak için sonuc deðiþkenimizi integer
		// yerine float ya da double olarak deðiþtirebiliriz)

		float sonuc1;

		sonuc1 = x / y;

		System.out.println(sonuc1);

		System.out.println((x / y)); // sonuc deðiþkeni float deðer aldýðý için çýktýda görüleceði üzere sayý tam
										// sayý olarak yazýlmýþtýr.
	}

}
