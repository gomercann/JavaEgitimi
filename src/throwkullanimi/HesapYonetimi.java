package throwkullanimi;

public class HesapYonetimi {
	private double hesap;
	
	public void paraYatir(double miktar) {
		hesap += miktar;
	}
	
	public void paraCek(double miktar) throws Exception {
		if(hesap>miktar) {
		hesap -= miktar;}
		else {throw new Exception("Bakiye Yetersiz");}
	}

	public double getHesap() {
		return hesap;
	}
	
	
}
