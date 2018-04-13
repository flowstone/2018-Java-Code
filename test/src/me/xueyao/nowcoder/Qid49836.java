package me.xueyao.nowcoder;

class X {
	Y y = new Y();
	public X() {
		System.out.println("X");
	}
}

class Y {
	public Y() {
		System.out.println("Y");
	}
}
public class Qid49836 extends X{
	Y y = new Y();
	public Qid49836() {
		System.out.println("Z");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Qid49836(); 
	}

}
