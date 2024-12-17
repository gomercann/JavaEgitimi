package javaegitimi.stringler;

public class Stringler2 {

	public static void main(String[] args) {
	String metin = "Fenerbahçe sen çok yaşa!";
	
	//metindeki harfleri değiştirme
	String yeniMetin = metin.replace(' ', '_');
	System.out.println(yeniMetin);
	
	//metnin n. indeksten itibaren kesme.
	System.out.println(metin.substring(2));
	
	//metnin n. indexten, y. indekse kadar bölümünü kesme
	System.out.println(metin.substring(5,9));
	
	//metni tamamen küçük harfe çevirme.
	System.out.println(metin.toLowerCase());
	
	//metni tamamen büyük harfe çevirme
	System.out.println(metin.toUpperCase());
	
	//Metindeki dış boşlukları budama yapma. Varsa en başta ve en sondaki boşlukları yok eder.
	System.out.println(metin.trim());
	
	

	}

}
