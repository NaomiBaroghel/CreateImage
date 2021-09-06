package renderer;
import scene.*;
import elements.*;

//import java.awt.Color;
import java.io.File;
import primitives.*;
import primitives.Vector;

import java.util.*;
//import java.util.Map.*;
import java.math.*;

import static geometries.Intersectable.GeoPoint;
import geometries.*;


public class Render {

	ImageWriter _imageWriter;
	Scene _scene;
	String RenderName;
	private static final double EPS = 1.0;
	private static final double MinCalColorK = 0.001;
	private static final int MAX_CALC_COLOR_LEVEL = 4;
	private static final int n1 = 1;
	private static final int n2 = 1;

	public Render(ImageWriter MyImageWriter, Scene MyScene) // constructor
	{
		this._imageWriter = new ImageWriter(MyImageWriter);
		this._scene = new Scene(MyScene);
	}

	public Render(Render render) //copy constructor
	{
		this._imageWriter = new ImageWriter(render._imageWriter);
		this._scene = new Scene(render._scene);
	}


	public ImageWriter get_imageWriter() {
		return _imageWriter;
	}

	public void set_imageWriter(ImageWriter _imageWriter) {
		this._imageWriter = _imageWriter;
	}

	public Scene get_scene() {
		return _scene;
	}

	public void set_scene(Scene _scene) {
		this._scene = _scene;
	}




	public void renderImage() throws Exception
	{

		for (int i=0; i< _imageWriter.getHeight(); i++)
			for (int j=0; j< _imageWriter.getWidth(); j++)
			{
				Ray ray =_scene.getCamera().constructRayThroughPixel(_imageWriter.getNx(),
						_imageWriter.getNy(), j, i,_scene.getDistance(), _imageWriter.getWidth(), 
						_imageWriter.getHeight());
				LinkedList<GeoPoint> intersectionPoints = null;
				intersectionPoints = getSceneRayIntersections(ray); 
				if (intersectionPoints.isEmpty())
				{
					_imageWriter.writePixel(j, i, _scene.getBackground());
				}
				else
				{
					GeoPoint closestPoint = getClosestPoint(intersectionPoints); 
					_imageWriter.writePixel(j, i,calcColor(closestPoint,ray));
				}
			}
	}


	private LinkedList<GeoPoint> getSceneRayIntersections(Ray ray) throws Exception
	{
		Iterator<Geometries> geometries_ = _scene.getGeometriesIterator();
		LinkedList<GeoPoint> IntersectionPoints = null;
		IntersectionPoints = new LinkedList<GeoPoint>();

		while(geometries_.hasNext())
		{
			Geometries G = geometries_.next();
			List<GeoPoint> geometryIntersectionPoints = G.findIntersection(ray);
			IntersectionPoints.addAll(geometryIntersectionPoints);

		}




		return IntersectionPoints;
	}


	private GeoPoint getClosestPoint(LinkedList<GeoPoint> intersectionPoints){
		double distance = Double.MAX_VALUE;
		Point3D Makom = _scene.getCamera().getMakom();
		Point3D minDistancePoint = null;
		GeoPoint GP = new GeoPoint();

		for (GeoPoint gp : intersectionPoints)
			if(Makom.distance(gp.point) <distance)
			{
				minDistancePoint = new Point3D(gp.point.getX().get(),gp.point.getY().get(),gp.point.getZ().get());
				distance = Makom.distance(gp.point);
				GP = gp;
			}


		//return minDistancePoint;
		return GP;

	}

	private Color calcColor(GeoPoint closestPoint, Ray inRay) throws Exception
	{
		return calcColor(closestPoint, inRay, MAX_CALC_COLOR_LEVEL, 200).add(_scene.getAL().GetIntensity(closestPoint));
	}

