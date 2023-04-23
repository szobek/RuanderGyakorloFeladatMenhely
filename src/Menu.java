import java.io.BufferedReader;
import java.io.IOException;

public final class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public void show(BufferedReader br,Allat[] allatok) {
		String menupont = "";

		System.out.println("Válasszon menüt");
		do {
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
			case "1" -> lista(allatok);
			case "2" -> subMenu(br);
			case "3" -> lista(allatok);
			}
		} while (!menupont.equals("4"));

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
}
