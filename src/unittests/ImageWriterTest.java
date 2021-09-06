package unittests;
import renderer.*;
import static org.junit.Assert.*;

import java.awt.Color;
//import primitives.*;
import org.junit.Test;
public class ImageWriterTest {

	@Test
	public void Gridtest() {
		ImageWriter Image = new ImageWriter("Test4",10, 10, 500, 500);
		
		for (int i=0;i<500;i++)
		{
			for (int j=0; j<500; j++){
				if(i%50==0 || j%50==0)
					Image.writePixel(j, i, new Color(255,255,255));
				else
					Image.writePixel(j, i, new Color(220,255,100));
			
			}
			
		}
		                                                                                                                            
		Image.writeToimage();
	}

}
