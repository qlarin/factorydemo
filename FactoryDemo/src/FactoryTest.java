
public class FactoryTest {

	public static void main(String[] args){
		MonsterFactory monsterFactory = new MonsterFactory();
		
		Monster mon1 = monsterFactory.getMonster("WOLF");
		mon1.spawn();
		
		Monster mon2 = monsterFactory.getMonster("HARPY");
		mon2.spawn();
		
		
	}
}
