import java.util.Arrays;

public class MonsterTwo {

	static char [][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard() {
		for (char[] row : battleBoard) {
			Arrays.fill(row, '*');
		}
	}
	
	public static void redrawBoard() {
		int k = 1;
		
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		for(int i = 0; i < battleBoard.length; i++) {
			for(int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		
		k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
	}
	
	public final String TOMSTONE = "Here lies a dead monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private boolean alive = true;
	
	public String name = "Big Monster";
	public int xPosition = 0;
	public int yPosition = 0;
	public char nameChar1 = 'B';
	public static int numOfMonsters= 0;
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int newAttack) {
		this.attack = newAttack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public void setMovement(int newMovement) {
		this.movement = newMovement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		
		if(health < 0) {
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth) {
		health -= (int) decreaseHealth;
		
		if(health < 0) {
			alive = false;
		}
	}
	
	public MonsterTwo(int newHealth, int newAttack, int newMovement, String name) {
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
		this.name = name;
		
		int maxXBoardSpace = battleBoard.length -1;
		int maxYBoardSpace = battleBoard[0].length -1;
		
		int randNumX, randNumY;
		
		do{
			randNumX = (int)(Math.random() * maxXBoardSpace);
			randNumY = (int)(Math.random() * maxYBoardSpace);
		}while (battleBoard[randNumX][randNumY] != '*');
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		
		this.numOfMonsters++;
	}
	
	public MonsterTwo() { this.numOfMonsters++; }
	
	public MonsterTwo(int newHealth) {
		this.health = newHealth;
	}
	
	public MonsterTwo(int newHealth, int newAttack) {
		this(newHealth);
		this.attack = newAttack;
	}	
	
}
