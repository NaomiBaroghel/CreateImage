package geometries;

//import java.util.List;
//import java.util.ArrayList;
import java.util.LinkedList;
import primitives.Point3D;
import primitives.Ray;

public interface Intersectable 
{
	static class GeoPoint{
		public Geometries geometries;
		public Point3D point;
		
		public GeoPoint(Geometries g, Point3D p)
		{
			geometries = g;
			point = p;
		}
		public GeoPoint()
		{
		}
		
		public boolean equals(GeoPoint GP)
		{
			if(this.geometries==GP.geometries && this.point.equals(GP.point))
				return true;
			return false;
		}
	}
	
	

	public  LinkedList<GeoPoint> findIntersection(Ray RI) throws Exception;
}
