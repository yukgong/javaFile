package classWork01;

public class Student {
//	s.name = "È«±æµ¿";
//	s.ban = 1;
//	s.no = 1;
//	s.kor = 100;
//	s.eng = 60;
//	s.math = 76;

	// ¸â¹ö º¯¼ö
	String name;
	int ban, no, kor, eng, math;
	private int sum; 
	private double avg;

	public int getTotal(int k, int e, int m) {
		this.kor = k;
		this.eng = e;
		this.math = m;

		this.sum = this.kor + this.eng + this.math;
		return this.sum;
	}

	public String getAverage() {
		this.avg = (double)sum / 3;
		String result = String.format("%.1f",(double)sum / 3);

		return result;
	}

}
