import java.util.Iterator;

public class Cube extends Prim  {
    
	private float height;
	private float width;
	private float length;
	
	public Cube(float h, float w, float l){
	  this.height=h;
	  this.width=w;
	  this.length=l;
	}
	
	public void render() {
		System.out.println("Cube:"+ height + ":" + width + ":" + length);
	}

	public float volume() {
		return (float) (height*width*length);
	}

	public Iterator createIterator() {
		return new NullIterator();
	}

}
