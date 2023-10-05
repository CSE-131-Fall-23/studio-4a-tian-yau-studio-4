package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		
		boolean isFilled = in.nextBoolean();
		
		
		
		
		
		if (shape.equals("rectangle")) 
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (!isFilled)
			{
				StdDraw.setPenColor(r,g,b);
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
				
			}
			else 
			{
				StdDraw.setPenColor(r,g,b);
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			
		}
		
		if (shape.equals("ellipse")) 
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (!isFilled)
			{
				StdDraw.setPenColor(r,g,b);
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
				
			}
			else 
			{
				StdDraw.setPenColor(r,g,b);
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			
		}
		
		
		if (shape.equals("triangle")) 
		{
			double []n = {in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble()};
			double []x = {n[0],n[2],n[4]};
			double []y = {n[1],n[3],n[5]};
			if(!isFilled) 
			{
				StdDraw.setPenColor(r,g,b);
				StdDraw.polygon(x,y);
			}
			
			else 
			{
				StdDraw.setPenColor(r,g,b);
				StdDraw.filledPolygon(x,y);
			}
			
		}
		
	}
}
