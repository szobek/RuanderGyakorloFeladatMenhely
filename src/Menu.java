import java.io.BufferedReader;
import java.io.IOException;
import java.util.IllegalFormatException;

public final class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public void show(BufferedReader br,Allat[] allatok,int aktualis) throws NumberFormatException, IOException {
		String menupont = "";


		do {
			System.out.println("Válasszon menüt");
			System.out.println("1 - Menhelyre történő felvétel");
			System.out.println("2 - Menhely állatainak listázása");
			System.out.println("3 - Menhely felszabadítása");
			System.out.println("4 - Kilépés");
			try {
				menupont = br.readLine();
			} catch (IOException e) {
				System.out.println("I/O hiba!");
			}
			switch (menupont) {
			case "1" -> ujAllat(br,aktualis,allatok);
			case "2" -> subMenu(br);
			case "3" -> removeFirst(allatok);
			}
		} while (!menupont.equals("4"));

	}

	
	private void ujAllat(BufferedReader br,int aktualisSzam,Allat[] allatok) throws NumberFormatException, IOException {
		String allatTipus = "";
		System.out.println("Kutya vagy macska? (k/m)");
		do {
			System.out.print("a típus: ");
			try {
				allatTipus=br.readLine();
			} catch (IOException e) {
				System.out.println("I/O hiba!");
			}
		} while ( !allatTipus.equals("k") && !allatTipus.equals("m"));
		
		
		String allatNev = "";
		do {
			System.out.println("Adja meg az állat nevét");
			allatNev=br.readLine();
		} while (allatNev.equals(""));
		
		double allatSuly = 0;
		do {
			System.out.print("Adja meg az állat súlyát: ");
			try {
				allatSuly=Double.parseDouble(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Hibás érték");
			}
			
		} while (allatSuly<2);
		
		if(allatTipus.equals("k")) {
			double marmagassag = 0;
			do {
				System.out.print("adja meg a marmagasságot: ");
				try {
					marmagassag = Double.parseDouble(br.readLine()); 
				} catch (NumberFormatException e) {
					System.out.println("Hibás érték");
				}
				
			} while (marmagassag<10);
			Allat ujAllat = new Kutya(allatNev, allatSuly, marmagassag);
			allatok[aktualisSzam]=ujAllat;
			System.out.println("Új állat mentve!");
			System.out.println();
			System.out.println();
			System.out.println();
		}else {
			String valasz = "";
			do {
				System.out.print("adja meg ,hogy hosszőrű-e (i/n): ");
				valasz = br.readLine();
				
			} while (!valasz.equals("i") && !valasz.equals("n"));
			Allat ujAllat = new Macska(allatNev, allatSuly, (valasz.equals("i"))?true:false);
			allatok[aktualisSzam]=ujAllat;
			System.out.println("Új állat mentve!");
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		aktualisSzam++;
	}

	private void lista(Allat[] allatok) {
		for(Allat allat:allatok) {
			System.out.println(allat);
		}
	}

	private void subMenu(BufferedReader br) {
		// TODO Auto-generated method stub
		String almenupont = "";
		do {
			System.out.println("1 - almenü1");
			System.out.println("2 - almenü2");
			System.out.println("3 - Vissza");
			try {
				almenupont = br.readLine();
			} catch (IOException e1) {
				System.out.println("I/O hiba!");
			}
			
		} while (!almenupont.equals("3"));
		
	}
	public void removeFirst(Allat[] allatok) {
		System.out.println(allatok[0]+" távozik");
		for(int i=1;i<allatok.length-1;i++) {
			allatok[i-1]=allatok[i];
			allatok[allatok.length]=null;
		}
		
	}
}
