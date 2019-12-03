package tehtävä12;

public class Kasa {

	private int[] arvot;
	private int määrä;
	
	public Kasa() {
		arvot = new int[15];
		määrä = 0;
	}
	
	public void insert(int arvo, int index) {
		if (määrä==0) {
			arvot[0] = arvo;
			määrä++;
		} else {
			if (arvot[(index-1)/2]<arvo) {
				arvot[index] = arvo;
				määrä++;
			} else {
				arvot[index] = arvot[(index-1)/2];
				arvot[(index-1)/2] = 0;
				insert(arvo, (index-1)/2);
			}
		}
	}
	
	public void deleteMin(int index) {

		//int min = arvot[index];
		int vasen = (2*index)+1;
		int oikea = (2*index)+2;
		if (vasen < määrä && oikea < määrä) {
			if (arvot[määrä-1]<arvot[vasen]&&arvot[määrä-1]<arvot[oikea]) {
				System.out.println("juttu");
				arvot[index] = arvot[määrä-1];
				arvot[määrä-1] = 0;
				määrä--;
			} else {
				if (arvot[vasen]<arvot[oikea]) {
					arvot[index] = arvot[vasen];
					System.out.println("vasen");
					deleteMin(vasen);
				} else {
					System.out.println("oikea");
					arvot[index] = arvot[oikea];
					deleteMin(oikea);
				}
			}
		} else {
			arvot[index] = arvot[määrä-1];
			arvot[määrä-1] = 0;
			määrä--;
		}
	}

	public int getMaara() {
		return määrä;
	}
	
	public int[] getArvot() {
		return arvot;
	}
}
