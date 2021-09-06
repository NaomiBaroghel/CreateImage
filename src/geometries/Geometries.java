package geometries;
import geometries.*;
import geometries.Intersectable.GeoPoint;
import primitives.*;
import java.util.LinkedList;

public abstract class Geometries {
   
	protected Color CG;
	 Material _material;
	
	public Geometries (Color MyColor)
	{
		this.CG = MyColor;
	}
	
	public Geometries()
	{
		this.CG=null;
	}

	public Color getCG() {
		return CG;
	}
	
	public Color GetEmission()
	{
		return CG;
	}
	
	public abstract LinkedList<GeoPoint> findIntersection(Ray R) throws Exception;
	
	public Material GetMaterial()
	{
		return this._material;
	}
	
	public void SetMaterial(Material m)
	{
		//System.out.println("Set");
		this._material=m;
	//	System.out.println("SetGETKD" +this._material.getkD());


	}
	//pas sur qu'il marche :
//	public boolean equals(Geometries g)
//	{
//		if(g.getCG()==this.getCG())
//		System.out.println(this.getClass()==g.getClass());
//		return this.getClass()==g.getClass();
//	}
	
	public abstract Vector GetNormal(Point3D p) throws Exception;
}

