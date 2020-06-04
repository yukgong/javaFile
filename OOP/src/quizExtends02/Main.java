package quizExtends02;

public class Main {

	public static void main(String[] args) {
		Unit unitArr[] = new Unit[3];
		unitArr[0] = new Tank();
		unitArr[1] = new Marine();
		unitArr[2] = new Dropship();
		
		for (int i = 0; i < unitArr.length; i++) {
			if(unitArr[i] instanceof Dropship) {
				Dropship d = (Dropship)unitArr[i];
				System.out.println(i + "번쨰 배열에서 Dropship을 발견했습니다.");
				d.move(1, 2);
				d.load();
				d.unload();
				
			} else if (unitArr[i] instanceof Marine) {
				System.out.println(i + "번쨰 배열에서 Marine을 발견했습니다.");
				((Marine)unitArr[i]).stimPack();
			}
		}

	}

}
