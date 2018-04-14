package me.xueyao;

/**
 * @author XueYao
 * 考察常量池
 * 直接赋值的话，会在常量池中取出一个出来，如果没有则创建一个，当创建
 * 一个常量后，下个变量创建相同的字符串，则从常量池中获取，所有s1和s2指向相同的地址
 */
public class TString01 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
	}
}
