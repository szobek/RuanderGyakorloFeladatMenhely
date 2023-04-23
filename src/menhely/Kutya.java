package menhely;

public final class Kutya extends Allat {
	private double marMagassag;

	public Kutya(String nev, double suly, double marMagassag) {
		super(nev, suly);
		this.marMagassag = marMagassag;
	}

	@Override
	public double napiEtelAdag() {
		// TODO Auto-generated method stub
		return getSuly()/50;
	}
	
	

}
