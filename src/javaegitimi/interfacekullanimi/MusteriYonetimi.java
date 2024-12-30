package javaegitimi.interfacekullanimi;


public class MusteriYonetimi {
	private IMusteriDal musteridal;
	
	public MusteriYonetimi(IMusteriDal musteriDal) {
		this.musteridal = musteriDal;
	}
	public void ekle() {
		musteridal.Ekle();
	}
}
