package koleksiyonlar;
import java.util.ArrayList;

public class Arraylistler {

	//Standart dizi oluşturma
	int[] sayilar = new int[] {1,2,3};
	
	
	//Arraylist oluşturma
	ArrayList<Object> yeni = new ArrayList<>();
	
	public void elemanEkle() {
		yeni.add(5);
		yeni.add("gökhan");
		yeni.add("4.67");
		yeni.add(true);
	}
	
}
