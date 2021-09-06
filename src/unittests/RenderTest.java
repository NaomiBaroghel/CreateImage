package unittests;

import static org.junit.Assert.*;



import org.junit.Test;
//import java.awt.Color;

import elements.*;
import geometries.*;
import primitives.*;
import renderer.ImageWriter;
import renderer.Render;
import scene.Scene;

public class RenderTest {
//	@Test
//	public void basicRendering() throws Exception
//	{
//		Scene scene = new Scene("Test scene");
//		scene.setCamera(new Camera(new Point3D(0, 0, 0), new Vector(0, -1, 0), new Vector(0, 0, 1)));
//		scene.setDistance(100);
//		scene.setBackground(new Color(0, 0, 0));
//	//	scene.addGeometries(new Sphere(new Color(), 0, new Point3D(0, 0, 0)));
//		/*Color c  = new Color(100, 100,100);
//		double r = 50;
//		Point3D P0 = new Point3D(0, 0, 150);
//		Sphere S = new Sphere(c , r, P0);*/
//		scene.addGeometries(new Sphere(new Color(64,64,64),400, new Point3D(0,0,600)));
//
//		scene.addGeometries(new Triangle(new Color(0, 0,255 ), new Point3D(500, -150, 150),
//				 							new Point3D(-150, 500, 149),
//				 							new Point3D(500, 500, 149)));
//
//		scene.addGeometries(new Triangle(new Color(64, 64,64 ), new Point3D(500, 150, 150),
//				 			 				new Point3D( -150, -500, 149),
//				 			 				new Point3D( 500,-500, 149)));
//
//		scene.addGeometries(new Triangle(new Color(255, 0,0 ), new Point3D(-500, -150, 150),
//				 							new Point3D( 150, 500, 149),
//				 							new Point3D(-500, 500, 149)));
//
//		scene.addGeometries(new Triangle(new Color(0, 255,0 ), new Point3D(-500, 150, 150),
//				 			 				new Point3D(150,  -500, 149),
//				 			 				new Point3D(-500, -500, 149)));
//
//		ImageWriter imageWriter = new ImageWriter("tit0", 500, 500, 500, 500);
//		Render render = new Render(imageWriter, scene);
//
//	//	scene.getGeometries();
//		render.renderImage();
//		render.PrintGrid(50,new Color(255,255,255));
//		render.get_imageWriter().writeToimage();
//	}
//	
//	
//	@Test
//	public void testAddingLightSources() throws Exception
//	{
//		
//		PointLight pl = new PointLight(new Color(255,100,100), new Point3D(-200, -200, -100), 0, 0.000001, 0.0000005);
//		SpotLight sl = new SpotLight(new Color(255, 100, 100),  new Vector(), new Point3D(-200, -200, -100), 0, 0.00001, 0.000005);
//		
//		DirectionalLight dl = new DirectionalLight(new Color(255, 100, 100),new Vector());
//		
//	}

//	
//	@Test
//	public void pointLightTest1() throws Exception
//	{
//		
//		Scene scene = new Scene("Test1");
//		Sphere sphere = new Sphere (new Color(0,0,100),800, new Point3D(0,0,-1000));
//		Material m=new Material();
//		m.setShininess(18);
//		sphere.SetMaterial(m);
//		scene.addGeometries(sphere);
//		scene.addLight(new PointLight(new Color(255,100,100), new Point3D(-200, -200,-100),0, 0.00001, 0.000005));
//
//	
//		ImageWriter imageWriter = new ImageWriter("totoTS", 500, 500, 500, 500);
//		
//		Render render = new Render(imageWriter,scene);
//		
//		render.renderImage();
//	//	render.PrintGrid(50,new Color(255,255,255));
//		render.get_imageWriter().writeToimage();			
//	}
		

//		@Test
//		public void pointLightTest2()throws Exception
//		{
//			Scene scene = new Scene("Test2");
//			//scene.setDistance(200);
//			Sphere sphere = new Sphere (new Color(0,0,100),80, new Point3D(0,0, -1000));
//			//Material m=new Material(0.1,0.3,20);
//			Material m = new Material();
//			m.setShininess(20);
//			sphere.SetMaterial(m);
//			
//		
//			Triangle triangle = new Triangle(new Color(0,0,0), new Point3D(3500, 3500, -2000),
//					new Point3D( -3500, -3500, -1000),  
//					new Point3D(3500, -3500, -2000) );
//			Triangle triangle2 = new Triangle(new Color(0,0,0), new Point3D(3500, 3500, -2000),
//					new Point3D(  -3500, 3500, -1000), 
//					new Point3D( -3500, -3500, -1000));
//			Triangle triangle3 = new Triangle(new Color(0, 0,0), 
//					new Point3D(500, -150, 150),new Point3D(-150, 500, 149),
//					new Point3D(500, 500, 149));
//			triangle.SetMaterial(m);
//			triangle2.SetMaterial(m);
//			triangle3.SetMaterial(m);
//			
//			scene.addGeometries(sphere);
//			scene.addGeometries(triangle);
//			scene.addGeometries(triangle2);
//			//scene.addGeometries(triangle3);
//
//			
//			scene.addLight(new PointLight(new Color(255,100,100), new Point3D(-200,200, -100),0, 0.000001, 0.0000005));
//
//			
//			ImageWriter imageWriter = new ImageWriter("PointTest2TKSS", 500, 500, 500, 500);
//			Render render = new Render(imageWriter,scene);
//			
//			render.renderImage();
//			//render.PrintGrid(50, new Color(255,255,255));
//			render.get_imageWriter().writeToimage();			
//		}
		
		
//
	//	@Test
//		public void spotLightTest1() throws Exception
//		{
//			
//			Scene scene = new Scene();
//			Sphere sphere = new Sphere (new Color(255,0,50),800, new Point3D(0,0, -1000));
//			
//			
//			Material m=new Material();
//			m.setShininess(20);
//			sphere.SetMaterial(m);
//			scene.addGeometries(sphere);
//					
//			scene.addLight(new SpotLight(new Color(0, 100, 100), new Vector(2, 2, -3), new Point3D(-200, -200, -100), 0, 0.00001, 0.000005));
//		
//			ImageWriter imageWriter = new ImageWriter("ST1S", 500, 500, 500, 500);
//			
//			Render render = new Render(imageWriter,scene);
//			
//			render.renderImage();
//		//	render.PrintGrid(50);
//			render.get_imageWriter().writeToimage();
//			}

//		@Test
//		public void spotLightTestTT() throws Exception
//		{
//			
//			Scene scene = new Scene();
//			scene.setDistance(200);
//			Sphere sphere = new Sphere (new Color(0,0,100),500, new Point3D(0,0, -1000));
//			
//			
//			Material m=new Material();
//			m.setShininess(20);
//			sphere.SetMaterial(m);
//			scene.addGeometries(sphere);
//			
//			Triangle triangle = new Triangle(new Color (0, 0, 100),
//					 new Point3D(-125, -225, -260),
//					 new Point3D(-225, -125, -260),
//					 new Point3D(-225, -225, -270)
//				);
//			Material m1=new Material();
//			m1.setShininess(4);
//			triangle.SetMaterial(m);
//			scene.addGeometries(triangle);
//			
//			scene.getGeometries();
//			scene.addLight(new SpotLight(new Color(0, 100, 100), new Vector(2, 2, -3), new Point3D(-200, -200, -100), 0, 0.00001, 0.000005));
//		
//			ImageWriter imageWriter = new ImageWriter("ST22", 500, 500, 500, 500);
//			
//			Render render = new Render(imageWriter,scene);
//			
//			render.renderImage();
//		//	render.PrintGrid(50);
//			render.get_imageWriter().writeToimage();
//			}
//		
//		@Test
//		public void spotLightTest2() throws Exception
//		{
//			
//			Scene scene = new Scene();
//			scene.setDistance(200);
//			
//			Sphere sphere = new Sphere (new Color(0,0,100),500, new Point3D(0,0,-1000));
//			
//			Material m=new Material();
//			m.setShininess(20);
//			sphere.SetMaterial(m);
//			scene.addGeometries(sphere);
//			
//			Triangle triangle = new Triangle(new Color (0, 0, 100),
//											 new Point3D(-125, -225, -260),
//											 new Point3D(-225, -125, -260),
//											 new Point3D(-225, -225, -270)
//										);
//			
//			Material m1=new Material();
//			m1.setShininess(4);
//			triangle.SetMaterial(m);
//			scene.addGeometries(triangle);
//		
//			scene.addLight(new SpotLight(new Color(255, 100, 100),  new Vector(2, 2, -3), new Point3D(-200, -200, -100), 
//						  0.1, 0.00001, 0.000005));
//		
//			ImageWriter imageWriter = new ImageWriter("ST22BT2SSJJJJJ", 500, 500, 500, 500);
//			
//			Render render = new Render(imageWriter,scene);
//			
//			render.renderImage();
//		//	render.printGrid(50);
//		    render.get_imageWriter().writeToimage();//		
//		    
//		}

//		@Test
//		public void spotLightTest3() throws Exception
//		{
//			
//			
//			Scene scene = new Scene();
//			Material m = new Material();
//		//	scene.setDistance(50);
//			
//			Triangle triangle = new Triangle(new Color(0,0,0),
//											 new Point3D(  3500,  3500, -2000),
//					 						 new Point3D( -3500, -3500, -1000),
//					 						 new Point3D(  3500, -3500, -2000)
//					 						 );
//
//			triangle.SetMaterial(m);
//			
//			Triangle triangle2 = new Triangle(new Color(0,0,0),
//											  new Point3D(  3500,  3500, -2000),
//					  						  new Point3D( -3500,  3500, -1000),
//					  						  new Point3D( -3500, -3500, -1000)
//						 						);
//			triangle2.SetMaterial(m);
//		
//			scene.addGeometries(triangle);
//			scene.addGeometries(triangle2);
//
//		scene.addLight(new SpotLight(new Color(255, 100, 100), new Vector(-2, -2, -3), new Point3D(400, 100, -100), 0, 0.000001, 0.0000005));
//		
//			
//			ImageWriter imageWriter = new ImageWriter("F33", 500, 500, 500, 500);
//			
//			Render render = new Render(imageWriter,scene);
//			
//			render.renderImage();
//		//	render.printGrid(50);
//		render.get_imageWriter().writeToimage();//			
//		}
		


		
	
	
//	@Test
//	 public void testPart3_01() throws Exception
//	{
//        Scene scene = new Scene();
//      //scene.getCamera().setP0(new Point3D(0, 0, 0));
//        scene.setDistance(150);
//        
////        Material material = new Material(0.55, 0.1, 0.6,0.4,20);
////        Material m = new Material(0.1, 0.4, 0.2,1,16);
//        
//        Material material = new Material(0.7, 0.6, 0.1,0.1,20);
//        Material m = new Material(0.1, 0.1, 0.1,0.0000001,16);
//
//
//
//        Sphere sphere = new Sphere(new Color(10, 100, 20), 50, new Point3D(-50, -100, -150));
//        Sphere sphere1 = new Sphere(new Color(110, 20, 10),70,new Point3D(-30, 0, -250));
//        Sphere sphere2 = new Sphere(new Color(20, 20, 100),90,new Point3D(-10, 150, -350));
//        Plane plane = new Plane(new Color(133, 133, 133), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//
//        
//
//        sphere.SetMaterial(material);
//        sphere1.SetMaterial(material);
//        sphere2.SetMaterial(material);
//        plane.SetMaterial(m);
//
//
//        scene.addGeometries(sphere);
//      scene.addGeometries(sphere1);
//      scene.addGeometries(sphere2);
//        scene.addGeometries(plane);
//
//
//
//
//        scene.addLight(new PointLight(new Color(130, 100, 130), new Point3D(150, 150, -50), 0, 0.00001, 0));
//        //scene.addLight(new PointLight(new Color(110, 130, 30), new Point3D(150, 150, -50), 0, 0.00001, 0.000005));
//       // scene.addLight(new PointLight(new Color(90, 30, 130), new Point3D(150, -150, -50), 0, 0.00001, 0.000005));
//
//
//        ImageWriter imageWriter = new ImageWriter("testPart3_TTTTC", 500, 500, 500, 500);
//
//        Render render = new Render(imageWriter, scene);
//
//        render.renderImage();
//        render.get_imageWriter().writeToimage();
//    }
	
	
//	@Test
//	public void recursiveTest3() throws Exception
//	{
//		
//		Scene scene = new Scene();
//		scene.setDistance(300);
//		
//		Sphere sphere = new Sphere(new Color(0, 0, 100), 300, new Point3D(0, 0, -1000));
//		Material sphere1Mat = new Material();
//		sphere1Mat.setkT(0.5);
//		sphere1Mat.setShininess(20);
//		sphere.SetMaterial(sphere1Mat);
//		
//		
//		
//		scene.addGeometries(sphere);
//		
//		Sphere sphere2 = new Sphere(new Color(100, 20, 20), 150, new Point3D(0, 0, -1000));
//		
//		
//		Material sphereMat = new Material();
//		sphereMat.setkT(0);
//		sphereMat.setShininess(20);
//		sphere2.SetMaterial(sphereMat);
//	
//		scene.addGeometries(sphere2);
//		
//		Triangle triangle = new Triangle(new Color(20, 20, 20),
//				new Point3D(  2000, -1000, -1500),
//				 						 new Point3D( -1000,  2000, -1500),
//				 						 new Point3D(  700,  700, -375));
//		
//		Triangle triangle2 = new Triangle(new Color(20, 20, 20), new Point3D(  2000, -1000, -1500),
//										  new Point3D( -1000,  2000, -1500),
//										  new Point3D( -1000, -1000, -1500));
//		
//		Material m1 = new Material();
//		Material m2 = new Material();
//		m1.setkR(1);
//		m2.setkR(0.5);
//		triangle.SetMaterial(m1);
//		triangle2.SetMaterial(m2);
//		
//		
//	//	scene.addGeometries(triangle);
//		scene.addGeometries(triangle2);
//
//		scene.addLight(new SpotLight(new Color(255, 100, 100), new Vector(-2, -2, -3), new Point3D(200, 200, -150), 0, 0.00001, 0.000005));
//	
//		ImageWriter imageWriter = new ImageWriter("RT3", 500, 500, 500, 500);
//		
//		Render render = new Render(imageWriter,scene);
//		
//		render.renderImage();
//		render.get_imageWriter().writeToimage();		
//	}
//
//	@Test
//	public void testPart3_02() throws Exception
//	{
//        Scene scene = new Scene();
//   //     scene.getCamera().setP0(new Point3D(0, 0, 0));
//        scene.setDistance(150);
//
//        Material material = new Material(0.4, 0.35, 0.1, 0.6,20);
//
//        Sphere sphere = new Sphere(new Color(10, 100, 20),50, new Point3D(-50, -100, -150));
//        sphere.SetMaterial(material);
//        scene.addGeometries(sphere);
//
//        Sphere sphere1 = new Sphere(new Color(110, 20, 10),70,new Point3D(-30, 0, -250));
//        sphere1.SetMaterial(material);
//        scene.addGeometries(sphere1);
//
//        Sphere sphere2 = new Sphere(new Color(20, 20, 100),90,new Point3D(-10, 150, -350) );
//        sphere2.SetMaterial(material);
//        scene.addGeometries(sphere2);
//
//        Plane plane = new Plane(new Color(133, 133, 133), new Point3D(-100, 0 , 0),new Vector(1,0,0));
//        Material mp = new Material(15, 0.1, 0.4, 0.2,1);
//        plane.SetMaterial(mp);
//        scene.addGeometries(plane);
//
////        scene.addLight(new SpotLight(new Color(130, 100, 130), new Point3D(150, 150, -50), //right light
////                pSphere.vector(new Point3D(300, 0, -250)), 0, 0.00001, 0.000005));
////        scene.addLight(new SpotLight(new Color(110, 130, 30), new Point3D(150, 150, -50), //right light
////               pSphere1.vector(new Point3D(300, 0, -250)), 0, 0.00001, 0.00005));
//        scene.addLight(new SpotLight(new Color(90, 30, 130), new Vector(300, 0, -250),new Point3D(150, 150, -50), 0, 0.00001, 0.00005));
//
//        ImageWriter imageWriter = new ImageWriter("testPart3_02", 500, 500, 500, 500);
//
//        Render render = new Render(imageWriter, scene);
//
//        render.renderImage();
//		render.get_imageWriter().writeToimage();		
//    }

	
//	@Test
//	public void testPart3_03() throws Exception
//	{
//        Scene scene = new Scene();
//        scene.setDistance(200);
//
//        Material material = new Material(0.4, 0.35, 0.1, 0.6,20);
//
//        Sphere sphere = new Sphere(new Color(0, 0, 100),80, new Point3D(0, 0, -250));
//        sphere.SetMaterial(material);
//        scene.addGeometries(sphere);
//
//        Triangle triangle = new Triangle(new Color(0, 50, 0),new Point3D(0, 0, -450), //green triangle
//                new Point3D(-2000, 0, -500),
//                new Point3D(0, -4000, -500));
//        triangle.SetMaterial(material);
//        scene.addGeometries(triangle);
//
//        Triangle triangle1 = new Triangle(new Color(80, 0, 0),new Point3D(100, 100, -100), //red triangle
//                new Point3D(90, 200, -90),
//                new Point3D(-50, 100, -100));
//        triangle1.SetMaterial(material);
//
//        scene.addGeometries(triangle1);
//
//        Triangle triangle2 = new Triangle(new Color(33, 33, 33),new Point3D(-2000, -2000, -2000), //gray triangle
//                new Point3D(-2000, 500, -2000),
//                new Point3D(1500, 800, -800));
//        triangle2.SetMaterial(material);
//
//        scene.addGeometries(triangle2);
//
//        scene.addLight(new SpotLight(new Color(100, 80, 0), new Point3D(0, 0, -100).substract(new Point3D(50, 0, 0)), new Point3D(150, 150, -50), //right light
//                0, 0.000001, 0.0000005));
//
//        Vector V = (new Vector(-0.2, -0.6, -1)).normalisatsiaVector();
//        scene.addLight(new SpotLight(new Color(220, 230, 60), V,new Point3D(0, 0, -350), //light behind the sphere
//                 0, 0.00001, 0.00005));
//
//        ImageWriter imageWriter = new ImageWriter("testPart3_03T", 500, 500, 500, 500);
//
//        Render render = new Render(imageWriter, scene);
//
//        render.renderImage();
//		render.get_imageWriter().writeToimage();		
//    }

	
//	@Test
//	public void MyTestRefracted() throws Exception
//	{
//		
//		Scene scene = new Scene();
//		scene.setDistance(800);
//		
//		Sphere sphere = new Sphere(new Color(0, 0, 100), 80, new Point3D(20, 0, -1000));
//		Sphere sphere2 = new Sphere(new Color(0, 100, 0), 150, new Point3D(50, 150, -800));
//
//		Material Mat = new Material(0.4, 0.35, 0.1, 0.1,20);
//		Material MatP = new Material(0.4, 0.35, 0.1, 0,20);
//
//		Material Mat2 = new Material(0.4, 0.35, 0.1, 0.1,20);
//
//		
//		sphere.SetMaterial(Mat);
//		scene.addGeometries(sphere);
//		
//		sphere2.SetMaterial(Mat2);
//		scene.addGeometries(sphere2);
//
//
//		
//      Plane plane = new Plane(new Color(133, 133, 133), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//
//		plane.SetMaterial(MatP);
//
//		scene.addGeometries(plane);
//
//      scene.addLight(new PointLight(new Color(130, 100, 130), new Point3D(150, 150, -50), 0, 0.00001, 0.000005));
//
//		
//		        ImageWriter imageWriter = new ImageWriter("MTR_01", 500, 500, 500, 500);
//		
//		        Render render = new Render(imageWriter, scene);
//		
//		        render.renderImage();
//				render.get_imageWriter().writeToimage();
//	
//		
//	}
//	
//	@Test
//	public void MyTestTransparency() throws Exception
//	{
//		
//		Scene scene = new Scene();
//		scene.setDistance(800);
//		
//		Sphere sphere = new Sphere(new Color(0, 0, 100), 80, new Point3D(20, 0, -1000));
//		Sphere sphere2 = new Sphere(new Color(0, 100, 0), 150, new Point3D(20, 0, -1000));
//
//		Material Mat = new Material(0.4, 0.35, 0.1, 0,20);
//		Material Mat2 = new Material(0.4, 0.35, 0.1, 0.7,20);
//		Material MatP = new Material(0.4, 0.35, 0.1, 0,20);
//
//
//		
//		sphere.SetMaterial(Mat);
//		scene.addGeometries(sphere);
//		
//		sphere2.SetMaterial(Mat2);
//		scene.addGeometries(sphere2);
//
//
//		
//      Plane plane = new Plane(new Color(100, 100, 100), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//
//		plane.SetMaterial(MatP);
//
//		scene.addGeometries(plane);
//
//      scene.addLight(new PointLight(new Color(0, 0, 100), new Point3D(150, 150, -50), 0, 0.00001, 0.00000));
//
//		
//		        ImageWriter imageWriter = new ImageWriter("MTT_02", 500, 500, 500, 500);
//		
//		        Render render = new Render(imageWriter, scene);
//		
//		        render.renderImage();
//				render.get_imageWriter().writeToimage();
//	
//		
//	}
	
//	@Test
//	public void MyTestMiroire() throws Exception
//	{
//		
//		Scene scene = new Scene();
//		scene.setDistance(800);
//		
//		Sphere sphere = new Sphere(new Color(0, 0, 100), 80, new Point3D(20, 0, -1000));
//		Sphere sphere2 = new Sphere(new Color(0, 100, 0), 150, new Point3D(50, 150, -800));
//
//		Material Mat = new Material(0.4, 0.35, 0.1, 0,20);
//		Material MatP = new Material(0.4, 0.35, 1, 0,20);
//
//		Material Mat2 = new Material(0.4, 0.35, 0.1, 0,20);
//
//		
//		sphere.SetMaterial(Mat);
//		scene.addGeometries(sphere);
//		
//		sphere2.SetMaterial(Mat2);
//		scene.addGeometries(sphere2);
//
//
//		
//      Plane plane = new Plane(new Color(133, 133, 133), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//
//		plane.SetMaterial(MatP);
//
//		scene.addGeometries(plane);
//
//      scene.addLight(new PointLight(new Color(130, 100, 130), new Point3D(150, 150, -50), 0, 0.00001, 0));
//
//		
//		        ImageWriter imageWriter = new ImageWriter("MTM_01", 500, 500, 500, 500);
//		
//		        Render render = new Render(imageWriter, scene);
//		
//		        render.renderImage();
//				render.get_imageWriter().writeToimage();
//	
//		
//	}
	
	
//	@Test
//	public void OurProject() throws Exception
//	{
//		Scene scene = new Scene();
//		scene.setDistance(500);
//        ImageWriter imageWriter = new ImageWriter("PROJET3", 500, 500, 500, 500);
//        Render render = new Render(imageWriter, scene);
//
//
//		
//		
//		Sphere sphere = new Sphere(new Color(0, 0, 200), 80, new Point3D(20, 0, -1000));
//		Sphere sphere2 = new Sphere(new Color(0, 200, 0), 80, new Point3D(50, 150, -500));
//		Sphere sphere3 = new Sphere(new Color(200, 0, 0), 80, new Point3D(50, 50, -350));
//		Sphere lune = new Sphere(new Color(255,255, 255), 100, new Point3D(500, 200, -700));
//		Sphere ombrelune = new Sphere(render.get_scene().getBackground(), 100, new Point3D(500, 250, -650));
//
//
//		Material Mat = new Material(0.4, 0.35, 0.6, 0,20);
//		Material Matsphere= new Material(0, 0, 0, 0,20);
//		
//		
//		sphere.SetMaterial(Mat);
//		sphere2.SetMaterial(Mat);
//		sphere3.SetMaterial(Mat);
//		lune.SetMaterial(Matsphere);
//		scene.addGeometries(lune);
//		ombrelune.SetMaterial(Matsphere);
//        scene.addGeometries(ombrelune);
//		//scene.addGeometries(sphere3);
//		//scene.addGeometries(sphere);
//		//scene.addGeometries(sphere2);
//		
//		
//		
//		Plane eau = new Plane(new Color(0, 51, 102), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//		Material MatP = new Material(0.4, 0.35, 0.7, 0,20);
//		Material T= new Material(0.1,0.2,0.1,0.6,19);
//		// bateau  
////		Triangle bateau = new Triangle(new Color (200, 0, 0),new Point3D(-200, -500, 0),
////					new Point3D(0, -500, 0),
////					new Point3D(0, -200, 10));
//		
//		Triangle triangle = new Triangle(new Color (200, 0, 0),new Point3D(100, -500, 0),
//				new Point3D(0, -500, 0),
//				new Point3D(0, -200, 10));
//
//		Triangle test=new Triangle(new Color(255, 0,0 ), new Point3D(0, 0, -1000),
//					new Point3D( 0, 1000, -1000),
//					new Point3D(-99, 400, -20));
//		test.SetMaterial(T);
//		scene.addGeometries(test);
//					
//		eau.SetMaterial(MatP);
//		
//		triangle.SetMaterial(T);
//		
//		//scene.addGeometries(triangle);
//
//		scene.addGeometries(eau);
//		
//		 scene.addLight(new PointLight(new Color(130, 100, 130), new Point3D(150, 0, -1000), 0, 0.00001, 0.000005));
//		// scene.addLight(new SpotLight(new Color(100, 100, 100),new Vector(2, 2, 3), new Point3D(200, 200, 100), 0, 0.00001, 0.000005));
//
//			
//	
//	
//	        render.renderImage();
//			render.get_imageWriter().writeToimage();
//		
//		
//		
//	}
//	@Test
//	public void ourrealproject() throws Exception
//	{
//		Scene scene = new Scene();
//		scene.setDistance(500);
//        ImageWriter imageWriter = new ImageWriter("NEWPROJETA", 500, 500, 500, 500);
//        Render render = new Render(imageWriter, scene);
//        
//        Sphere sphere = new Sphere(new Color(0, 0, 200), 80, new Point3D(20, 0, -1000));
//		Sphere sphere2 = new Sphere(new Color(0, 200, 0), 80, new Point3D(50, 150, -500));
//		Sphere sphere3 = new Sphere(new Color(200, 0, 0), 80, new Point3D(50, 50, -350));
//		Sphere sphere4 = new Sphere(new Color(255,255, 255), 100, new Point3D(500, 200, -700));
//		Sphere sphere5 = new Sphere(render.get_scene().getBackground(), 100, new Point3D(500, 250, -650));
//		
//		Plane sol= new Plane(new Color(0, 51, 102), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//		Plane mur= new Plane(new Color(0, 0, 102), new Point3D(0, -100 , 0), new Vector(0,1,0));
//		Plane mur1= new Plane(new Color(0, 100, 0), new Point3D(0, 100 , 0), new Vector(0,-1,0));
//		
//		Material MatP = new Material(0.4, 0.35, 0, 0,20);
//		sol.SetMaterial(MatP);
//		mur.SetMaterial(MatP);
//		mur1.SetMaterial(MatP);
//		sphere.SetMaterial(MatP);
//		sphere2.SetMaterial(MatP);
//		sphere3.SetMaterial(MatP);
//		sphere4.SetMaterial(MatP);
//		sphere5.SetMaterial(MatP);
//		
//		
//		scene.addGeometries(sol);
//		scene.addGeometries(mur);
//		scene.addGeometries(mur1);
//		scene.addGeometries(sphere);
//		scene.addGeometries(sphere2);
//		scene.addGeometries(sphere3);
//		scene.addGeometries(sphere4);
//		scene.addGeometries(sphere5);
//
//		 scene.addLight(new PointLight(new Color(130, 100, 130), new Point3D(150, 0, -1000), 0, 0.00001, 0.000005));
//        scene.addLight(new SpotLight(new Color(100, 100, 100),new Vector(2, 2, 3), new Point3D(200, 200, 100), 0, 0.00001, 0.000005));
//
//
//		
//		render.renderImage();
//		render.get_imageWriter().writeToimage();
//	
//
//
//	}
//	
//	@Test
//	public void Projett() throws Exception
//	{
//		Scene scene = new Scene();
//		scene.setDistance(600);
//        ImageWriter imageWriter = new ImageWriter("NEW", 500, 500, 500, 500);
//        Render render = new Render(imageWriter, scene);
//        
//        Sphere sphere = new Sphere(new Color(0, 0, 200), 80, new Point3D(-90, 0, -800));
//		Sphere sphere2 = new Sphere(new Color(0, 200, 0), 80, new Point3D(50, 150, -200));
//		Sphere sphere3 = new Sphere(new Color(200, 0, 0), 80, new Point3D(50, 50, -500));
//		Sphere sphere4 = new Sphere(new Color(255,255, 255), 100, new Point3D(500, 200, -700));
//		Sphere sphere5 = new Sphere(render.get_scene().getBackground(), 100, new Point3D(500, 250, -650));
//		
//		Plane sol= new Plane(new Color(0, 51, 102), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//		Plane mur= new Plane(new Color(0, 0, 102), new Point3D(0, -100 , 0), new Vector(0,1,0));
//		Plane mur1= new Plane(new Color(0, 100, 0), new Point3D(0, 100 , 0), new Vector(0,-1,0));
//		
//		Material Mat = new Material(0.4, 0.35, 0.7, 0,20);
//		Material MatP = new Material(0.4, 0.35, 0.7, 0,20);
//
//		
//		sol.SetMaterial(MatP);
//		mur.SetMaterial(Mat);
//		mur1.SetMaterial(Mat);
//		sphere.SetMaterial(Mat);
//		sphere2.SetMaterial(Mat);
//		sphere3.SetMaterial(Mat);
//		sphere4.SetMaterial(Mat);
//		sphere5.SetMaterial(Mat);
//		
//		
//		scene.addGeometries(sol);
//		//scene.addGeometries(mur);
//		//scene.addGeometries(mur1);
//		scene.addGeometries(sphere);
//		scene.addGeometries(sphere2);
//		scene.addGeometries(sphere3);
//	//	scene.addGeometries(sphere4);
//		//scene.addGeometries(sphere5);
//
//		 scene.addLight(new PointLight(new Color(130, 100, 130), new Point3D(150, 0, -1000), 0, 0.00001, 0.000005));
//
//		
//		render.renderImage();
//		render.get_imageWriter().writeToimage();
//	
//
//
//	}
	
//	@Test
//	public void refractedTest() throws Exception
//	{
//		Scene scene = new Scene();
//		scene.setDistance(500);
//	//	scene.setBackground(new Color(130, 100, 0));
//        ImageWriter imageWriter = new ImageWriter("NJ2B2", 500, 500, 500, 500);
//        Render render = new Render(imageWriter, scene);
//        
//        Sphere sphere = new Sphere(new Color(40,40, 0), 1000, new Point3D(-70, 30, -30000));
//		Sphere sphere2 = new Sphere(new Color(0, 200, 0), 80, new Point3D(50, 150, -200));
//		Sphere sphere3 = new Sphere(new Color(200, 0, 0), 80, new Point3D(50, 50, -500));
//		Sphere sphere4 = new Sphere(new Color(255,255, 255), 300, new Point3D(500, 200, -700));
//		Sphere sphere5 = new Sphere(new Color(244,216,7), 100, new Point3D(500, 250, -650));
//		
//		Plane sol= new Plane(new Color(0,20,20), new Point3D(-100, 0 , 0), new Vector(1,0,0));
//		Plane mur= new Plane(new Color(0, 0, 102), new Point3D(0, -100 , 0), new Vector(0,1,0));
//		Plane mur1= new Plane(new Color(0, 100, 0), new Point3D(0, 100 , 0), new Vector(0,-1,0));
//		
//
//		Triangle bateau = new Triangle(new Color (200, 0, 0),new Point3D(-2000000, -500, 0),
//			new Point3D(0, -500, 0),
//			new Point3D(0, -200, 10));
//		
//		Triangle test = new Triangle(new Color(0, 0,255 ), new Point3D(-500, -650, 0),
//					new Point3D(-15000000, 50, 9),
//					new Point3D(5000000, 50, 9));
//		
//		Material Mat = new Material(0.4, 0.35, 0, 0.7,20);
//		Material Mat1 = new Material(0.4, 0.35, 0, 0,20);
//		Material MatP = new Material(0.4, 0.35, 0., 0.5,20);
//
//		
//		sol.SetMaterial(MatP);
//		mur.SetMaterial(Mat);
//		mur1.SetMaterial(Mat);
//		sphere.SetMaterial(Mat1);
//		sphere2.SetMaterial(Mat);
//		sphere3.SetMaterial(Mat);
//		sphere4.SetMaterial(Mat);
//		sphere5.SetMaterial(Mat);
//		bateau.SetMaterial(Mat);
//		test.SetMaterial(Mat);
//		
//		scene.addGeometries(sol);
//	//	scene.addGeometries(mur);
//	//	scene.addGeometries(mur1);
//		scene.addGeometries(sphere);
//	//	scene.addGeometries(sphere2);
//	//	scene.addGeometries(sphere3);
//	//	scene.addGeometries(sphere4);
//	//	scene.addGeometries(sphere5);
//		scene.addGeometries(bateau);
//		scene.addGeometries(test);
//
//		
//	 scene.addLight(new PointLight(new Color(130, 100, 0), new Point3D(-30, 0, -800), 0, 0.0000, 0.00000));
//	 scene.addLight(new SpotLight(new Color(255, 100, 0),  new Vector(0,0,1), new Point3D(-30, 0, -800), 
//			  0.1, 0.00001, 0.00000));
//		 scene.addLight(new PointLight(new Color(130, 100, 0), new Point3D(150, 150, -50), 0, 0.00001, 0));
//		 scene.addLight(new DirectionalLight(new Color(217,50,0), new Vector(0,0,1)));
//
//		
//		render.renderImage();
//		render.get_imageWriter().writeToimage();
//	
//
//
//	}
}






