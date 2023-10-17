import java.awt.*;

import javax.swing.*;

class Hospital
{
	public static void main (String arg[])
	{
		Frame win = new Frame("Hospital Management System");

		ImageIcon icon = new ImageIcon("E:\\Hospital\\HospitalLogo.png");
		win.setIconImage(icon.getImage());

		ImageIcon image = new ImageIcon("E:\\Hospital\\Hospital1.png");
		JLabel label = new JLabel(image);
		win.add(label);

		win.setVisible(true);

		int i;
		int x = 1;

		for(i=2; i<=600; i+=4, x+=1)
		{
			win.setLocation((500-((i+x)/2)), 300-(i/2));
			win.setSize(i+3*x,i+x/2);

			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{

			}
		}

		Thread t1;

		t1 = new Thread();
		t1.start();

		try
		{
			Thread.sleep(1000);
			new Login();
			win.setVisible(false);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}