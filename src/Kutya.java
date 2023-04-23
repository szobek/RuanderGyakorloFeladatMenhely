
public final class Kutya extends Allat {
	private int marMagassag;

	public Kutya(String nev, double suly, int marMagassag) {
		super(nev, suly);
		this.marMagassag = marMagassag;
	}

	@Override
	public double napiEtelAdag() {
		// TODO Auto-generated method stub
		return getSuly()/50;
	}
	
	

}
