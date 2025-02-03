package throwkullanimi;

public class Main {

	public static void main(String[] args) {
		HesapYonetimi yonetim = new HesapYonetimi();
		System.out.println("Hesap= " + yonetim.getHesap());
		yonetim.paraYatir(100);
		try {yonetim.paraCek(90);
		} catch (Exception e) {System.out.println(e.getMessage());}
		
		try {yonetim.paraCek(20);
		} catch (Exception e) {System.out.println(e.getMessage());}
		
		

	}

}
