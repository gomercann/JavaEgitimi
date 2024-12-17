package javaegitimi.diziler;

public class CokBoyutluDizi {

	public static void main(String[] args) {
		
		//tanımlama
		String[][] sehirler = new String [3][3];
		
		//atama işlemleri
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Ankara";
		sehirler[0][2] = "İzmir";
		sehirler[1][0] = "Kadıköy";
		sehirler[1][1] = "Moda";
		sehirler[1][2] = "İcadiye";
		sehirler[2][0] = "Mersin";
		sehirler[2][1] = "Gülnar";
		sehirler[2][2] = "Yenişehir";
		
		//listeleme
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
			
		}

	}

}
