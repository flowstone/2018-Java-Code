package me.xueyao;

/**
 * @author XueYao
 * Integer变量和int变量比较时，只要两个变量的值是相等，则结果为true
 * java会自动拆包装为int，然后进行比较
 */
public class TInteger02 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		int j = 100;
		System.out.println(i == j); //true
	}
}
