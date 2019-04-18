
public class Player 
{
	private static final int MAX_PIECES = 12;
	private String name;
	private Pieces[] pieces;
	
	public Player(String n)
	{
		name = n;
		
	}
	
	public boolean hasLost()
	{
		for(int i = 0; i < pieces.length-1; i++)
		{
			if(pieces[i].isAlive())
			{
				return false;
			}
		}
		return true;
	}
	
	// https://www.google.com/search?q=checkers+github&rlz=1C1GCEU_enUS821US821&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjc0d_489fhAhVmTt8KHU6CDEIQ_AUIDygC&biw=1366&bih=657#imgdii=UlvjyUCECX35aM:&imgrc=glQnOlYB9YcH6M:
}
