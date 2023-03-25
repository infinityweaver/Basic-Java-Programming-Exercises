public class Player
{
	public String name;
	public String position;
	public String XorO;

	public Player()
	{

	}

	public Player(String name)
	{
		this.name = name;
	}

	
	public void placePosition(GameBoard board)
	{
		for(int i=0; i<board.positions.length; i++)
		{
			for(int j=0; j<board.positions[i].length; j++)
			{
				if(this.position.equals(board.positions[i][j]))
				{
					if(board.positions[i][j].equals("X") || board.positions[i][j].equals("O"))
					{
						System.out.println("\nError: Invalid position. Please choose a position not marked an 'X' or 'O'.");
					}
					else 
						board.positions[i][j] = this.XorO;
				}
			}
		}
	}
}