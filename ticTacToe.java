import java.util.Scanner;


public class ticTacToe {
	
	//Maybe a win condition??
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String orgBoard[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
		String newBoard[][] = orgBoard;
		String playType = "X";
		int numTurn = 0;
		
		
		
		//MAIN GAME LOOP
		//loop that ends when the board is full
		while(numTurn < 9) {
			
			//prints the board at the beginning of the turn
			for(int i = 0; i < newBoard.length; ++i) {
				for(int j = 0; j < newBoard[0].length; ++j) {
					System.out.print(newBoard[i][j] + " ");
				}
				System.out.println();
			}
			
			
			//prompts for position
			System.out.println("Type the number for your move");
			String move = keyboard.nextLine();
			
			while(!move.equals("1") && !move.equals("2") && !move.equals("3") && !move.equals("4") && !move.equals("5") && !move.equals("6") && !move.equals("7") && !move.equals("8") && !move.equals("9")) {
				System.out.println("Try again");
				move = keyboard.nextLine();
			}
			
			//determines where to put the 'move'
			if((move.equals("1") && newBoard[0][0].equals("1")) || (move.equals("2") && newBoard[0][1].equals("2")) || (move.equals("3") && newBoard[0][2].equals("3"))) {
				for(int i = 0; i < newBoard[0].length; ++i) {
					if(newBoard[0][i].equals(move)) {
						newBoard[0][i] = playType;
					}
				}
			}
			else if((move.equals("4") && newBoard[1][0].equals("4")) || (move.equals("5") && newBoard[1][1].equals("5")) || (move.equals("6") && newBoard[1][2].equals("6"))) {
				for(int i = 0; i < newBoard[1].length; ++i) {
					if(newBoard[1][i].equals(move)) {
						newBoard[1][i] = playType;
					}
				}
			}
			else if((move.equals("7") && newBoard[2][0].equals("7")) || (move.equals("8") && newBoard[2][1].equals("8")) || (move.equals("9") && newBoard[2][2].equals("9"))) {
				for(int i = 0; i < newBoard[2].length; ++i) {
					if(newBoard[2][i].equals(move)) {
						newBoard[2][i] = playType;
					}
				}
			}
			else {
				System.out.println("Try again");
				move = keyboard.nextLine();
			}
			
			//changes the playType
			if(playType.equals("X")) {
				playType = "O";
			}
			else if(playType.equals("O")) {
				playType = "X";
			}
			
			numTurn++;
		}
		
		
		
		//prints the final board
		for(int i = 0; i < newBoard.length; ++i) {
			for(int j = 0; j < newBoard[0].length; ++j) {
				System.out.print(newBoard[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
