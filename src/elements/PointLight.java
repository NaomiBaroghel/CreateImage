package elements;
import primitives.*;
import static geometries.Intersectable.GeoPoint;

//import geometries.Intersectable.GeoPoint;




public class PointLight extends Light
{
   public Point3D _position;
   double kC, kL,kQ;
   
   public PointLight(Color c, Point3D p, double C, double L, double Q)
   {
	   super(c);
	   this._position = p;
	   this.kC=C;
	   this.kL=L;
	   this.kQ=Q;
   }
   public PointLight()
   {
	   
   }

   
   public Color GetIntensity(GeoPoint gp)
   {
	   //System.out.println("Intensity");

	   double _distance = gp.point.distance(this._position);
	   //System.out.println("_distance");

	   //System.out.println(_distance);
	  // System.out.println(this.kC+this.kL*_distance+this.kQ*_distance*_distance);
	   
//	   if(this.kC+this.kL*_distance+this.kQ*_distance*_distance<1)
//	   {
//		   System.out.println("Cookie"+this.kC+this.kL*_distance+this.kQ*_distance*_distance);
//	   }
	   //System.out.println(this.kC+this.kL*_distance+this.kQ*_distance*_distance);

	   Color color=this.CL;
	  color = CL.scale(Math.max(1, this.kC+this.kL*_distance+this.kQ*_distance*_distance));
	   
	   return color;
   }
   
   public Vector GetL(GeoPoint gp) throws Exception
	{
	   //System.out.println("GETL");

	return gp.point.substract(this._position);
	  // return new Vector(1,1,1);
	}
   
   public Vector GetD(GeoPoint gp)
	{
		return new Vector(0,0,0);
	}
   


}
