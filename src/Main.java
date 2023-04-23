import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Allat[] allatok;
	public static void main(String[] args) {
Menu menu = new Menu();
menu.show(br,allatok);
	}
}
