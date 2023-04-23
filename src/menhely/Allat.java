package menhely;

public abstract class Allat {
	
	private String nev;
	private double suly;
	
	public Allat(String nev, double suly) {
		this.nev = nev;
		this.suly = suly;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public double getSuly() {
		return suly;
	}
	public void setSuly(double suly) {
		this.suly = suly;
	}
	

	public abstract double napiEtelAdag();
	

}
