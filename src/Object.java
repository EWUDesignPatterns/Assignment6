import java.util.ArrayList;
import java.util.Iterator;

public class Object extends Object_Component {

	
	
	public void render()
	{
		Iterator i = this.createIterator();
		while (i.hasNext()) {
			Object_Component o = (Object_Component) i.next();
			o.render();
		}
	}
}
