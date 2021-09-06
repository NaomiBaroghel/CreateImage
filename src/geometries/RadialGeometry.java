package geometries;
import primitives.*;

abstract public class RadialGeometry extends Geometries
{
	
	double _radius;
	
//ctor
	public RadialGeometry(Color color, double _radius) {
		super(color);
		this._radius = _radius;
		
	}
	
	public RadialGeometry(){
		this._radius=0.0;
	}

	public double get_radius() {
		return _radius;
	}

	public void set_radius(double _radius) {
		this._radius = _radius;
	}

	//copy-ctor
	public RadialGeometry(RadialGeometry rg)
	{
		_radius=rg._radius;

	}
	
	
	
	
}
