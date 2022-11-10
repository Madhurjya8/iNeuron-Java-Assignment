import java.util.Scanner;

class Guesser {
	private int secretNum;
	private int difficulty;
	
	public Guesser(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public int generateSecretNum() {
		int minRange, maxRange;
		switch(difficulty) {
			case 1:
				minRange=1;
				maxRange=3;
				break;
			case 2:
				minRange=1;
				maxRange=6;
				break;
			case 3:
				minRange=1;
				maxRange=10;
				break;
			default:
				minRange=0;
				maxRange=0;
		}
		secretNum = (int) Math.random()*(maxRange-minRange+1) + minRange;
		return secretNum;
	}
}

class Player {
	private int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire{
	private int d;
	private int numFromGuesser;
	private int numFromPlayer1;
	private int numFromPlayer2;
	private int numFromPlayer3;
	
	public Umpire(int d) {
		this.d = d;
	}
	
	public void collectNumberFromGuesser() {
		Guesser g = new Guesser(d);
		numFromGuesser = g.generateSecretNum();
	}
	
	public void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		if(d==1) {
			System.out.println("Guess numbers from 1 to 3");
		} else if(d==2) {
			System.out.println("Guess numbers from 1 to 6");
		} else {
			System.out.println("Guess numbers from 1 to 10");
		}
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	
	void compare() {
		boolean f1 = false, f2 = false, f3 = false;
		if(numFromPlayer1 == numFromGuesser) {
			f1 = true;
		}
		if(numFromPlayer2 == numFromGuesser) {
			f2 = true;
		}
		
		if(numFromPlayer3 == numFromGuesser) {
			f3 = true;
		}
		
		if(!f1 && !f2 && !f3) {
			System.out.println("Game lost! Try Again...");
		} else {
			if(f1) {
				System.out.println("Player 1 won!");
			}
			if(f2) {
				System.out.println("Player 2 won!");
			}
			if(f3) {
				System.out.println("Player 3 won!");
			}
		}
		
		System.out.println("The Secret Number was: "+numFromGuesser);
	}
	
	
}


public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		Scanner scn = new Scanner(System.in);
		
		
		boolean f = false;
		
		do {
			System.out.println("Please enter difficulty correctly: ");
			System.out.println("1: Easy");
			System.out.println("2: Medium");
			System.out.println("3: Hard");
			d = scn.nextInt();
			if(d==1 || d==2 || d==3) {
				f = true;
			}
		} while(!f);
		
		
		Umpire u = new Umpire(d);
		u.collectNumberFromGuesser();
		
		u.collectNumFromPlayers();
		u.compare();
	}

}
