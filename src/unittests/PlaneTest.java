package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import primitives.Vector;
import primitives.Point3D;
import geometries.Plane;
import primitives.Ray;
import java.util.LinkedList;
//import java.util.Collection;
import primitives.*;

public class PlaneTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
public void PGetNormal() throws Exception{
		
		Plane P = new Plane(new Color(), new Point3D(6,7,8), new Vector(4,5,6));
		Vector V1 = P.vectorN;
		Vector V2 = P.GetNormal(new Point3D(3,4,5));
		assertEquals(V1, V2);
	}
	
	@Test
	public void PfindIntersection() throws Exception  //MArche pas voir avec le override la fonc de base
	{
		System.out.println("Here1");

		Plane PL = new Plane(new Color(), new Point3D(1,2,3), new Vector(2,3,3));
		System.out.println("Here2");

		LinkedList<Point3D> LP1 = PL.findIntersection(new Ray(new Point3D(3,2,3), new Vector(2,1,2)));
		System.out.println("Here3");

		Point3D P2 = new Point3D(43/13.0,28/13.0,43/13.0);
		LinkedList<Point3D> LP2 = new LinkedList<Point3D>();
		LP2.add(0,P2);
	
	//	assertTrue(LP1.equals(LP2));
		

		assertTrue(LP1.equals(new LinkedList<Point3D>()));

		
		 PL = new Plane(new Color(), new Point3D(4,2,3), new Vector(2,3,3));
		LP1 = PL.findIntersection(new Ray(new Point3D(3,2,3), new Vector(2,1,2)));
		
		
		System.out.println(LP1.equals(LP2));
		System.out.println(LP1.getFirst());
		System.out.println(LP2.getFirst());
		assertTrue(LP1.equals(LP2));
		
		/*Point3D P1 = LP1.getFirst();
		System.out.println(P1.toString());

		
		System.out.println(P2.toString());
		System.out.println(P1.equals(P2));
		LinkedList<Point3D> LP2 = new LinkedList<Point3D>();
		LP2.add(0,P2);
		System.out.println(LP1.equals(LP2));
		LP1.
		assertTrue(LP1.equals(LP2));*/
	}

	
}
