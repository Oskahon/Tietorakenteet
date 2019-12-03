package tehtava1;

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
		newItem.setData(aData);
		newItem.setNext(mTop); //kytketään uusi lista-alkio aikaisempaan huippualkioon
		mTop = newItem; // uusi alkio pinon huippualkioksi
		mSize++;
	}
	
	// poistetaan lista-alkio pinon huipulta, jos pino tyhjä, palautetaan null
	public ListItem pop() {
		
		ListItem poistettu = null;
		
		if (mSize > 0) {
			poistettu = mTop;
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
