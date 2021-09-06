package geometries;
import primitives.*;
import java.util.LinkedList;

public class Cylinder extends Tube implements Geometry 
{
	
  	
  double height;
  

public Cylinder(Color color, Ray rc, double Mheight,double RC) {
	super(color, rc,RC);
	this.height = Mheight;
}

public double getHeight() {
	return height;
}
  
public Vector GetNormal(Point3D PC) throws Exception
{
	double T = RT.VR.dotProduct(PC.substract(RT.PR));
	
	if(T==0 || T==this.height)
		return RT.VR.normalisatsiaVector();
	
	Vector V = PC.substract(this.RT.PR).substractVector(RT.VR.multScalar(RT.VR.dotProduct(PC.substract(this.RT.PR))));
	V.normalisatsiaVector();
	return V;
}

  public LinkedList<GeoPoint> findIntersection(Ray RIC) // A FAIRE avec le Test aussi 
  {
	  LinkedList<GeoPoint> LC = new LinkedList<GeoPoint>();
	  return LC;
  }
}
