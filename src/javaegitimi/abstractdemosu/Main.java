package javaegitimi.abstractdemosu;

public class Main {

	public static void main(String[] args) {
		MusteriYonetimi musteri = new MusteriYonetimi();
		musteri.databaseManager = new OracleDBManager();
		musteri.musteriGetir();

	}

}
