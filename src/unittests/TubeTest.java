package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import primitives.*;
import geometries.Tube;
//import geometries.Cylinder;
//import geometries.RadialGeometry;

public class TubeTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void TGetNormalTest() throws Exception
	{
		

		Tube t = new Tube(new Color(), new Ray (new Point3D(1,2,3), new Vector(2,3,1)), 5);
		Vector V1 = t.GetNormal(new Point3D(1,3,3));
		Vector V2 = new Vector(-6/Math.sqrt(109),-8/Math.sqrt(109),-3/Math.sqrt(109));
		System.out.println(V1.toString());
		System.out.println(V1.equals(V2));
		assertTrue(V1.equals(V2));
	}
}
