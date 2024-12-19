package javaegitimi.metodlar;

//
public class Metodlar2 {

	public static void main(String[] args) {
		String metin = "Yaşa Fenerbahçe!";
		int sonuc = diziTopla(1,2,3,4,5,6,7);
		System.out.println(sonuc);
		
		int sonuc2 = topla(3,5);
		System.out.println(sonuc2);

	}

	public static void ekle() {
		
	}
	
	public static void sil() {
		
	}
	
	public static void guncelle() {
		
	}
	//içine değişken alan fonksiyon
	public static int topla(int s1,int s2) {
		return s1+s2;
	}
	//variable arguments örneği
	public static int diziTopla(int... x) {
		int toplam = 0;
		
		for(int sayi:x) {
			
			toplam = toplam+sayi;
		}
		
		return toplam;
	}
	
}
