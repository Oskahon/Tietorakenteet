package tehtava11;

public class BinarySearch {
	
	private int[] arvot = {1, 2, 3, 4, 5, 6, 7};
	private int määrä;
	
	public BinarySearch() {
	//	arvot = new int[7];
		
		määrä = 7;
	}
	
	public boolean insert(int arvo) {
		
		
		
		return false;
	}
	
	public int find(int arvo) {
		
		if (määrä!=0) {
			
		int max = määrä-1;
		int min = 0;
		
		while (max-min>1) {
			int mid = 0;
		System.out.println(mid);
		System.out.println(min);
		System.out.println(max);
		if (arvo <= arvot[mid]) {
			max = mid;
			mid = arvot[max/2];
		} else {
			min = mid;
			mid = arvot[mid + (max-min)];
		}
		
		}
		}
		return 0;
	}

}
