import org.apache.commons.lang3.ArrayUtils;

public class LessonTen {

	public static void main (String args[]) {
		
		MonsterTwo.buildBattleBoard();
		
		char [][] tempBattleBoard = new char [10][10];
		
		// ObjetcName[] Monsters = new ObjectName[4];
		
		MonsterTwo[] monsters = new MonsterTwo[4];
		
		monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
		monsters[1] = new MonsterTwo(500, 40, 2, "Drack");
		monsters[2] = new MonsterTwo(1000, 20, 1, "Thing");
		monsters[3] = new MonsterTwo(1000, 20, 1, "Mummy");
		
		MonsterTwo.redrawBoard();
		
	
		for(MonsterTwo m : monsters) {
			if(m.getAlive()) {
				int arrayItemIndex = ArrayUtils.indexOf(monsters, m);
				m.moveMonster(monsters, arrayItemIndex);
			}
		}
		
		MonsterTwo.redrawBoard();
	}
	
	
	
}
