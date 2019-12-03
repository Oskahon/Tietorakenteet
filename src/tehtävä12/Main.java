package tehtävä12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Kasa kasa = new Kasa();

		boolean running = true;

		while (running) {
			System.out.println("1. Lisää numero.");
			System.out.println("2. Poista pienin luku.");
			System.out.println("0. Lopeta.");
			Scanner in = new Scanner(System.in);
			int input = in.nextInt();
			in.nextLine();

			switch(input) {
			case 1:
				System.out.println("Anna luku.");
				input = in.nextInt();
				in.nextLine();
				kasa.insert(input, kasa.getMaara());
				for (int i : kasa.getArvot()) {
					if (i!=0) {
						System.out.println(i);
					}
				}
				break;
			case 2:
				kasa.deleteMin(0);
				for (int i : kasa.getArvot()) {
					if (i!=0) {
						System.out.println(i);
					}
				}
				break;
			case 0:
				running=false;
				break;
			}

		}

	}
}
