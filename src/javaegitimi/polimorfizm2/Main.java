package javaegitimi.polimorfizm2;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] kredi = new BaseKrediManager[] {new EgitimKrediManager(), new TarimKrediManager(),new AskerKredisi()};
		
		for(BaseKrediManager x :kredi) {
			System.out.println(x.hesapla(800));
			
		}

	}

}
