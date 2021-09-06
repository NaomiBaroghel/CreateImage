package elements;
import primitives.*;
import static geometries.Intersectable.GeoPoint;


public abstract class Light implements LightSource
{
	
	Color CL;
	
	
	public Light() {
		this.CL = new Color(255,255,255);
	}


	public Light(Color cL) {
		this.CL = cL;
	}
	



	public abstract Color GetIntensity(GeoPoint point);
	public abstract Vector GetL(GeoPoint gp) throws Exception;
	public abstract Vector GetD(GeoPoint gp);


	

}
