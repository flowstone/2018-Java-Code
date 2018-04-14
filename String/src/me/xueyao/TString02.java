package me.xueyao;

/**
 * @author XueYao
 * 通过new对象时，会在常量池中创建"abc"字符串，并在堆中创建对象，s1指向堆中的对象
 * s2指向常量池
 */
public class TString02 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2));  //true
	}
}
