package tehtävä14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Stack pino = new Stack();
		Double value = 0.0;
		
		System.out.println("Syötä laskutoimitus: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		while (!input.equals("")) {

			switch(input) {
			case "+":
			case "-":
			case "*":
			case "/":
				Double oikea = pino.pop().getData();
				Double vasen = pino.pop().getData();
				switch(input) {
					case "+":
						value = vasen+oikea;
						break;
					case "-":
						value = vasen-oikea;
						break;
					case "*":
						value = vasen*oikea;
						break;
					case "/":
						value = vasen/oikea;
						break;
						default:
							break;
				}
				pino.push(value);
				System.out.println(pino.printItems());
				break;
				default:
					pino.push(Double.parseDouble(input));
					System.out.println(pino.printItems());
					break;
			}
			input = in.nextLine();
		}
		
	}
}

