package elements;
import geometries.Intersectable.GeoPoint;
import primitives.*;

public class SpotLight extends PointLight 
{
   Vector SVDirection;
   
   public SpotLight(Color c,Vector v, Point3D p, double C, double Q, double L) throws Exception
   {
	   super(c, p, C, Q, L);
	   this.SVDirection = v;
	   this.SVDirection.normalisatsiaVector();
   }
   
   public Color GetItensity(Point3D p) throws Exception
   {
	   double _distance = p.distance(this._position);
	   Vector _v = p.substract(this._position);
	   Color color = this.CL.scale(Math.max(0,SVDirection.dotProduct(_v))).reduce(this.kC+this.kL*_distance+kQ*_distance*_distance);
	   return color;
   }
   
   public Vector GetL(GeoPoint gp)
	{
	   //System.out.println(gp.point.substract(this._position).toString());
		return gp.point.substract(this._position);
	}
   
   public Vector GetD()
   {
	   return this.SVDirection;
   }
}
