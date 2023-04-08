public class GameBoard
{
	public String[][] positions;
	public GameBoard()
	{
		positions = new String[][] {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

	}

	public void showBoard()
	{
		for(int i=0; i<this.positions.length; i++)
		{
			for(int j=0; j<this.positions[i].length; j++)
			{
				System.out.print(this.positions[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void showBoard(String[][] positions)
	{
		for(int i=0; i<this.positions.length; i++)
		{
			for(int j=0; j<this.positions[i].length; j++)
			{
				System.out.print(this.positions[i][j] + " ");
			}
			System.out.println();
		}
	}

	
}