package me.xueyao.nowcoder;

class Two{
	Byte x;
}

public class Qid56119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qid56119 p = new Qid56119();
		p.start();
	}

	private void start() {
		// TODO Auto-generated method stub
		Two t = new Two();
		System.out.println(t.x+" ");
		Two t2 = fix(t);
		System.out.println(t.x+" "+t2.x);
	}

	private Two fix(Two tt) {
		// TODO Auto-generated method stub
		tt.x = 42;
		return tt;
	}

}