	private Color calcColor(GeoPoint closestPoint,Ray ray,int level, double k) throws Exception
	{
		if(level==0 || k<MinCalColorK)
		{
			return new Color(0,0,0);
		}


		Color ambientLight = _scene.getAL().GetIntensity(closestPoint);
		Color emissionLight = closestPoint.geometries.GetEmission();
		Iterator<Light>lights = null;
		lights = _scene.getLightIterator();
		Color diffuseLight = new Color();
		Color specularLight = new Color();
		Color reflectedLight  = new Color();
		Color refractedLight = new Color();
		Color color = new Color();

		while(lights.hasNext())
		{

			Light L1 = lights.next();
		
				Vector N = closestPoint.geometries.GetNormal(closestPoint.point);
				double d = N.dotProduct(L1.GetL(closestPoint));
				if(d<0)
				{
			

					
					if(unshaded(L1.GetL(closestPoint),closestPoint.geometries.GetNormal(closestPoint.point),closestPoint))
					{

						//transparency
//						Vector L = L1.GetL(closestPoint);
//						if (closestPoint.geometries.GetNormal(closestPoint.point).dotProduct(L)*closestPoint.geometries.GetNormal(closestPoint.point).dotProduct(closestPoint.point.substract(_scene.getCamera().getMakom()).normalisatsiaVector()) > 0)
//						{
//					       double ktr = transparency(L1.GetL(closestPoint), closestPoint.geometries.GetNormal(closestPoint.point), closestPoint);
//					       if (ktr * k < MinCalColorK) 
//					       {
//					    	   Color lightIntensity = L1.GetIntensity(closestPoint).scale(ktr);
//					    	   color = color.add(calcDiffusiveComp(closestPoint.geometries.GetMaterial().getkD(), 
//										closestPoint.geometries.GetNormal(closestPoint.point), 
//										L1.GetL(closestPoint).normalisatsiaVector(), 
//										lightIntensity));
//					    	   color = color.add(calcSpecularComp(closestPoint.geometries.GetMaterial().getkS(),
//										closestPoint.point.substract(_scene.getCamera().getMakom()).normalisatsiaVector(),
//										closestPoint.geometries.GetNormal(closestPoint.point),
//										L1.GetL(closestPoint).normalisatsiaVector(), 
//										closestPoint.geometries.GetMaterial().getShininess(), lightIntensity));
//					       }
//						}
//						else
//						{
						Color c = calcDiffusiveComp(closestPoint.geometries.GetMaterial().getkD(), 
								closestPoint.geometries.GetNormal(closestPoint.point), 
								L1.GetL(closestPoint).normalisatsiaVector(), 
								L1.GetIntensity(closestPoint));
						diffuseLight = diffuseLight.add(c);
	
						c=calcSpecularComp(closestPoint.geometries.GetMaterial().getkS(),
								closestPoint.point.substract(_scene.getCamera().getMakom()).normalisatsiaVector(),
								closestPoint.geometries.GetNormal(closestPoint.point),
								L1.GetL(closestPoint).normalisatsiaVector(), 
								closestPoint.geometries.GetMaterial().getShininess(),
								L1.GetIntensity(closestPoint));
						specularLight = specularLight.add(c);
					}
			//		}
				}

					
				
	}
		
	



		//System.out.println("Diff1"+diffuseLight.toString());
		//System.out.println("Spec1"+specularLight.toString());
		//System.out.println("Emission1"+emissionLight.toString());
		//System.out.println("Ambient1"+ambientLight.toString());

		color = emissionLight; 
		//System.out.println("Color Emission" + color.toString());
	//	color = color.add(ambientLight);
		//		//System.out.println("Color Ambient" + color.toString());
		color = color.add(diffuseLight);
		//		//System.out.println("Color Diffuse" + color.toString());
		color = color.add(specularLight);
		//System.out.println("Color specular" + color.toString());



//reflected
		double kr = closestPoint.geometries.GetMaterial().getkR();
		Ray reflectedRay = constructReflectedRay(closestPoint.geometries.GetNormal(closestPoint.point), closestPoint.point, ray);
		LinkedList<GeoPoint> reflectedPoint = getSceneRayIntersections(reflectedRay);

		GeoPoint CP =  new GeoPoint();

		Iterator iter = reflectedPoint.iterator();
		while (iter.hasNext())
		{
			GeoPoint g = (GeoPoint) iter.next();
			if(Math.abs(closestPoint.point.substract(g.point).lenghtVector())<0.01)
			{

				iter.remove();

			}
		}
		CP =  getClosestPoint(reflectedPoint);
		if(!reflectedPoint.isEmpty())
		{

			reflectedLight=calcColor(CP, reflectedRay, level-1, k*kr);
			reflectedLight = reflectedLight.scale(kr);



		}
//
//refracted : kt = 0 -> no refraction
		double kt = closestPoint.geometries.GetMaterial().getkT();
		Ray refractedRay = constructRefractedRay(closestPoint.geometries.GetNormal(closestPoint.point),closestPoint, ray) ;
		LinkedList<GeoPoint> intersectionRefracted = getSceneRayIntersections(refractedRay);
		
		 iter = intersectionRefracted.iterator();
		while (iter.hasNext())
		{
			GeoPoint g = (GeoPoint) iter.next();
			if(Math.abs(closestPoint.point.substract(g.point).lenghtVector())<0.01)
			{
				iter.remove();
			}
		}
		 CP =  getClosestPoint(intersectionRefracted);
		intersectionRefracted.remove(CP);	
		CP =  getClosestPoint(intersectionRefracted);


		
		if (!intersectionRefracted.isEmpty()) 
		{
			 refractedLight =calcColor(CP, refractedRay , level-1, k*kt);
			 refractedLight= refractedLight.scale(kt);
		}



			
			
			

		color = color.add(reflectedLight);
        color = color.add(refractedLight);




		return color;

	}


