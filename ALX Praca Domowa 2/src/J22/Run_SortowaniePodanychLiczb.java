package J22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run_SortowaniePodanychLiczb {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean isSorting = true;
		System.out.println("Podawaj liczby | quit - 0");
		int nextNumber;

		while (true) {

			nextNumber = sc.nextInt();

			if (nextNumber == 0) {
				System.out.println("Koniec");
				break;
			}

			lista.add(nextNumber);

		}

		int tmp;
		int i = 1;
		System.out.println("Sortowanie rosnąco.");

		while (isSorting) {

			isSorting = false;
			for (int j = 1; j < lista.size(); j++) {

				if (lista.get(j - 1) > lista.get(j)) {

					isSorting = true;
					tmp = lista.get(j - 1);
					lista.set(j - 1, lista.get(j));
					lista.set(j, tmp);

					// to wcale nie jest bubblesort tylko mój wlasny sortownik
				}

			}
			System.out.println(lista);
		}

	}

}
