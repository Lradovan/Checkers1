
public class Pieces 
{
	
	private static final int RED = 0;
	private static final int BLACK = 1;
	
	private boolean isAlive;
	private int color;
	private int x;
	private int y;
	
	public Pieces(int x, int y, int color)
	{
		isAlive = true;
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getColor()
	{
		return color;
	}
	
	public boolean isAlive()
	{
		if(isAlive)
		{
			return true;
		}
		return false;
	}
	
	// Have a paint method for each piece
	

}
