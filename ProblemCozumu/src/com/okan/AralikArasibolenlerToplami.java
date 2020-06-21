package com.okan;

import java.util.Scanner;

public class AralikArasibolenlerToplami {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int bolenToplam = 0;
		int baslangic = baslangicBelirle();
		int bitis = bitisBelirle();

		// başlangıç değerinin itiş değerine eşit olma durumu
		if (baslangic == bitis) {
			System.out.println("Başlangış değeri ile bitiş değeri birbirine eşit. Lütfen tekrar deneyin.");
			baslangic = baslangicBelirle();
			bitis = bitisBelirle();
		} 

			// başlangıcın bitişten büyük olma durumu
			if (baslangic > bitis) {
				int d;
				d = baslangic;
				baslangic = bitis;
				bitis = d;
			}

			System.out.print("Bölen sayıyı giriniz:");
			int bolen = sc.nextInt();

			for (int i = baslangic; i <= bitis; i++) {
				if (i % bolen == 0) {
					System.out.println(i);
					bolenToplam += i;
				}
			}

			System.out.println(baslangic + " ile " + bitis + " arasındaki sayılardan " + bolen
					+ "'e tam bölünenlerin toplamı: " + bolenToplam);

		
	}

	public static int baslangicBelirle() {

		// başlangıç değeri alınıyor
		System.out.print("Aralığın başlangıç değerini giriniz:");
		int b = sc.nextInt();
		// başlangıç değeri için gerekli kontroller
		while (1 == 1) {
			if (b < 0 || b == 0) {
				System.out.print("Lütfen sıfırdan büyük pozitif bir değer giriniz:");
				b = sc.nextInt();
			} else
				break;
		}
		System.out.println();
		return b;
	}

	public static int bitisBelirle() {

		// bitiş değeri alınıyor
		System.out.print("Aralığın bitiş değerini giriniz:");
		int b = sc.nextInt();

		// bitiş değeri için gerekli kontroller
		while (1 == 1) {
			if (b < 0 || b == 0) {
				System.out.print("Lütfen sıfırdan büyük pozitif bir değer giriniz:");
				b = sc.nextInt();
			} else
				break;
		}
		System.out.println();
		return b;
	}

}
