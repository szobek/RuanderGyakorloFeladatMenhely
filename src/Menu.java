import java.io.BufferedReader;
import java.io.IOException;

public final class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public void show(BufferedReader br) {
		String menupont="";
		
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
		}while(menupont != "4");
		
		
	}

}
