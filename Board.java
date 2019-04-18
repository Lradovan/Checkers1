
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Board extends JFrame
{
	public Board()
	{
		setSize(800,800);
		setVisible(true);
		setTitle("checkerboard");
		setResizable(false);
	}
	
	public void paint(Graphics g)
	{
		for(int i = 0; i <= 800; i+=100)
		{
			for(int j = 0; j <= 800; j+=100)
			{
				if(i % 200 == 0)
				{
					if(j % 200 == 0)
					{
						g.drawRect(i, j, 100, 100);
					}
					else
					{
						g.setColor(Color.green);
						g.fillRect(i, j, 100, 100);
					}
				}
				else
				{
					if(j % 200 == 0)
					{
						g.setColor(Color.green);
						g.fillRect(i, j, 100, 100);
					}
					else
					{
						g.drawRect(i, j, 100, 100);
					}
				}
			}
		}
		for(int i = 0; i <= 800; i+=100)
		{
			for(int j = 0; j <= 200; j+=100)
			{
				if(i % 200 == 0)
				{
					if(j % 200 == 0)
					{
						g.setColor(new java.awt.Color(138, 0, 0));
						g.fillOval(i + 8, j + 13,85,75);
						g.setColor(Color.RED);
						g.fillOval(i + 8, j + 13,85,68);
					}
				}
				else
				{
					if(j % 200 != 0)
					{
						g.setColor(new java.awt.Color(138, 0, 0));
						g.fillOval(i + 8, j + 13,85,75);
						g.setColor(Color.RED);
						g.fillOval(i + 8, j + 13,85,68);
					}
				}
			}
		}
		
		for(int i = 800; i >= 0; i-=100)
		{
			for(int j = 800; j >= 500; j-=100)
			{
				if(i % 200 == 0)
				{
					if(j % 200 == 0)
					{
						g.setColor(Color.BLACK);
						g.fillOval(i + 8, j + 13,85,75);
						g.setColor(Color.DARK_GRAY);
						g.fillOval(i + 8, j + 13,85,68);
					}
				}
				else
				{
					if(j % 200 != 0)
					{
						g.setColor(Color.BLACK);
						g.fillOval(i + 8, j + 13,85,75);
						g.setColor(Color.DARK_GRAY);
						g.fillOval(i + 8, j + 13,85,68);
					}
				}
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Board b = new Board();
		b.paint(null);
	}
	
}



