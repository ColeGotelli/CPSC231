import java.util.Random;
import java.util.Scanner;

public class Ch3Ex10 {
	public  static void main(String[] args) {
		
		int pScore = 0;
		int cScore = 0;
		int tempScore = 0;
		int tempComp = 0;
		int diceNum = 0;
		boolean isPlayerTurn = true;
		String playChoice = "";
		
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter r to roll or h to hold: ");
		playChoice = keyboard.nextLine();
				
		while(pScore < 100 && cScore < 100) {
		    
			//THIS IS THE PLAYERS TURN
			if(isPlayerTurn == true) {
			
			    //if the player chooses to continue rolling this loop 
			    if(playChoice.equals("r")) {
			        diceNum = rand.nextInt(6) + 1;
			
			        //if the player rolls a 1 they get 0 points and it becomes the computers turn
			        if(diceNum == 1) {
			            System.out.println("You rolled a 1, that sucks. You don't get any points and now it's the computers turn");
			            tempScore = 0;
			            isPlayerTurn = false;
			        }
			        //if the player rolls something other than a 1 that number is added to that rounds score, then the player is asked if they want to continue
			        else {
			            System.out.println("You rolled a " + diceNum);
			            tempScore += diceNum;
			            System.out.println("Keep rolling (r) or hold (h): ");
			            playChoice = keyboard.nextLine();
			        }
			        //if the player chooses to hold on their turn, it ends and becomes the computers turn. The score of the round is added to the players overall score
			        if(playChoice.equals("h")) {
			            pScore += tempScore;
			            System.out.println("You chose to hold, your score is " + pScore + ", now it is the computers turn");
			            tempScore = 0;
			            isPlayerTurn = false;
			        }
			     }
			  }
			
			//THIS IS THIS COMPUTERS TURN
			  else if(isPlayerTurn == false) {
			        
			    diceNum = rand.nextInt(6) + 1;
			        
			        //if the computer rolls a 1 it gets 0 points and it becomes the players turn
			        if(diceNum == 1) {
			        
			            tempComp = 0;
			            System.out.println("The computer rolled a 1, it gets no points and it is now your turn");
			            playChoice = "r";
			            isPlayerTurn = true;
			            
					}
			        //while the computers score is less than 20 for that round, as long as it doesn't roll a 1, it continues to roll the dice and adds the score to that rounds score
			        else {
			        
			            while(tempComp < 20) {
			                System.out.println("The computer rolled a " + diceNum);
			                tempComp += diceNum;
			                diceNum = rand.nextInt(6) + 1;
						}
			
			            //when the computers score reaches or passes 20 points for a round, its turn ends, the points are added to its overall score, and it becomes the players turn
			            if(tempComp >= 20) {
			                cScore += tempComp;
			                System.out.println("The computer's score is " + cScore);
			                System.out.println("That computer has reached or passed 20 points this turn.");
			                playChoice = "r";
			                tempComp = 0;
			                isPlayerTurn = true;
			            }
			        }
			  }
			 
		}
		
		if(pScore > cScore) {
			System.out.println("You win!");
		}
		else if(cScore > pScore) {
			System.out.println("The computer won");
		}
	}
}
