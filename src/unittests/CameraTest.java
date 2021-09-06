package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import primitives.*;
import elements.*;
import java.math.*;

public class CameraTest // implements Comparable<BigDecimal>
{

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void TestRayConstructor () throws Exception
	{
		//Point 3,3
		Camera CT = new Camera(new Point3D(), new Vector (0,1,0), new Vector (0,0,-1));
		//VRight(1,0,0)
		Ray RCT1 = CT.constructRayThroughPixel(3, 3, 3, 3, 100, 150, 150);
		//Rx=50, Ry=50
	//	double a = Math.sqrt(6)/6;
	//	a= -Math.sqrt(6)/6;
		//a= -Math.sqrt(6)/3;
		Ray RCT2 = new Ray (new Point3D(), new Vector(50,-50,-100));
		
		assertTrue(RCT1.getPR().equals(RCT2.getPR()));
		System.out.println(RCT1.toString());
		System.out.println(RCT2.toString());
	    System.out.println(RCT1.VR.equals(RCT2.VR.normalisatsiaVector()));		

	    assertTrue(RCT1.getVR().equals(RCT2.getVR().normalisatsiaVector()));
	    
	    
	    //point 1,1
	    CT = new Camera(new Point3D(), new Vector (0,1,0), new Vector (0,0,-1));
		//VRight(1,0,0)
		 RCT1 = CT.constructRayThroughPixel(3, 3, 1, 1, 100, 150, 150);
		//Rx=50, Ry=50
	
		 RCT2 = new Ray (new Point3D(), new Vector(-50,50,-100));
		
		assertTrue(RCT1.getPR().equals(RCT2.getPR()));
		RCT2.VR.normalisatsiaVector();
		

	    assertTrue(RCT1.getVR().equals(RCT2.getVR()));
	
	    
	    
	    //point 2,2 au milieu //Probleme avec le vector 0 et les throws
	     CT = new Camera(new Point3D(), new Vector (0,1,0), new Vector (0,0,-1));
		//VRight(1,0,0)
		 RCT1 = CT.constructRayThroughPixel(3, 3, 2, 2, 100, 150, 150);
	
		 RCT2 = new Ray (new Point3D(), new Vector(0,0,-100));
		
		assertTrue(RCT1.getPR().equals(RCT2.getPR()));
		

	    assertTrue(RCT1.getVR().equals(RCT2.getVR().normalisatsiaVector()));
	
	}
	
	// faire un test pour une plane view de 4x4
	// aussi un test lorsqu'on change l'emplacement de la camera : est qu'il y a tjrs le vector 0 ?
	// il y en a plein d'autres à faire, voir la matseget 4

}
