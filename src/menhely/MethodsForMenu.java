package menhely;

import java.io.BufferedReader;
import java.io.IOException;

public class MethodsForMenu {

	private BufferedReader br;
	private Allat[] allatok;
	private int aktualisSzam;

	public MethodsForMenu(BufferedReader br, Allat[] allatok, int aktualiIndex) {
		this.br = br;
		this.allatok = allatok;
		this.aktualisSzam = aktualiIndex;
	}

	public void selectMainMenu(String menupont) throws NumberFormatException, IOException {
		switch (menupont) {
		case "1" -> ujAllat();
		case "2" -> subMenu();
		case "3" -> removeFirst();
		}

	}

	private void ujAllat() throws NumberFormatException, IOException {
		if (aktualisSzam < allatok.length) {
			String allatTipus = "";
			System.out.println("Kutya vagy macska? (k/m)");
			do {
				System.out.print("a típus: ");
				try {
					allatTipus = br.readLine();
				} catch (IOException e) {
					System.out.println("I/O hiba!");
				}
			} while (!allatTipus.equals("k") && !allatTipus.equals("m"));

			String allatNev = "";
			do {
				System.out.println("Adja meg az állat nevét");
				allatNev = br.readLine();
			} while (allatNev.equals(""));

			double allatSuly = 0;
			do {
				System.out.print("Adja meg az állat súlyát (min 2 kg): ");
				try {
					allatSuly = Double.parseDouble(br.readLine());
				} catch (NumberFormatException e) {
					System.out.println("Hibás érték");
				}

			} while (allatSuly < 2);

			if (allatTipus.equals("k")) {
				double marmagassag = 0;
				do {
					System.out.print("adja meg a marmagasságot (min 10cm): ");
					try {
						marmagassag = Double.parseDouble(br.readLine());
					} catch (NumberFormatException e) {
						System.out.println("Hibás érték");
					}

				} while (marmagassag < 10);
				Allat ujAllat = new Kutya(allatNev, allatSuly, marmagassag);
				allatok[aktualisSzam] = ujAllat;
				successSave();
			} else {
				String valasz = "";
				do {
					System.out.print("adja meg ,hogy hosszőrű-e (i/n): ");
					valasz = br.readLine();

				} while (!valasz.equals("i") && !valasz.equals("n"));
				Allat ujAllat = new Macska(allatNev, allatSuly, (valasz.equals("i")) ? true : false);
				allatok[aktualisSzam] = ujAllat;

				successSave();
			}
			aktualisSzam++;
		} else {
			System.out.println("Már nincs hely");
		}
	}

	private void successSave() {
		System.out.println("Új állat mentve!");
		System.out.println();
		System.out.println();
		System.out.println();

	}

	private void lista() {
		System.out.println();
		System.out.println();
		System.out.println("Állatok listája a menhelyen");
		for (Allat allat : allatok) {
			if (allat != null) {
				System.out.println(allat.getNev());
			}

		}
		System.out.println();
		System.out.println();

	}

	private void subMenu() {
		String almenupont = "";
		do {
			System.out.println("1 - Lista");
			System.out.println("2 - almenü2");
			System.out.println("3 - Vissza");
			try {
				almenupont = br.readLine();
			} catch (IOException e1) {
				System.out.println("I/O hiba!");
			}
			switch (almenupont) {
			case "1" -> lista();
			case "2" -> {
				System.out.println("Almenü 2");
			}
			}
		} while (!almenupont.equals("3"));

	}

	public void removeFirst() {
		if (aktualisSzam > 0) {
			System.out.println(allatok[0].getNev() + " távozik a menhelyről!");

			for (int i = 1; i <= aktualisSzam - 1; i++) {
				allatok[i - 1] = allatok[i];
			}
			allatok[aktualisSzam - 1] = null;
			aktualisSzam--;

		}

	}

}
