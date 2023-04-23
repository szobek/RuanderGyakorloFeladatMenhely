package menhely;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Allat[] allatok = new Allat[20];
	static int aktualiyAllatSzam = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		Menu menu = new Menu();
		menu.show(br, allatok, aktualiyAllatSzam);
	}
}
