package geometries;
import primitives.Point3D;
import primitives.Vector;

public interface Geometry extends Intersectable
{
	
	 public Vector GetNormal (Point3D P) throws Exception;
	

}
