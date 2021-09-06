package primitives;

public class PrimT {
	
			public static void main(String [] args) throws Exception{
				/*int x=2;
				int y=5;
				System.out.println(x+y);
				
				Coordinate y1= new Coordinate(6);
				Coordinate y2= new Coordinate(3);
				Coordinate y3= new Coordinate(4);
				
				Coordinate y4= new Coordinate(0);
				Coordinate y5= new Coordinate(-4);
				Coordinate y6= new Coordinate(1);

				System.out.println(y4.toString());

				Point3D x1= new Point3D(y1,y2,y3);
				Point3D x2= new Point3D(y4,y5,y6);
				
				System.out.println(x1.equals(x2));
				System.out.println(x1.distance(x2));
				System.out.println(x1.auCarre(x2));

				
				Vector l = new Vector (x2);
				
				Vector l2 = new Vector(x1);
				
				Vector l3= l.addVector(l2);
				
				System.out.println(l3.toString());

				System.out.println(l3.equals(l));
				
			//	Vector l4 = new Vector();
				
			//	l4.multScalar(5);
				
				Coordinate y8= new Coordinate(6);
				Coordinate y9= new Coordinate(3);
				Coordinate y10= new Coordinate(4);
				
				
				Point3D PN = new Point3D(y8,y9,y10);
				Vector l5 = new Vector(PN);
				System.out.println(l5.toString());
				System.out.println(l5.lenghtVector());

				l5.normalisatsiaVector();

				System.out.println(l5.toString());
				System.out.println(l5.lenghtVector());

/*
				Coordinate x67 = new Coordinate (3.5);
				Coordinate y67 = new Coordinate (-5);
				Coordinate z= new Coordinate (10);
				
				Point3D T = new Point3D(x67,y67,z);
				Vector v = new Vector(T);
				
				v.normalisatsiaVector();
				System.out.println(v.lenghtVector());*/

				
			//	Vector V = PC.substract(this.RT.getPR()).substractVector(RT.getVR().multScalar(RT.getVR().dotProduct(PC.substract(this.RT.getPR()))));
				 
			//	V.normalisatsiaVector();
				
				
				Vector V1 = new Vector(1,1,1);
				Vector V2 = new Vector(2,0,-2);
			//	Vector V3 = V2.vec.substract(V1.vec);
			//	V3.normalisatsiaVector();
				Vector V3 = V1.crossProduct(V2);
			System.out.println(V3.toString());

				//System.out.println(V3.toString());
				
				
			}
		

		
		
		
	}


