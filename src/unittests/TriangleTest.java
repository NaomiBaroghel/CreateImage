package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import primitives.*;
import geometries.Triangle;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class TriangleTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	/*@Test
	public void TGetNormalTest() throws Exception{

		Triangle TT = new Triangle(new Color(), new Point3D(1,2,3),new Point3D(2,3,4),new Point3D(3,2,1));

		Vector V1 = TT.GetNormal(new Point3D());
		Vector V2 = new Vector(-2,4.0,-2);
		assertTrue(V1.equals(V2));
		
	
	}
	
	//@Test
/*	public void TfindIntersection() throws Exception //MARche pas
	{
	//	System.out.println("Ahere");

		Triangle TY = new Triangle(new Color(), new Point3D(0,1,-2), new Point3D(1,-1,-2), new Point3D(-1,-1,-2));
	//	System.out.println("1here");
		try{
		LinkedList<Point3D> LTri = TY.findIntersection(new Ray(new Point3D(0,0,0),new Vector(0,0,-1)));
	/*	System.out.println("here");
		LinkedList<Point3D> LTR1 = new LinkedList<Point3D>();
		LTR1.add(0, new Point3D(0.0, 1.788543819998317,0.0));
		//TY.findIntersection(new Ray(new Point3D(0,0,0),new Vector(0,0,-1)))
	/*	for(Iterator it = LTri.iterator(); it.hasNext(); it.next())
		{
			Point3D C = (Point3D) it.next();
			System.out.println(C);
		}
		assertTrue(LTri.equals(LTR1));*/
	/*	TY = new Triangle(new Color(), new Point3D(0,-1,-2), new Point3D(1,1,-2), new Point3D(-1,1,-2));
		LinkedList<Point3D> LTri2 = TY.findIntersection(new Ray(new Point3D(0,-10,0),new Vector(3,6,1)));
		if(!LTri2.isEmpty()){
		for(Iterator it = LTri2.iterator(); it.hasNext(); it.next())
		{
			Point3D C = (Point3D) it.next();
			System.out.println(C);
		}}
		else
			System.out.println("IsnotEmpty");

		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	//	System.out.println("Nhere");
	}*/
	

	@Test
	public void testTriangleIntersections() throws Exception
	{

		// creating the expected values
		
		List<Point3D> answerList = new LinkedList<Point3D>();		
		Point3D answerPoint = new Point3D(0, 0, -200);		
		answerList.add(answerPoint);
		
		// building the triangle
		
		Point3D p1 = new Point3D(0, 100, -200);
		Point3D p2 = new Point3D(100, -100, -200);
		Point3D p3 = new Point3D(-100, -100, -200);
		
		Triangle t1 = new Triangle(new Color(255,255,255), p1, p2, p3);
		Triangle t2 = new Triangle(new Color(255,255,255), p1, p2, p3);			
		
		// building the ray that will intersect the triangle
		
		Point3D centerPoint = new Point3D(0,0,0);		
		Vector vector = new Vector(0, 0, -5);
		Ray ray = new Ray(centerPoint, vector);
	
		// testing the findIntersection function
		
		List<Point3D> list = new LinkedList<Point3D>();
		list = t2.findIntersection(ray);
		
		/*for(Iterator iter = list.iterator();iter.hasNext();iter.next())
		{
			System.out.println(iter.next());
		}*/
		
		
		
		assertTrue(answerPoint.equals(list.get(0)));			
	}


}
