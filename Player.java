package deep;

public class Player {
	
	String name;
	int rank;
	
	public Player(String name, int rank) {
		this.name= name;
		this.rank= rank;
	}
	
	public void introduce() {
		System.out.println("Player: " + name + " rank: " + rank);	
	}
	
	public int points() {
		return 2 * rank;
	}

}
