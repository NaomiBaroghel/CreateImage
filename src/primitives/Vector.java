package primitives;

import static primitives.Util.*;

public class Vector {


Point3D vec;


public Vector(double v1, double v2, double v3) {
	try
	{
		this.vec = new Point3D(v1,v2,v3);
		}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
		}
}


public Vector()

{
	this.vec= new Point3D();

}


public Point3D getVec() {
	return new Point3D(vec.getX().get(), vec.getY().get(), vec.getZ().get());
}


public void setVec(Point3D vec) {
	this.vec = new Point3D(vec.getX().get(),vec.getY().get(),vec.getZ().get());
}

public String toString() {
	
	return "Vector [vec=" + vec + "]";
}


public boolean equals(Vector v)

{
	if((this.getVec().getX().get()==v.getVec().getX().get())&&(this.getVec().getY().get()==v.getVec().getY().get())&&(this.getVec().getZ().get()==v.getVec().getZ().get()))
		return true;
	return false;

}


public Vector addVector(Vector v)throws Exception

{
	Vector f=new Vector();
	f.vec.x=this.vec.x.add(v.vec.x);
	f.vec.y=this.vec.y.add(v.vec.y);
	f.vec.z=this.vec.z.add(v.vec.z);

	
	if (isZero(f.vec.x._coord) && isZero(f.vec.y._coord) && isZero(f.vec.z._coord))
		throw new Exception ("the vector must be different than 0");
	
	return f;

}

public Vector substractVector(Vector v)throws Exception

{
	Vector f=new Vector();
	f.vec.x=this.vec.x.subtract(v.vec.x);
	f.vec.y=this.vec.y.subtract(v.vec.y);
	f.vec.z=this.vec.z.subtract(v.vec.z);

	if (isZero(f.vec.x._coord) && isZero(f.vec.y._coord) && isZero(f.vec.z._coord))
		throw new Exception ("the vector must be different than 0");
	
	return f;

}

public Vector multScalar(double a)throws Exception

{
	Vector f= new Vector();
	f.vec.x=this.vec.x.scale(a);
	//System.out.println("x="+f.vec.x);
	f.vec.y=this.vec.y.scale(a);
	//System.out.println("y="+f.vec.y);
	f.vec.z=this.vec.z.scale(a);
	//System.out.println("z="+f.vec.z);


	if (isZero(f.vec.x._coord) && isZero(f.vec.y._coord) && isZero(f.vec.z._coord))
	{
		System.out.println("double="+a+"thisx="+this.vec.x+"thisy="+this.vec.y+"thisz="+this.vec.z+"x="+f.vec.x+"y="+f.vec.y+"z="+f.vec.z);

        	throw new Exception ("the vector must be different than 0");
	}
	return f;

}

public double dotProduct(Vector v)

{   Point3D p = new Point3D();
    p.x=this.vec.x.multiply(v.vec.x);
    p.y=this.vec.y.multiply(v.vec.y);
    p.z=this.vec.z.multiply(v.vec.z);

	return p.x._coord+p.y._coord+p.z._coord;
	
		
}

public Vector crossProduct(Vector v1)throws Exception

{
	Vector f= new Vector();
	f.vec.x = (this.vec.y.multiply(v1.vec.z)).subtract(this.vec.z.multiply(v1.vec.y));
	f.vec.y= (this.vec.z.multiply(v1.vec.x)).subtract(this.vec.x.multiply(v1.vec.z));
	f.vec.z= (this.vec.x.multiply(v1.vec.y)).subtract(this.vec.y.multiply(v1.vec.x));
	
	if (isZero(f.vec.x._coord) && isZero(f.vec.y._coord) && isZero(f.vec.z._coord))
		throw new Exception ("the vector must be different than 0");
	return f;

}

public double lenghtVector()

{
	Point3D point=new Point3D();
	double lenght=this.vec.distance(point);
	return lenght;

}

public Vector normalisatsiaVector()throws Exception

{
	double lenght=this.lenghtVector();
	this.vec.x._coord=this.vec.x._coord/lenght;
	this.vec.y._coord=this.vec.y._coord/lenght;
	this.vec.z._coord=this.vec.z._coord/lenght;
		
	if (isZero(this.vec.x._coord) && isZero(this.vec.y._coord) && isZero(this.vec.z._coord))
		throw new Exception ("the vector must be different than 0");
	return this;

}

}

