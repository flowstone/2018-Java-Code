package me.xueyao.nowcoder;

enum AccountType {
	SAVING, FIXED, CURRENT;
	private AccountType() {
		System.out.println("It is a account type");
	}
}
public class Qid25372 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AccountType.FIXED);
	}

}
