package elements;

import primitives.*;


public class Camera {
	Point3D Makom;
	Vector VRight;
	Vector VUp;
	Vector VTo;
	
	public Camera () throws Exception
	{
		this.Makom = new Point3D();
		this.VUp = new Vector(1,0,0);
		this.VTo = new Vector(0,0,-1);
		this.VRight=VUp.crossProduct(VTo).normalisatsiaVector();
	}
	public Camera(Point3D P0, Vector VU, Vector VT) throws Exception
	{
		this.Makom=P0;
		this.VUp=VU.normalisatsiaVector();
		this.VTo=VT.normalisatsiaVector();
		
		this.VRight=VU.crossProduct(VT).normalisatsiaVector(); 
	}
	public Point3D getMakom() {
		return new Point3D(Makom.getX().get(),Makom.getY().get(), Makom.getZ().get());
	}
	public Vector getVRight() {
		return new Vector (VRight.getVec().getX().get(),VRight.getVec().getY().get(), VRight.getVec().getZ().get());
	}
	public Vector getVUp() {
		return new Vector (VUp.getVec().getX().get(),VUp.getVec().getY().get(), VUp.getVec().getZ().get());
	}
	public Vector getVTo() {
		return new Vector (VTo.getVec().getX().get(),VTo.getVec().getY().get(), VTo.getVec().getZ().get());
	}
	
	public Ray constructRayThroughPixel(int Nx, int Ny, int i, int j, double screenDistance, double screenWidth, double screenHeight) throws Exception //return Ray
	{
		if(screenWidth ==0 || screenHeight == 0)
		{
			throw new Exception("Width or Height can't be 0");
		}
		
		Point3D PC = this.Makom.addVectorToPoint(this.VTo.multScalar(screenDistance));
		double Rx = screenWidth/Nx;
		double Ry = screenHeight/Ny;
	
		
		double h1 = i-Nx/2.0;
		h1 = h1*Rx;
		h1 = h1-Rx/2.0;

		double h2 = j-Ny/2.0;
		h2 = h2*Ry;
		h2 = h2 - Ry/2.0;
		
		
		if(h1==0 && h2==0)
		{
			Point3D PN = PC;
			Vector VN = (PN.substract(this.Makom)).normalisatsiaVector();
			return new Ray(this.Makom, VN);
		}
		
		if(h1==0 && h2!=0)
		{
			Vector Help2 = this.VUp.multScalar(h2);
			 Help2 = this.VUp.multScalar(-1);
			Point3D PN = PC.addVectorToPoint(Help2);
			Vector VN = (PN.substract(this.Makom)).normalisatsiaVector();
			return new Ray(this.Makom, VN);
		}
		
		if(h1!=0 && h2==0)
		{
			Vector Help1 = this.VRight.multScalar(h1);
			Point3D PN = PC.addVectorToPoint(Help1);
			Vector VN = (PN.substract(this.Makom)).normalisatsiaVector();
			return new Ray(this.Makom, VN);
		}
		
		
		Vector Help1 = this.VRight.multScalar(h1);
		Vector Help2 = this.VUp.multScalar(h2);
		Vector Help3 = Help1.substractVector(Help2);
		Point3D PN = PC.addVectorToPoint(Help3);
		Vector VN = (PN.substract(this.Makom)).normalisatsiaVector();
		
		
		return new Ray(this.Makom, VN);
	
}

}
