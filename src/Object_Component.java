import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.OperationNotSupportedException;

/**
 * 
 * @author Michael Williams
 *
 */
public class Object_Component {

	private ArrayList<Object_Component> components;
	
	public Object_Component() {
		components = new ArrayList<Object_Component>();
	}
	
	public void add(Object_Component obj) {
		components.add(obj);
	}
	
	public void render()
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Not sure about this method, I guess it makes sense
	 * 
	 * @return
	 */
	public float volume()
	{
		float v = 0;
		
		Iterator i = this.createIterator();
		while (i.hasNext()) {
			Object_Component o = (Object_Component) i.next();
			v += o.volume();
		}
		
		return v;
	}
	
	public Iterator createIterator() 
	{
		return new CompositeIterator(components.iterator());
	}
}
