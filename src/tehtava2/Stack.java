package tehtava2;

public class Stack {

	private ListItem mTop;
	private int mSize;
	
	public Stack() {
		mTop = null;
		mSize = 0;
	}
	
	// muodostetaan uusi lista-alkio, asetetaan se pinon huipulle
	public void push(String aData) {
		
		ListItem newItem = new ListItem();
		ListItem currentItem = new ListItem();

		newItem.setData(aData);

		if (mTop == null) {
			mTop = newItem;
		} else if (mTop.getNext() == null) {
			mTop.setNext(newItem);
		} else {
			currentItem = mTop.getNext();
			while (currentItem.getNext() != null) {
				currentItem = currentItem.getNext();
			}
			currentItem.setNext(newItem);
		}
		mSize++;
	}
	
	// poistetaan lista-alkio pinon huipulta, jos pino tyhjä, palautetaan null
	public ListItem pop() {
		
		ListItem poistettu = mTop;
		
		if (mSize > 0) {
		mTop = mTop.getNext();
		mSize--;
		}
	
		
		return poistettu;
	}
	
	// tulostetaan pinon sisältö
	public void printItems() {

		ListItem nextItem = new ListItem();

		if (mTop != null) {
			System.out.println(mTop.getData());
			nextItem = mTop.getNext();

			while (nextItem != null) {
				System.out.println(nextItem.getData());
				nextItem = nextItem.getNext();
			}
		}
	}
	
	public int getSize() {
		return mSize;
	}
	
}
