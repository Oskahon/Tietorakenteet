package tehtava13;

public class Hajautustaulu {
	
	private int[] arvot;
	private int määrä;
	
	public Hajautustaulu() {
		arvot = new int[100];
	}
	
	public void insert(int arvo) {
		
		int h = arvo % 100;
		boolean onnistui = false;
		
		while (onnistui==false&&määrä<arvot.length) {
			if (h>99) {
				h = 0;
			}
			if (arvot[h]==0) {
				arvot[h] = arvo;
				määrä++;
				onnistui=true;
			} else {
				h++;
			}
		}
		if (onnistui == true) {
			System.out.println("Arvo lisätty.");
		} else {
			System.out.println("Taulu täynnä.");
		}
		
	}
	
	public int find(int arvo) {
		
		int h = arvo % 100;
		boolean onnistui = false;

		while (onnistui == false) {
			if (h>99) {
				h=0;
			}
			if (arvot[h]==arvo) {
				return h;
			} else if (arvot[h]==0) {
				return -1;
			} else {
				h++;
			}
		}
			return -1;
	}
	
	public int[] getArvot() {
		return arvot;
	}

}
