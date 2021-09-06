package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import primitives.Vector;
//import primitives.Point3D;

public class VectorTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	
	@Test
	public void TestEqual()
	{
		Vector V1 = new Vector(3,2,3);
		Vector V2 = new Vector(1,2,3);
		assertTrue("Equals Error",V1.equals(V2));
	}
	
	@Test
	public void TestAdd() throws Exception
	{
		Vector V1 = new Vector(1,2,3);
		Vector V2 = new Vector(4,-1,6);
		Vector V3 = V1.addVector(V2);
		Vector V4 = new  Vector(5,1,9);
		assertTrue(V3.equals(V4));
	}
	
	@Test
	public void TestSub() throws Exception
	{
		Vector V1 = new Vector(1,2,3);
		Vector V2 = new Vector(4,-1,6);
		Vector V3 = V1.substractVector(V2);
		Vector V4 = new Vector(-3,3,-3);
		assertTrue(V3.equals(V4));
	}
	
	@Test
	public void TestMultScale() throws Exception
	{
		Vector V1 = new Vector(1,2,3);
		Vector V2 = V1.multScalar(-2);
		Vector V3 = new Vector(-2,-4,-6);
		assertTrue(V2.equals(V3));
	}
	
	@Test
	public void TestDocProd()
	{
		Vector V1 = new Vector(1,2,3);
		Vector V2 = new Vector(3,2,1);
		double a=V1.dotProduct(V2);
		assertTrue(a==10);
	}
	
	@Test
	public void TestCrossProd() throws Exception
	{
		Vector V1 = new Vector(1,2,3);
		Vector V2 = new Vector(4,-1,6);
		Vector V3 = V1.crossProduct(V2);
		assertTrue(V3.equals(new Vector(15,6,-9)));
	}
	
	@Test
	public void TestLenght()
	{
		Vector V1 = new Vector(1,2,3);
		double a = V1.lenghtVector();
		assertTrue(a==Math.sqrt(14));
	}
	
	@Test
	public void testNormalize() throws Exception
			{	
				
				Vector v = new Vector(3.5,-5,10);
				
				v.normalisatsiaVector();
				assertTrue(1.0==v.lenghtVector());
				

			}
}
