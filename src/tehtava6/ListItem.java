package tehtava6;

public class ListItem {

	private String mData;
	private ListItem mNext;
	
	public ListItem() {
		mNext = null; // taitaa olla oletusarvo
	}
	
	public String getData() {
		return mData;
	}
	public void setData(String mData) {
		this.mData = mData;
	}
	public ListItem getNext() {
		return mNext;
	}
	public void setNext(ListItem mNext) {
		this.mNext = mNext;
	}
	
	
	
}
