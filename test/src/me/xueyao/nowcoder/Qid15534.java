package me.xueyao.nowcoder;

public class Qid15534 {

	String str = new String("hello");
	char[] ch={'a','b'};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qid15534 ex = new Qid15534();
		ex.change(ex.str, ex.ch);
		System.out.println(ex.str+" and ");
		System.out.println(ex.ch);
	}

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'c';
	}
}
