import java.util.ArrayList;;

public class Object {
	
	private ArrayList<Object_Component> components;
	
	public Object() {
		components = new ArrayList<Object_Component>();
	}
	
	public void add(Object_Component obj) {
		components.add(obj);
	}
}
