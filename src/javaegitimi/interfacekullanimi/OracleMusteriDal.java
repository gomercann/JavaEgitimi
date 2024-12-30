package javaegitimi.interfacekullanimi;

public class OracleMusteriDal implements IMusteriDal, Irepository {

	@Override
	public void Ekle() {
		System.out.println("Oracle Bağlandı");
		
	}

	@Override
	public void deneme() {
		System.out.println("Deneme çağırıldı");
		
	}

}
