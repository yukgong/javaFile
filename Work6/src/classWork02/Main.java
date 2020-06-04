package classWork02;

public class Main {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(2022);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(10);
		System.out.println("VOL:"+t.getVolume());
		
		System.out.println();
		
		MyTv2 t2 = new MyTv2();
		t2.setChannel(10);
		System.out.println("CH:"+t2.getChannel());
		t2.setChannel(20);
		System.out.println("CH:"+t2.getChannel());
		t2.gotoPrevChannel();
		System.out.println("CH:"+t2.getChannel());
		t2.gotoPrevChannel();
		System.out.println("CH:"+t2.getChannel());
	}
}
