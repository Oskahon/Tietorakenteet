package tehtava11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BinarySearch s = new BinarySearch();
		
		boolean running = true;
		
		while (running) {
			System.out.println("1. Lisää numero.");
			System.out.println("2. Etsi numeron indexi.");
			System.out.println("0. Lopeta.");
			Scanner in = new Scanner(System.in);
			int input = in.nextInt();
			in.nextLine();
			
			switch(input) {
			case 1:
				System.out.println("Anna luku.");
				input = in.nextInt();
				in.nextLine();
				s.insert(input);
				for (int i : s.getArvot()) {
					if (i!=0) {
					System.out.println(i);
					}
				}
				break;
			case 2:
				System.out.println("Anna etsittävä luku.");
				input = in.nextInt();
				in.nextLine();
				System.out.println("Luvun indexi: "+s.find(input, 0, s.getMaara()));
				break;
			case 0:
				running=false;
				break;
			}
		}
	}

}
