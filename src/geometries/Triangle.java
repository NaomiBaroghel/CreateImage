package geometries;
import primitives.*;
import java.util.LinkedList;

import static geometries.Intersectable.GeoPoint;

public class  Triangle extends Plane  implements Geometry
{
	Point3D point1;
	Point3D point2;
	Point3D point3;
	
	public Triangle(Color color, Point3D p1, Point3D p2, Point3D p3) throws Exception
	{
		

		super(color, p1,new Vector()); //initialisation wich don't count
		this.point1 = p1;
		this.point2 = p2;
		this.point3 = p3;
		this.vectorN = GetNormal(new Point3D());

	}

	public Triangle() throws Exception
	{
		super(new Color(), new Point3D(), new Vector()); //initialisation wich don't count
		this.point1 = new Point3D();
		this.point2 = new Point3D();
		this.point3 = new Point3D();
		this.vectorN = GetNormal(new Point3D(4,5,6));
	}
	
	//Getfonctions
	public Point3D getPoint1() {
		return new Point3D(point1.getX().get(), point1.getY().get(), point1.getZ().get());
	}

	public Point3D getPoint2() {
		return new Point3D(point2.getX().get(), point2.getY().get(), point2.getZ().get());
	}

	public Point3D getPoint3() {
		return new Point3D(point3.getX().get(), point3.getY().get(), point3.getZ().get());
	}

      
	public Vector GetNormal(Point3D PP) throws Exception
	{
		Vector V1 = point2.substract(point1);
		Vector V2 = point3.substract(point1);
		
		Vector VectorN = V1.crossProduct(V2);
		return VectorN.normalisatsiaVector();
	}
	
	@Override
	public LinkedList<GeoPoint> findIntersection(Ray RIT) throws Exception
	{
	//	System.out.println("Find");
		LinkedList<GeoPoint> LT = new LinkedList<GeoPoint>();
     Vector V1 = point1.substract(RIT.PR); 
     //System.out.println("V1"+V1.toString());
     Vector V2 = point2.substract(RIT.PR);
     //System.out.println("V2"+V2.toString());
     Vector V3 = point3.substract(RIT.PR);
     //System.out.println("V3"+V3.toString());

     
     Vector N1 = (V1.crossProduct(V2)).normalisatsiaVector();
     //System.out.println("N1"+N1.toString());
     Vector N2 = (V2.crossProduct(V3)).normalisatsiaVector();
     //System.out.println("N2"+N2.toString());
     Vector N3 = (V3.crossProduct(V1)).normalisatsiaVector();
     //System.out.println("N3"+N3.toString());
     
     Plane PT = new Plane(new Color(255,255,255), this.point,this.vectorN);
     
     LinkedList<GeoPoint> IntersectionPlane = PT.findIntersection(RIT);
     if(IntersectionPlane.isEmpty())
     {
    	 //System.out.println("PlaneEmpty");
    	 return LT;
     }
     GeoPoint G = IntersectionPlane.getFirst();
     Point3D PIP = G.point;
  //   System.out.println("PIP " +PIP.toString());
     double x=PIP.substract(RIT.PR).dotProduct(N1);
    // System.out.println("x"+x);
     double y=PIP.substract(RIT.PR).dotProduct(N2);
     //System.out.println("y"+y);
     double z=PIP.substract(RIT.PR).dotProduct(N3);
     //System.out.println("z"+z);
     
  //   System.out.println(N1.toString()+"\n"+ N2.toString()+"\n"+ N3.toString());
     
  //   System.out.println(x+" \n"+y+ "\n "+ z);
     
     
     if((x>0 && y>0 && z>0)||(x<0 && y<0 && z<0))
     {
    	 
    	 GeoPoint gp = new GeoPoint(this,new Point3D(PIP.getX().get(),PIP.getY().get(),PIP.getZ().get()));
    	 
    	 LT.add(0, gp);
    	 return LT;
     }
   /*  else
     throw new Exception("There's no intersection point");*/
     return LT;
    	
     
}
	}
