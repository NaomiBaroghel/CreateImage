package elements;
import primitives.*;

import static geometries.Intersectable.GeoPoint;

//import geometries.Intersectable.GeoPoint;

public class DirectionalLight extends Light
{

	Vector DVDirector;
	
	public DirectionalLight(Color c, Vector v) throws Exception
	{
		this.CL = c;
		this.DVDirector = v;
		this.DVDirector.normalisatsiaVector();
	}
	public Color GetIntensity(GeoPoint p)
	{
		return this.CL;
	}
	

	public Vector GetD(GeoPoint gp)
	{
		return this.DVDirector;
	}
	
	public Vector GetL(GeoPoint gp)
	{
		return new Vector(0,0,-1);
	}


	
}