	public Color calcDiffusiveComp(double D, Vector N, Vector L, Color i)
	{


		double k=N.dotProduct(L)*D;
		if(k<0)
			k=k*-1;


		return i.scale(k);

	}

	public Color calcSpecularComp(double S, Vector U, Vector N, Vector L, int Shine, Color i) throws Exception
	{
		Vector R = L.substractVector(N.multScalar(((L.dotProduct(N))*2)));
		if(Math.pow((U.dotProduct(R)),(double)Shine)<0)
		{
			return new Color(0,0,0);
		}
		return i.scale(Math.pow((U.dotProduct(R)),(double)Shine)*S);
	}

	public boolean unshaded(Vector L,Vector N,GeoPoint gp) throws Exception
	{
		Vector lightDirection = L.multScalar(-1);
		Vector epsVector = N;
		

		epsVector.multScalar(2);
		Point3D point = gp.point.addVectorToPoint(epsVector);
		Ray r = new Ray(point,lightDirection);
		LinkedList<GeoPoint> intersectionPoint = getSceneRayIntersections(r);	

		return intersectionPoint.isEmpty();

	}

	public Ray constructReflectedRay(Vector N, Point3D P, Ray r) throws Exception
	{
		Vector R = r.VR.substractVector(N.multScalar(((r.VR.dotProduct(N))*2)));
		return new Ray(P,R);
	}




	private Ray constructRefractedRay(Vector N,GeoPoint point,Ray ray) throws Exception
	{
		//ray.VR.normalisatsiaVector();
		return new Ray(point.point,ray.getVR());
	}


	public double transparency (Vector L, Vector N, GeoPoint gp) throws Exception
	{
		Vector LightDirection = L.multScalar(-1);
		Vector epsVector= N.multScalar(2);
		Point3D P = gp.point.addVectorToPoint(epsVector);
		Ray LightRay = new Ray(P,LightDirection);

		LinkedList<GeoPoint> intersections = getSceneRayIntersections(LightRay);
		double ktr =1;
		for (GeoPoint gp1 : intersections)
		{
			ktr = ktr*gp1.geometries.GetMaterial().getkT();
		}
		return ktr;
	}

	

	//PrintGrid
	public void PrintGrid(int interval, Color color) {		
		for (int i=0;i<this._imageWriter.getWidth();i++)
		{
			for (int j=0; j<this._imageWriter.getHeight(); j++){
				if(i%interval==0 || j%interval==0)
					this._imageWriter.writePixel(j, i, color);
			}

		}	



	}
}