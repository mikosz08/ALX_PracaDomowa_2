package J14_4;

import java.util.HashMap;
import java.util.Scanner;

public class Cyfrownik {

	HashMap<String, Integer> mapaCyfr = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public Cyfrownik() {

		mapaCyfr.put("Jeden", 1);
		mapaCyfr.put("Dwa", 2);
		mapaCyfr.put("Trzy", 3);
		mapaCyfr.put("Cztery", 4);
		mapaCyfr.put("Piec", 5);
		mapaCyfr.put("Szesc", 6);
		mapaCyfr.put("Siedem", 7);
		mapaCyfr.put("Osiem", 8);
		mapaCyfr.put("Dziewiec", 9);
		mapaCyfr.put("zero", 0);
		System.out.println("Value: " + mapaCyfr.values());
		System.out.println("Key: " +mapaCyfr.keySet());
		System.out.println("Podaj ciag cyfr:");

		while (true) {
			String ciag = sc.nextLine();
			System.out.println("Dla " + ciag + ": ");

			for (int i = 0; i < ciag.length(); i++) {
				int charAt = Character.getNumericValue(ciag.charAt(i));

				for (String s : mapaCyfr.keySet()) {

					if(charAt == mapaCyfr.get(s)) {
						System.out.println(s);
						break;
					}
					
				}

			}

			break;
		}

	}

}
