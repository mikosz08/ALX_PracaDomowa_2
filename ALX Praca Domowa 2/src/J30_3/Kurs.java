package J30_3;

import java.util.ArrayList;
import java.util.Scanner;

//sprawdz jeszcze raz edytowanie + ogarnac dodawanie kurantow do kursu czy kursu do kursanta elobenc

public class Kurs extends Uczestnik {
	ArrayList<Kurs> kursy = new ArrayList<>();
	String nazwaKursu;
	Scanner sc = new Scanner(System.in);
	int licznikKursow = 0;

	public Kurs(String nazwa) {
		this.nazwaKursu = nazwa;

	}

	public Kurs() {
		System.out
				.println("D-dodawanie, U-usuwanie, E-edycja, W-wyświetlanie, P-panel uczestnika, K-przypisz do Kursu");

		while (true) {
			System.out.println("[Menu Kursów]");
			System.out.println("Wybierz opcje:");

			char answer = sc.nextLine().toUpperCase().charAt(0);

			switch (answer) {
			case 'D':
				System.out.println("Dodawanie kursu...");
				dodawnieKursu();
				System.out.println("-----------------");
				break;
			case 'U':
				System.out.println("Usuwanie kursu...");
				usuwanieKursu();
				System.out.println("-----------------");
				break;
			case 'E':
				System.out.println("Edytowanie kursu...");
				edytowanieKursu();
				System.out.println("-----------------");
				break;
			case 'W':
				System.out.println("Wyświetlanie kursu...");
				wyswietlanieKursu();
				System.out.println("-----------------");
				break;
			case 'P':
				System.out.println("Panel kursanta...");
				panelUczestnika();
				System.out.println("-----------------");
				break;
			case 'Q':
				System.out.println("------quit------");
				System.exit(0);
			case 'K':
				System.out.println("Przypisywanie kursanta...");
				przypiszDoKursu();
				System.out.println("-----------------");
			default:
				break;
			}
		}
	}

	public void przypiszDoKursu() {
		System.out.println("Kogo chciałbyś przypisać? (nazwisko)");
		String nazwisko = sc.nextLine();
		
		for (Uczestnik uczestnik : uczestnicy) {
			
			if(uczestnik.nazwisko.equals(nazwisko)) {
				
				System.out.println("Wybierz kurs: ");
				System.out.print(kursy);
				String nazwa = sc.nextLine();
				
				for (Kurs kurs : kursy) {
					
					if(kurs.nazwaKursu.equals(nazwa)) {
						
						uczestnik.kurs = nazwa;
						
					}
					
				}
				//System.out.println(uczestnik.imie + " " + uczestnik.nazwisko + " ");
				
			}
			
		}
		
	}

	public void panelUczestnika() {
		System.out.println("[Menu Kursanta] \n D-dodawanie, U-usuwanie, E-edycja, W-wyświetlanie, Q-wyjscie z panelu");

		boolean menuKursanta = true;

		while (menuKursanta) {
			System.out.println("[Menu Kursanta]");
			System.out.println("Wybierz opcje:");
			char answer = sc.nextLine().toUpperCase().charAt(0);
			switch (answer) {
			case 'D':
				System.out.println("Dodawanie kursanta...");
				dodawanieKursanta();
				System.out.println("-----------------");
				break;
			case 'U':
				System.out.println("Usuwanie kursanta...");
				usuwanieKursanta();
				System.out.println("-----------------");
				break;
			case 'E':
				System.out.println("Edytowanie kursanta...");
				edytowanieKursanta();
				System.out.println("-----------------");
				break;
			case 'W':
				System.out.println("Wyświetlanie kursantów...");
				wyswietlanieKursantow();
				System.out.println("-----------------");
				break;
			case 'Q':
				menuKursanta = false;
			}
		}

	}

	public void dodawnieKursu() {
		System.out.println("Wybierz nazwę dla kursu:");
		String nazwa = sc.nextLine();
		kursy.add(new Kurs(nazwa));
		licznikKursow++;
	}

	public void usuwanieKursu() {
		System.out.println("Jaki kurs chcesz usunac?: ");
		System.out.print(kursy);

		String delKurs = sc.nextLine();

		for (Kurs kurs : kursy) {

			if (kurs.nazwaKursu.equals(delKurs)) {
				System.out.println("Czy na pewno chcesz usunąć" + kurs + " [T/N] ?");

				char answer = sc.nextLine().toUpperCase().charAt(0);
				if (answer == 'T') {
					kursy.remove(kurs);
					licznikKursow--;
					break;
				} else {
					System.out.println("Anulowano usuwanie.");
					break;
				}
			} else {
				System.out.println("Nie znaleziono Kursu.");
			}

		}

	}

	public void edytowanieKursu() {
		System.out.println("Jaki kurs chcesz edytowac?: ");
		System.out.print(kursy);

		String delEdit = sc.nextLine();

		for (Kurs kurs : kursy) {

			if (kurs.nazwaKursu.equals(delEdit)) {
				System.out.println("Podaj nową nazwe kursu: ");
				kurs.nazwaKursu = sc.nextLine();
				break;
			}

		}

	}

	public void wyswietlanieKursu() {
		System.out.println("Posiadamy " + licznikKursow + " kurs/y/ów.");
		for (Kurs kurs : kursy) {
			System.out.println(kurs);
		}
	}

	@Override
	public String toString() {
		return " kurs = " + nazwaKursu;
	}

}
