package javaegitimi.encapsulation;

public class Urun {
	private int id;
	private String urunAdi;
	private String urunAciklamasi;
	private double urunFiyati;
	private int stokSayisi;
	
	
	//get ve set kullanarak private olan bir değişkeni ulaşılabilir ve değiştirilebilir hale getirdik.
	//getter
	public String getUrunAdi() {
		return urunAdi;
	}
	//setter
	public void setUrunAdi(String urunAdi) {
		this.urunAdi=urunAdi;
	}
	/////////////////////////////////
	
	//getter
	public int getId() {
		return id;
	}
	//setter
	public void setID(int id) {
		this.id=id;
	}
	/////////////////////////////////
	
	//getter
	public String getUrunAciklamasi() {
		return urunAciklamasi;
	}
	//setter
	public void setUrunAciklamasi(String urunAciklamasi) {
		this.urunAciklamasi=urunAciklamasi;
	}
	/////////////////////////////////
	
	//getter
	public double getUrunFiyati() {
		return urunFiyati;
	}
	//setter
	public void setUrunFiyati(double urunFiyati) {
		this.urunFiyati=urunFiyati;
	}
	/////////////////////////////////	
	//getter
	public int getStokSayisi() {
		return stokSayisi;
	}
	//setter
	public void setStokSayisi(int stokSayisi) {
		this.stokSayisi=stokSayisi;
	}
	/////////////////////////////////
}
