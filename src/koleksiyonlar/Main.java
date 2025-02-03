package koleksiyonlar;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arraylistler at = new Arraylistler();
		at.elemanEkle();
		System.out.println(at.yeni);
		//x indeksli elemanı değiştirme
		at.yeni.set(2, 5.8);
		System.out.println(at.yeni);
		//eleman silme
		at.yeni.remove(2);
		System.out.println(at.yeni);
		
		//ArrayList döngü ile gezme
		for(Object x : at.yeni) {System.out.println(x);}
		
		
		//sözlük sınıfını çağır
		Hashmapler y = new Hashmapler();
		y.sozluk.put("atta", "esek");
		System.out.println(y.sozluk);
		
		
		
	}

}
