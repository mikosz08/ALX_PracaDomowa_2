package J30_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Uczestnik {
	ArrayList<Uczestnik> uczestnicy = new ArrayList<>();
	String imie;
	String nazwisko;
	String kurs;
	Scanner sc = new Scanner(System.in);
	int licznikKursantow = 0;

	public Uczestnik() {

	}

	public Uczestnik(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public void dodawanieKursanta() {
		System.out.println("Podaj imie kursanta: ");
		String imie = sc.nextLine();
		System.out.println("Podaj nazwisko kursanta: ");
		String nazwisko = sc.nextLine();
		uczestnicy.add(new Uczestnik(imie, nazwisko));
		licznikKursantow++;
	}

	public void usuwanieKursanta() {
		System.out.println("Kogo chciałbyś usunąć (nazwisko):");
		String nazwisko = sc.nextLine();

		for (Uczestnik uczestnik : uczestnicy) {

			if (uczestnik.nazwisko.equals(nazwisko)) {

				System.out.println("Czy na pewno chcesz usunąć" + uczestnik + " [T/N] ?");
				char answer = sc.nextLine().toUpperCase().charAt(0);

				if (answer == 'T') {
					uczestnicy.remove(uczestnik);
					licznikKursantow--;
					break;
				} else {
					System.out.println("Anulowano usuwanie.");
				}

			} else {
				System.out.println("Nie znaleziono uczestnika.");
			}

		}

	}

	public void edytowanieKursanta() {

		System.out.println("Kogo chciałbyś edytować (nazwisko):");
		String nazwisko = sc.nextLine();

		for (Uczestnik uczestnik : uczestnicy) {

			if (uczestnik.nazwisko.equals(nazwisko)) {

				System.out.println("Podaj nowe imie: ");
				String newName = sc.nextLine();
				if (newName != "") {
					uczestnik.imie = newName;
				}
				System.out.println("Podaj nowe nazwisko: ");
				String newSurname = sc.nextLine();
				if (newSurname != "") {
					uczestnik.imie = newSurname;
				}
			}
		}
	}

	public void wyswietlanieKursantow() {
		for (Uczestnik uczestnik : uczestnicy) {
			System.out.println(uczestnik);
		}
	}

	@Override
	public String toString() {
		return "Uczestnik [imie=" + imie + ", nazwisko=" + nazwisko + "kurs=" + kurs + "]";
	}

}
