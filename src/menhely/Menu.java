package menhely;
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
			System.out.println("2 - Almenük");
			System.out.println("3 - Menhely felszabadítása");
			System.out.println("4 - Kilépés");
			try {
				menupont = br.readLine();
			} catch (IOException e) {
				System.out.println("I/O hiba!");
			}
			MethodsForMenu menuMethods = new MethodsForMenu(br, allatok, aktualis);
			menuMethods.selectMainMenu(menupont);
		} while (!menupont.equals("4"));

	}

	
}
