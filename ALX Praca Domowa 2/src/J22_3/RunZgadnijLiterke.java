package J22_3;

import java.util.HashSet;
import java.util.Scanner;

public class RunZgadnijLiterke {

	public static void main(String[] args) {

		HashSet<Character> set = new HashSet<Character>();
		Scanner sc = new Scanner(System.in);
		String haslo;
		boolean isRunning = true;
		int counter = 0;
		int ruchy = 0;

		System.out.println("Podaj haslo do odgadniecia: ");
		haslo = sc.nextLine();

		System.out.println(" zgadnj literke: ");
		while (isRunning) {
			ruchy++;
			isRunning = false;

			char literka = sc.nextLine().charAt(0);

			for (int i = 0; i < haslo.length(); i++) {

				if (haslo.charAt(i) == literka) {
					counter++;
					set.add(literka);
				}
				if (set.contains(haslo.charAt(i))) {
					System.out.print(haslo.charAt(i));

				} else {
					System.out.print("-");
					isRunning = true;
				}

			}
			if (isRunning == false) {
				System.out.println("\n Win w " + ruchy + " ruchu/ach.");
			}
		}

	}

}
