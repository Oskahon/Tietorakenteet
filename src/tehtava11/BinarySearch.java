package tehtava11;

public class BinarySearch {
	
	private int[] arvot;
	private int määrä;
	
	public BinarySearch() {
		arvot = new int[10];
		
		määrä = 0;
	}
	
	public int binaryInsert(int arvo) {
		if (määrä == 0) {
		      return 0;
		    }

		    int min = 0;
		    int max = määrä - 1;

		    while (true) {
		      int index = (max + min) / 2;
		      if (min == index) {
		        if (arvot[index] > arvo) {
		          return index;
		        }
		      }
		      if (arvot[index] < arvo) {
		        min = index + 1;
		        if (min > max) {
		          return index += 1;
		        }
		      } else if (min > max) {
		        return index;
		      } else {
		        max = index - 1;
		      }
		    }
	}
	
	public void insert(int arvo) {
		
		if (määrä == 10) {
			System.out.println("taulu täynnä.");
		} else {
			int in = binaryInsert(arvo);
			for (int i = määrä; i > in; i--) {
				arvot[i] = arvot[i-1];
			}
			arvot[in] = arvo;
			määrä++;
		}
	}
	
	public int find(int arvo, int min, int max) {
		
		if (max >= min) {
			int mid = min + (max-min)/2;
			
			if (arvot[mid]==arvo) {
				return mid;
			}
			
			if (arvot[mid]>arvo) {
				return find(arvo, min, mid-1);
			}
			
			return find(arvo, mid+1, max);
		
		}
		return -1;
	}
	
	public int getMaara() {
		return määrä-1;
	}
	
	public int[] getArvot() {
		return arvot;
	}

}
