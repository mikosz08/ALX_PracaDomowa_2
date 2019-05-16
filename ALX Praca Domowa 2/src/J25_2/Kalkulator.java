package J25_2;

import java.util.Scanner;

public class Kalkulator {
	int a, b;
	char dzialanie;
	Scanner sc = new Scanner(System.in);

	public Kalkulator() {

		while (true) {
			System.out.println("Podaj 1 liczbę, podaj znak działania, podaj 2 liczbę:");

			System.out.println("Podaj a: ");
			a = sc.nextInt();
			sc.nextLine();
			System.out.println("Podaj znak działania: ");
			dzialanie = sc.nextLine().charAt(0);

			System.out.println("Podaj b: ");
			b = sc.nextInt();
			sc.nextLine();
			System.out.println(a + " " + dzialanie + " " + b);
			switch (dzialanie) {
			case '+':
				System.out.println(suma(a, b));
				break;
			case '-':
				System.out.println(roznica(a, b));
				break;
			case '/':
				System.out.println(iloraz(a, b));
				break;
			case '*':
				System.out.println(iloczyn(a, b));
				break;

			default:
				System.out.println("--------------");
				break;
			}
			System.out.println("Kontynuować? [T/N]");
			char odp = sc.nextLine().toUpperCase().charAt(0);
			if (odp == 'N') {
				System.out.println("Koniec programu.");
				break;
			} else
				continue;
		}

	}

	double suma(double a, double b) {
		return a + b;
	}

	double roznica(double a, double b) {
		return a - b;
	}

	double iloczyn(double a, double b) {
		return a * b;
	}

	double iloraz(double a, double b) {
		return a / b;
	}
}
