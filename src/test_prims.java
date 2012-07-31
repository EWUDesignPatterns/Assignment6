import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class test_prims {

	public static void main(String[] args) {
        Cube cube1 = new Cube(1.0f,1.0f,1.0f);
        Cube cube2 = new Cube(1.0f,1.0f,1.0f);
        Sphere sphere1 = new Sphere(4.0f);
       // Cylinder cylinder1 = new Cylinder();
        
        //Initialize three composite prims
        Object pcom1 = new Object();
        Object pcom2 = new Object();
          
         pcom1.add(cube1);
         pcom1.add(cube2);
  
         pcom2.add(pcom1);
         pcom2.add(sphere1);

     
         pcom2.render();
         System.out.println(pcom2.volume());
        
         Iterator iterator = pcom2.createIterator();
         while (iterator.hasNext()) {
         	((Object_Component) iterator.next()).render();
           }
        }
}

 