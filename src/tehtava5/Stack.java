package tehtava5;

public class Stack {

	private int size;
	private ListItem[] array;
	private int index;
	
	
	public Stack() {
		array = new ListItem[5];
		size = 0;
		index = 0;
	}
	
	public StackIterator iterator() {
		return new StackIterator(this);
	}
	
	public void push(String data) {
		ListItem newItem = new ListItem(data);
		
		//kasvatetaan arrayn kokoa tarvittaessa
		if (index > array.length-1) {
			ListItem[] newArray = new ListItem[(array.length)+5];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
		
		array[index] = newItem;
		index++;
		size++;
		System.out.println("Lenght: "+array.length);
	}
	
	public ListItem pop() {
		ListItem removed = null;
		
		for (int i=array.length-1;i>=0;i--) {
			if (array[i] !=null) {
				
				removed = array[i];
				array[i] = null;
				size--;
				index--;
				
				// Pienennetään arrayn kokoa tarvittaessa
				if (index <= array.length-5) {
					ListItem[] newArray = new ListItem[array.length-5];
					System.arraycopy(array, 0, newArray, 0, newArray.length);
					array = newArray;
				}
				
				return removed;
			}
		}
		
		return removed;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printItems() {
		for (int i=array.length-1;i>=0;i--) {
			if (array[i] != null) {
			System.out.println(array[i].getData());
			}
		}
	}

	public ListItem[] getArray() {
		return array;
	}

	public int getLastIndex() {
		return index - 1;
	}
	
	public ListItem getItem(int index) {
		return array[index];
	}

}
