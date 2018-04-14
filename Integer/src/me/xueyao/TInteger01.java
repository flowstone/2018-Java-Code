package me.xueyao;

/**
 * @author XueYao
 * 由于Integer变量实际上是对一个Integer对象的引用，
 * 所以两个通过new生成的Integer变量永远是不相等的
 */
public class TInteger01 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer j = new Integer(100);
		
		System.out.println(i == j); //false
	}
}
