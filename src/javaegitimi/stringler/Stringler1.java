package javaegitimi.stringler;

public class Stringler1 {

	public static void main(String[] args) {
		String metin = "Seviyorum Merkez!";
		String metin2 = "Kodu kodu";
		System.out.println(metin);
		
		///Stringin uzunluğubu görme. lenght komutu ile gerçekleşir.
		System.out.println("String uzunluğu:"+ metin.length());
		
		
		/// n. elemana ulaşma.
		System.out.println("7. Eleman:"+ metin.charAt(7));
		
		///Birleştirme 
		System.out.println(metin.concat(metin2));
		
		//Sorgulamalar
		//Metin ilgili harfle başlıyorsa true, değilse false döndürür
		System.out.println(metin.startsWith("M"));
		
		//Metin ilgili harfle bitiyorsa true, değilse false döndürür
		System.out.println(metin.endsWith("!"));
				
		char[] harfler = new char[7];
		
		//metnin n. hanesinden, m. hanesine kadar ilgili diziye ata.
		metin.getChars(0, 3, harfler, 0);
		
		//metin içinde karakter arama. metin içinde ilk bulduğu yerde aramayı sonlandırır.
		System.out.println(metin.indexOf('r'));
		
		//metin içinde karakter arama. bu işlem metnin soundan itibaren arama yapmaya başlar.
		System.out.println(metin.lastIndexOf('r'));
	}

}
