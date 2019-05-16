package J20;

import java.util.HashSet;

public class Run_PowtarzalnoscWTab {

	public static void main(String[] args) {
		// tablica 20el z liczbami z przedzialu 1..10

		HashSet<Integer> zbiórSpr = new HashSet<Integer>();
		int[] tab = new int[20];
		int check;

		for (int i = 0; i < tab.length; i++) {
			tab[i] = (int) (Math.random() * 11);
			System.out.print(tab[i] + " ");
		}

		System.out.println();

		for (int sprawdzana : tab) {
			zbiórSpr.add(sprawdzana);
			int licznik = 0;
			for (int i = 0; i < tab.length; i++) {
				if (sprawdzana == tab[i]) {
					licznik++;
				}
			}
			System.out.println("Sprawdzano " + sprawdzana + " : " + licznik);
		}

	}

}
