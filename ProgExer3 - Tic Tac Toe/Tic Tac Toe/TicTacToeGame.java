import java.util.Scanner;
public class TicTacToeGame
{
	public Player[] players = new Player[2];
	public String[] xO = {"X","O"};
	public GameBoard boardGame;
	public Scanner input = new Scanner(System.in);
	public boolean isWinner = false;
	public int count = 0;


	public TicTacToeGame(String playerName1, String playerName2)
	{
		this.players[0] = new Player(playerName1);
		this.players[1] = new Player(playerName2);

		boardGame = new GameBoard();
	}

	public void startGame()
	{
		assignXorO(this.players[0], this.players[1]);
		System.out.println("\nThis is a tic-tac-toe game. This game requires two players.");
		System.out.println(this.players[0].name + " will be marked by \'" + this.players[0].XorO +"\' and "+ this.players[1].name + " will be marked by '" + this.players[1].XorO + "'.");
		System.out.println("Whosoever first creates a 3-X line or 3-O line wins.\n");	

		this.boardGame.showBoard();
		
		do
		{
			if(this.count > 8)
			{
				System.out.println("The game was a draw!");
				break;
			}

			this.playerTurn(0);
			this.boardGame.showBoard();
			int x = this.announceWinner(this.winnerChecker());
			
			if(x == 1)
				break;
			
			if(this.count > 8)
			{
				System.out.println("The game was a draw!");
				break;
			}

			this.playerTurn(1);
			this.boardGame.showBoard();
			this.announceWinner(this.winnerChecker());


		}while(!(this.isWinner));
	}
		
	public void playerTurn(int i)
	{
		System.out.print('\n' + this.players[i].name + ", your turn\nChoose a position in the board: ");
		this.players[i].position = input.nextLine();

		this.players[i].placePosition(this.boardGame);
		this.count++;
		System.out.println();
	}

	

	private void assignXorO(Player p1, Player p2)
	{
		
		int randNumPlayer = (Math.random() * 10) > 5? 0: 1;
		int randNumXorO = (Math.random() * 10) > 5? 0: 1;

		this.players[randNumPlayer].XorO = this.xO[randNumXorO];

		int randNumPlayer2 = (randNumPlayer == 0)? 1: 0;
		int randNumXorO2 = (randNumXorO == 0)? 1: 0; 

		this.players[randNumPlayer2].XorO = this.xO[randNumXorO2];
	}

	public int announceWinner(String xOro)
	{
		if(xOro == null)
			return 0;
		if(this.players[0].XorO.equals(xOro))
		{
			System.out.println(this.players[0].name + " wins!");
			return 1;
		}
		else 
		{
			System.out.println(this.players[1].name + " wins!");
			return 1;
		}
			
	}


	public String winnerChecker()
	{
		int i=0;
		if(this.boardGame.positions[i][0].equals(this.boardGame.positions[i][1]) && this.boardGame.positions[i][1].equals(this.boardGame.positions[i][2]))
		{
			this.isWinner = true;
			return this.boardGame.positions[i][0];
		}
		if(this.boardGame.positions[0][i].equals(this.boardGame.positions[1][i]) && this.boardGame.positions[1][i].equals(this.boardGame.positions[2][i]))
		{
			this.isWinner = true;
			return this.boardGame.positions[0][i];
		}
		i++;
		if(this.boardGame.positions[i][0].equals(this.boardGame.positions[i][1]) && this.boardGame.positions[i][1].equals(this.boardGame.positions[i][2]))
		{
			this.isWinner = true;
			return this.boardGame.positions[i][0];
		}
		if(this.boardGame.positions[0][i].equals(this.boardGame.positions[1][i]) && this.boardGame.positions[1][i].equals(this.boardGame.positions[2][i]))
		{
			this.isWinner = true;
			return this.boardGame.positions[0][i];
		}
		i++;
		if(this.boardGame.positions[i][0].equals(this.boardGame.positions[i][1]) && this.boardGame.positions[i][1].equals(this.boardGame.positions[i][2]))
		{
			this.isWinner = true;
			return this.boardGame.positions[i][0];
		}
		if(this.boardGame.positions[0][i].equals(this.boardGame.positions[1][i]) && this.boardGame.positions[1][i].equals(this.boardGame.positions[2][i]))
		{
			this.isWinner = true;
			return this.boardGame.positions[0][i];
		}

		if(this.boardGame.positions[0][0].equals(this.boardGame.positions[1][1]) && this.boardGame.positions[1][1].equals(this.boardGame.positions[2][2]))
		{
			this.isWinner = true;
			return this.boardGame.positions[0][0];
		}
		if(this.boardGame.positions[0][2].equals(this.boardGame.positions[1][1]) && this.boardGame.positions[1][1].equals(this.boardGame.positions[2][0]))
		{
			this.isWinner = true;
			return this.boardGame.positions[0][2];
		}
		else 
			return null;	
	}



}