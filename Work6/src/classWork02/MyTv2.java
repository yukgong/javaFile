package classWork02;

public class MyTv2 {
//		MyTv2 t = new MyTv2();
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:"+t.getVolume());

	// 멤버 변수
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	boolean cb,vb;
	int prevChannel;

	// 멤버 메소드
	public void setChannel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			prevChannel = this.channel; //인자값을 받기 전의 채널값을 가진다. -> 저장하는 순서의 차이를 두어 이전 값을 저장한다.
			this.channel = channel;//인자값을 받은 후의 채널값을 가진다. -> this.channel은 인자값을 받아 새로운 값을 가지게 된다.
			cb = true;
		} else {
			cb = false;
		}
	}

	public String getChannel() {
		String str = "";
		if (cb == true) {
			str = channel + "";
			return str;
		} else {
			str = "잘못된 채널값입니다.";
			return str;
		}
	}

	public void setVolume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
			vb = true;
		} else {
			vb = false;
		}
	}

	public String getVolume() {
		String str = "";
		if (vb == true) {
			str = volume + "";
			return str;
		} else {
			str = "잘못된 볼륨값입니다.";
			return str;
		}
	}
	

	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}
