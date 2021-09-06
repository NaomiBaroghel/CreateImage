package primitives;

public class Ray {
	
	public Point3D PR;
	public Vector VR;
	
	public Ray(Point3D MP, Vector mv) {
		this.PR = MP;
		this.VR = mv;
	}
	
	public Ray() {
		
		this.PR=new Point3D();
		this.VR.vec = new Point3D();;
	}
	

	
	public void setPoint(Point3D MP, Vector V) {
		this.VR = new Vector(V.getVec().getX().get(), V.getVec().getY().get(),V.getVec().getZ().get());
		this.PR = new Point3D(MP.getX().get(),MP.getY().get(),MP.getZ().get());
	}
	
	public Point3D getPR() {
		return new Point3D(PR.getX().get(), PR.getY().get(),PR.getZ().get());
	}
	
	public Vector getVR() {
		return new Vector (VR.vec.getX().get(),VR.vec.getY().get(),VR.vec.getZ().get());
	}
	
	public void setV(Vector mv) {
		this.VR = new Vector(mv.getVec().getX().get(),mv.getVec().getY().get(),mv.getVec().getZ().get());
	}
	
  
	
	public String toString() {
		return "Ray [point=" + PR + ", v=" + VR + "]";
	}
	
	public boolean equals(Ray r)
	{
		
		return ((this.PR==r.PR)&&(this.VR==r.VR));
		
	}
		
	

}
