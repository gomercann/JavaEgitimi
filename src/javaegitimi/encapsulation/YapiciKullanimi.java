package javaegitimi.encapsulation;

public class YapiciKullanimi {
	
	public YapiciKullanimi(int a, String b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	private int a;
	private String b;
	private double c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
}
