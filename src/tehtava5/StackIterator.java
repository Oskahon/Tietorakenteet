package tehtava5;

interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator{

	private int current;
	private Stack container;
	
	StackIterator (Stack stack){
		container = stack;
		current = stack.getLastIndex();
	}

	@Override
	public boolean hasNext() {
		
		if (current<0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public ListItem next() {
		int oldcurrent = current;
		current--;
		return container.getItem(oldcurrent);
	}
	
}
