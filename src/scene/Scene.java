package scene;
import geometries.*;
import renderer.*;
//import java.awt.Color;
import primitives.*;
import elements.*;
import java.util.*;

public class Scene {
	
	String sceneName;
	Color background;
	AmbientLight AL;
	public List<Geometries> _geometries ;
	Camera camera;
	double distance;
	public List<Light> _lights;
	
	public Scene(String MyName) throws Exception
	{
		this.sceneName = MyName;
		background = new Color(0,0,0);
		AL = new AmbientLight();
		_geometries = new LinkedList<Geometries>();
		_lights = new LinkedList<Light>();
		camera = new Camera();
		distance = 100;
		
	}
	
	public Scene() throws Exception
	{
		this.sceneName="None";
		background = new Color(0,0,0);
		AL = new AmbientLight();
		_geometries = new LinkedList<Geometries>();
		_lights = new LinkedList<Light>();
		camera = new Camera();
		distance = 100;
		
	}
	public Scene (Scene other)
	{
		this.sceneName=other.sceneName;
		this.background=other.background;
		this.AL=other.AL;
		this._geometries=other._geometries;
		this._lights = other._lights;
		this.camera=other.camera;
		this.distance=other.distance;
	}

	public String getSceneName() {
		return sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
		
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	public AmbientLight getAL() {
		return AL;
	}

	public void setAL(AmbientLight aL) {
		AL = aL;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public void addGeometries(Geometries g)
	{
		this._geometries.add(g);
	}
	
	public Iterator<Geometries> getGeometriesIterator()
	{
		return this._geometries.iterator();
	}
	
	public void getGeometries()
	{  Iterator itr = getGeometriesIterator();
		while(itr.hasNext())
		{
			Object G = itr.next();
			
			System.out.println(G);
		}
	}
	
	public void addLight(Light LS)
	{
		this._lights.add(LS);
	}
	
	
	public void getLight()
	{
		while(_lights.iterator().hasNext())
		{
			System.out.println(_lights.iterator().next().toString());
			_lights.iterator().next();
		}
	}
	
	public Iterator<Light> getLightIterator()
	{
		return this._lights.iterator();
	}
	
	
	
	
}
