package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import primitives.*;
import geometries.Sphere;
import geometries.*;
import static geometries.Intersectable.GeoPoint;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SphereTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
/*	@Test
	public void SGetNormalTest() throws Exception
	{
		
		Sphere s = new Sphere(new Color(), 7.5, new Point3D (1,2,3));
		Vector V1 = s.GetNormal(new Point3D(3,2,1));
		Vector V2 = new Vector(2/Math.sqrt(8), 0,-2/Math.sqrt(8));
		assertTrue(V1.equals(V2));

	}
	
	@Test
	public void SfindIntersection() throws Exception // Marche
	{
		Sphere s = new Sphere(new Color(), 10, new Point3D (1,2,3));
		try {
		LinkedList<Point3D> LSS1 = s.findIntersection(new Ray(new Point3D(1,2,2), new Vector(3,2,1)));
		Point3D P1 = LSS1.getFirst();
		Point3D P2 = LSS1.getLast();
		Point3D P3 = new Point3D(34,24,13);
		Point3D P4 = new Point3D(-26,-16,-7);
	//	LinkedList<Point3D> LSS2 = new LinkedList<Point3D>();
		

	//	System.out.println(P1.toString()+P2.toString()+P1.equals(P3)+P2.equals(P4));
		assertTrue(P1.equals(P3));
		assertTrue(P2.equals(P4));
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		 s = new Sphere(new Color(), 2, new Point3D (1,2,3));
		try {
			LinkedList<Point3D> LSS1 = s.findIntersection(new Ray(new Point3D(0,-1,0), new Vector(1,0,0)));
			}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		
	}
	
}*/
	@Test
	public void testSphereIntersections() throws Exception
	{
	

		// creating the expected values
		List<GeoPoint> answerList1 = new LinkedList<GeoPoint>();
		List<GeoPoint> answerList2 = new LinkedList<GeoPoint>();
	
		GeoPoint answerPoint1 = new GeoPoint(new Sphere(), new Point3D(0, 0, -200));
		GeoPoint answerPoint2 = new GeoPoint(new Sphere(),new Point3D(0, 0, -600));
		
		answerList2.add(answerPoint1);
		answerList2.add(answerPoint2);
		
		
		// building the spheres
		
		Point3D p1 = new Point3D(0, 0, -400);
		Point3D p2 = new Point3D(0, 0, -400);		
		Point3D centerPoint = new Point3D(0,0,0);
		
		Vector direction1 = new Vector(50, -50, -50);
		Vector direction2 = new Vector(0, 0, -5);
		Sphere sphere1 = new Sphere(new Color(255,255,255), 200, p1);
		Sphere sphere2 = new Sphere(new Color(255,255,255), 200, p2);
		
		// building the ray that will intersect the spheres
		
		Ray ray1 = new Ray(centerPoint, direction1);
		Ray ray2 = new Ray(centerPoint, direction2);
		
		// testing the findIntersection functions
		List<GeoPoint> list1 = new LinkedList<GeoPoint>();
		list1 = sphere1.findIntersection(ray1);
		Iterator iter1 = answerList1.iterator();
		
		if(list1.isEmpty())
			System.out.println("Empty");
		for(Iterator iter = list1.iterator() ; iter.hasNext(); iter.next())
		{
			System.out.println("Answer1 : " + iter1.next());
			System.out.println("Mine1 : " + iter.next());
//			assertTrue(iter1.next().equals(iter.next()));
//			iter1.next();
		}
		
		List<GeoPoint> list2 = new LinkedList<GeoPoint>();
		list2 = sphere2.findIntersection(ray2);
		
		if(list2.isEmpty())
			System.out.println("Empty");
		 iter1 = list2.iterator();
		 	GeoPoint P = (GeoPoint)iter1.next();
			System.out.println("Answer2 : " + P);
			System.out.println("Mine2 : " + iter1.next());
			
	Ray ray3 = new Ray(P.point, direction2);
	System.out.println(P.point);
	List<GeoPoint> list3 = new LinkedList<GeoPoint>();
	list3 = sphere2.findIntersection(ray2);
	
	if(list3.isEmpty())
		System.out.println("Empty");
	 iter1 = list3.iterator();
	 GeoPoint GP1 = (GeoPoint)iter1.next();
	 GeoPoint GP2 = (GeoPoint)iter1.next();

		System.out.println("Answer3 : " + GP1.point.toString());
		System.out.println("Mine3 : " + GP2.point.toString());
	
	
		}
	

}