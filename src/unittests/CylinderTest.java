package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import geometries.Cylinder;
import primitives.*;

public class CylinderTest {

	/*@Test
	public void test() {
		
		fail("Not yet implemented");
	}*/
	
	@Test 
	public void CGetNormalTest () throws Exception
	{
		Cylinder c = new Cylinder (new Color(), new Ray(new Point3D(1,2,3), new Vector(2,3,1)), 10, 5);
		Vector V1 = c.GetNormal(new Point3D(1,3,3));
		Vector V2 = new Vector(-6/Math.sqrt(109),-8/Math.sqrt(109),-3/Math.sqrt(109));
		System.out.println(V1.toString());
		System.out.println(V1.equals(V2));
		assertTrue(V1.equals(V2));
		
		
		//T==0
		 c = new Cylinder (new Color(),new Ray(new Point3D(1,2,3), new Vector(2,3,1)), 10, 5);
		 V1 = c.GetNormal(new Point3D(1,2,3));
		  V2 = new Vector(2,3,1);
		  V2.normalisatsiaVector();
			System.out.println(V1.toString());
			System.out.println(V1.equals(V2));
			assertTrue(V1.equals(V2));
			
			//T==10
			 c = new Cylinder (new Color(),new Ray(new Point3D(1,2,3), new Vector(2,3,1)), 10, 5);
			 V1 = c.GetNormal(new Point3D(3,4,3));
			  V2 = new Vector(2,3,1);
			  V2.normalisatsiaVector();
				System.out.println(V1.toString());
				System.out.println(V1.equals(V2));
				assertTrue(V1.equals(V2));
	}

}
