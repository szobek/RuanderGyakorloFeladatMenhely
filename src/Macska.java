
public final class Macska extends Allat {

	boolean hosszuszoru;

	public Macska(String nev, double suly, boolean hosszuszoru) {
		super(nev, suly);
		this.hosszuszoru = hosszuszoru;
	}

	public boolean isHosszuszoru() {
		return hosszuszoru;
	}

	public void setHosszuszoru(boolean hosszuszoru) {
		this.hosszuszoru = hosszuszoru;
	}

	@Override
	public double napiEtelAdag() {
		return getSuly()/70;
	}
	
	

}
