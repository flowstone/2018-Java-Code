package me.xueyao.nowcoder;

public class Qid51803 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qid51803 t = new Qid51803();
		Qid51803 s = new Qid51803();
		t.start();
		System.out.println("one.");
		s.start();
		System.out.println("two.");
		
	}
	
	public void run() {
		System.out.println("Thread");
	}

}
