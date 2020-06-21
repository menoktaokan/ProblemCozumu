package com.okan;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrayAltKumeleriApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ana küme oluşturulur
		int[] anaKume = new int[5];

//		 ana kümenin elemanları alınır
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ". elemanı giriniz:");
			anaKume[i] = sc.nextInt();
		}

		// alt kümeler ve toplamları yazdırılır
		System.out.println("\nAra Toplam\tAlt küme");

		int enBuyukToplam = 0; // en büyük alt küme toplamı

		for (int i = 0; i < anaKume.length; i++) {
			Set<Integer> altSet = new TreeSet<Integer>(); //alt kümeler anlık oluşturulur
			for (int j = i; j <= anaKume.length; j += 3) {
				altSet.clear();
				altSet.add(anaKume[i]);
				for (int k = j; k < anaKume.length; k += 2) {
					altSet.add(anaKume[k]);
					int araToplam = 0;
					for (Integer integer : altSet) {
						araToplam += integer;
					}
					if (araToplam > enBuyukToplam)
						enBuyukToplam = araToplam;
					if (altSet.size() > 1)
						System.out.println(araToplam + "\t\t" + altSet.toString());

					if (j - i == anaKume.length - 2 && j == anaKume.length - 2)
						j -= 2;
				}
			}
		}

		System.out.println("\nEn büyük toplam " + enBuyukToplam + " olur.");

	}

}
