package elements;

import primitives.*;
import static geometries.Intersectable.GeoPoint;

//import geometries.Intersectable.GeoPoint;

//import java.awt.Color;

public class AmbientLight extends Light
{
	
	Color IA;
	double KA;
	
	public AmbientLight()
	{
		IA =  new Color(64,64,64);
		KA = 0.5;
	}
	
	AmbientLight(double R, double G, double B, double k)
	{
		this.KA=k;
		this.IA= new Color(R,G,B);
	}
	
	
	public Color GetIntensity(GeoPoint p){
		return this.IA.scale(KA); // censé mutiplier chaque double du IA par le double KA
		// est-ce que le IA garde sa valeur de base ?
	}


	
	public Vector GetL(GeoPoint gp)
	{
		return new Vector(1,1,1);
	}

	public Vector GetD(GeoPoint gp)
	{
		return new Vector (1,1,1);
	}
	
}
