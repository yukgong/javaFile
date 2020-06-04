package classWork03;

public class Dice {
	private int dice;
	
	//dice
	public void setDice() {
		this.dice = (int)(Math.random() * 6)+1;
	}
	
	public int getDice() {
		setDice();
		return dice;
	}
}
