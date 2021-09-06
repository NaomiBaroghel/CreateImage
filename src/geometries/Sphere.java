package geometries;
import primitives.*;
import primitives.Util;
import java.util.LinkedList;

public class Sphere extends RadialGeometry implements Geometry
{
	
	Point3D pointO;
	
	public Sphere()
	{
		
	}
	
	public Sphere(Color color,double _radius, Point3D point) {
		super(color,_radius);
		this.pointO = point;
		
	}

	public Point3D getPoint() {
		return new Point3D(pointO.getX().get(),pointO.getY().get(), pointO.getZ().get());
	}

	
	public Vector GetNormal(Point3D PS) throws Exception
	{
		Vector VN= PS.substract(pointO);
		
		 VN = VN.normalisatsiaVector();
		 
		 return VN;

	}
	
	public LinkedList<GeoPoint> findIntersection(Ray RIS) throws Exception
	{
		
		
		LinkedList<GeoPoint> LS = new LinkedList<GeoPoint>();
		
		RIS.VR.normalisatsiaVector();
		
		Vector U = pointO.substract(RIS.PR);
		double TM = RIS.VR.dotProduct(U);
		double d = Math.sqrt(U.lenghtVector()*U.lenghtVector()-TM*TM);
		//System.out.println(d);
		double TH = Math.sqrt(this._radius*this._radius-d*d);
		
		//distance O et P0 de la ray ainsi que O et PO du cercle
		Point3D Pzero= new Point3D();
		
		double distance1 = Pzero.distance(RIS.PR);
		double distance2 = Pzero.distance(this.pointO);
		

			
		
			if(d>this._radius)
		{
			//throw new Exception ("There's no intersection with the sphere");
			//System.out.println("There's no intersection with the sphere");
			 return LS;
		}
		if(d==this._radius)
		{
			System.out.println("There's only one intersection point");
			Point3D P1 = RIS.PR.addVectorToPoint(RIS.VR.multScalar(TM));
			GeoPoint GP = new GeoPoint(this,P1);
			LS.add(0, GP);
			return LS;
		}
		double T1 = TM + TH;
		double T2 = TM - TH;
//		if(primitives.Util.isZero(T1))
//		{
//			return LS;
//		}
		 if(T1>0)
		{
		Point3D P1 = RIS.PR.addVectorToPoint(RIS.VR.multScalar(T1));
		GeoPoint GP = new GeoPoint(this,P1);
		LS.add(0, GP);
		}
//		if(primitives.Util.isZero(T2))
//		{
//			return LS;
//		}

		 if(T2>0)
		{
			//System.out.println("RIS.VR =" + RIS.VR + "T2=" + T2);
			//System.out.println(RIS.VR.multScalar(T2));

		Point3D P2 = RIS.PR.addVectorToPoint(RIS.VR.multScalar(T2));
		GeoPoint GP = new GeoPoint(this,P2);
		LS.add(1, GP);
		}
		
		return LS;
		}
	//}

}
