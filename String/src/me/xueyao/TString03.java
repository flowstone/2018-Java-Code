package me.xueyao;

/**
 * @author XueYao
 * 本题主要考察java中常量优化机制，编译时s1已经成为"abc"在常量
 * 池中查找创建，s2不需要再创建。
 */
public class TString03 {
	public static void main(String[] args) {
		//s1指向常量池中abc
		String s1 = "a"+"b"+"c";
		//s2指向常量池中abc
		String s2 = "abc";
		
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		
		
	}
}
