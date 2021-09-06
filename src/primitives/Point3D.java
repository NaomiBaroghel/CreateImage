package primitives;

import static primitives.Util.*;

public class Point3D {

	Coordinate x;
	Coordinate y;
	Coordinate z;
	
	public Point3D(double _x, double _y, double _z) {
		
		this.x = new Coordinate (_x);
		this.y = new Coordinate (_y);
		this.z = new Coordinate (_z);
	}
	
	public Point3D() {
		
		this.x= new Coordinate (0.0);
		this.y= new Coordinate(0.0);
		this.z= new Coordinate (0.0);
	}

	public Coordinate getX() {
		return new Coordinate(x.get());
	}

	public void setX(Coordinate x) {
		this.x = new Coordinate(x._coord);
	}

	public Coordinate getY() {
		return new Coordinate(y.get());
	}

	public void setY(Coordinate y) {
		this.y = new Coordinate(y._coord);
	}

	public Coordinate getZ() {
		return new Coordinate(z.get());
	}

	public void setZ(Coordinate z) {
		this.z = new Coordinate(z._coord);
	}

	

	
	public boolean equals(Point3D point3d)
	{
		if(this.x.equals(point3d.x)&&this.y.equals(point3d.y)&&this.z.equals(point3d.z))
			return true;
	 return false;
		
	}

	
	public String toString()
	{
		return "Point3D (x=" + x + ", y=" + y + ", z=" + z + ")";
	}
	
	
	public Vector substract(Point3D p)
	{
		Vector f= new Vector();
		
		f.vec.x=this.x.subtract(p.x);
		f.vec.y=this.y.subtract(p.y);
		f.vec.z=this.z.subtract(p.z);
	  
	  return f;
		
	}
	
	public Point3D addVectorToPoint(Vector v)
	{
		Point3D p=new Point3D();
		
		  p.x=this.x.add(v.vec.x);
		  p.y=this.y.add(v.vec.y);
		  p.z=this.z.add(v.vec.z);
		  
		  return p;
		  
		
	}
	
	 public double auCarre(Point3D B)
	{
		double b=this.distance(B);
		return uscale(b,b);
		
	}
	

	 public double distance(Point3D B)
	{	 
		Vector v = B.substract(this);
		
        v.vec.x=v.vec.x.multiply(v.vec.x);
		v.vec.y=v.vec.y.multiply(v.vec.y);
		v.vec.z=v.vec.z.multiply(v.vec.z);
		
		double a=Math.sqrt(v.vec.x._coord+v.vec.y._coord+v.vec.z._coord);
		
		return a;
		
	}
	 

	

}