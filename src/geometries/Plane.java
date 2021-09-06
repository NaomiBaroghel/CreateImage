package geometries;
import primitives.*;
import java.util.LinkedList;

//import geometries.Intersectable.GeoPoint;

import static geometries.Intersectable.GeoPoint;

public class Plane extends Geometries implements Geometry
{

	Point3D point;
	public Vector vectorN;
	
	public Plane(Color color, Point3D point, Vector vector) {
		super(color);
		this.point = point;
		this.vectorN = vector;
	} 
	

	
	//GetFonction
	
	public Point3D getPoint() {
		return new Point3D(point.getX().get(), point.getY().get(), point.getZ().get());
	}
	
	public Vector getVectorN() throws Exception
	{
		return new Vector(vectorN.getVec().getX().get(),vectorN.getVec().getY().get(),vectorN.getVec().getZ().get());
	}
	
	public Vector GetNormal(Point3D PP) throws Exception
	{
		return vectorN.normalisatsiaVector();
	}
	
	
	public LinkedList<GeoPoint> findIntersection(Ray RIP)throws Exception
	{
		LinkedList<GeoPoint> LP = new LinkedList<GeoPoint>();
		double t = (vectorN.dotProduct(point.substract(RIP.PR)))/(vectorN.dotProduct(RIP.VR));
	//	System.out.println(t);
		if(t>0)
		{
			//System.out.println("RIP.VR=" + RIP.VR + "t=" +t);
			Point3D PIP=RIP.PR.addVectorToPoint(RIP.VR.multScalar(t));
			//System.out.println("PIP=" + PIP);
			GeoPoint GP = new GeoPoint(this,PIP);
			LP.add(0, GP);
		}
		
		return LP;
	}



	
	
}
