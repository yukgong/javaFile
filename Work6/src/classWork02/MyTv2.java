package classWork02;

public class MyTv2 {
//		MyTv2 t = new MyTv2();
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:"+t.getVolume());

	// ��� ����
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	boolean cb,vb;
	int prevChannel;

	// ��� �޼ҵ�
	public void setChannel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			prevChannel = this.channel; //���ڰ��� �ޱ� ���� ä�ΰ��� ������. -> �����ϴ� ������ ���̸� �ξ� ���� ���� �����Ѵ�.
			this.channel = channel;//���ڰ��� ���� ���� ä�ΰ��� ������. -> this.channel�� ���ڰ��� �޾� ���ο� ���� ������ �ȴ�.
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
			str = "�߸��� ä�ΰ��Դϴ�.";
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
			str = "�߸��� �������Դϴ�.";
			return str;
		}
	}
	

	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}
