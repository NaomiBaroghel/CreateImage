package geometries;
import primitives.*;

import java.util.LinkedList;
import geometries.RadialGeometry;

public  class Tube extends RadialGeometry implements Geometry
{
	
	public Ray RT;

	public Tube(Color color, Ray MRT, double rt) {
		super(color, rt);
		this.RT = MRT;
	}
	
	
	public Tube(){
		super();
	}

	public Ray getRay() {
		return new Ray(RT.PR, RT.VR);
	}
	
	public  Vector GetNormal(Point3D PT) throws Exception
	{ 
		Vector V = PT.substract(this.RT.PR).substractVector(RT.VR.multScalar(RT.VR.dotProduct(PT.substract(this.RT.PR))));
		 
		V.normalisatsiaVector();
		return V;
		
	}
	
	 public LinkedList<GeoPoint> findIntersection(Ray RITT) // A FAIRE Avec le TEst aussi
	  {
		  LinkedList<GeoPoint> LTT = new LinkedList<GeoPoint>();
		  
		  return LTT;
	  }
	

}
