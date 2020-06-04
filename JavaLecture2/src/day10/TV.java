package day10;

public class TV {
	String name[];
	int channel[];
	boolean power[];
	
	public void getInput(String name[], int channel[],boolean power[]) {
		this.name = name;
		this.channel = channel;
		this.power = power;
	}
	
	public void setPower(boolean b[]) {
		power = b;
	}
	
	public void method() {
		System.out.println("name : " + name);
		System.out.println("channel : " + channel);
		System.out.println("power : " + power);
	}
}
