package tehtava13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Hajautustaulu taulu = new Hajautustaulu();

		boolean running = true;

		while (running) {
			System.out.println("1. Lisää luku.");
			System.out.println("2. Etsi luku.");
			System.out.println("0. Lopeta.");
			Scanner in = new Scanner(System.in);
			int input = in.nextInt();
			in.nextLine();

			switch(input) {
			case 1:
				System.out.println("Anna luku.");
				input = in.nextInt();
				in.nextLine();
				taulu.insert(input);
				for (int i = 0; i<taulu.getArvot().length;i++) {
					if (taulu.getArvot()[i]!=0) {
						System.out.println(i+". "+taulu.getArvot()[i]);
					}
				}
				break;
			case 2:
				System.out.println("Anna etsittävä luku.");
				input = in.nextInt();
				in.nextLine();
				System.out.println(taulu.find(input));
				break;
			case 0:
				running=false;
				break;
			}

		}
	}
}
