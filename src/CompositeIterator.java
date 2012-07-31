import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();

	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		}
		else { 
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}
			else {
				return true;
			}
		}
	}
	
	public Object_Component next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			Object_Component o = (Object_Component) iterator.next();
			if (o instanceof Object_Component) {
				stack.push(o.createIterator());
			}
			return o;
		}
		else {
			return null;
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
		
	}

}
