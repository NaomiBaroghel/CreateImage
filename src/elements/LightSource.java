package elements;
import primitives.*;

import static geometries.Intersectable.GeoPoint;


public interface LightSource 
{

	public Color GetIntensity(GeoPoint gp);
	public Vector GetL(GeoPoint gp) throws Exception;
	public Vector GetD(GeoPoint gp);
	
}
