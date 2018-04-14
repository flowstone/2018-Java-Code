package me.xueyao;

/**
 * @author XueYao
 * 字符串串联是通过StringBuilder及其append方法实现，
 * 字符串转换是通过toString方法实现的
 * s3，是先创建StringBuilder对象，通过append连接得到"abc",
 * 再调用toString()转换得到的地址指向s3
 */
public class TString04 {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1+"c";
		
		System.out.println(s3 == s2); //false
		System.out.println(s3.equals(s2)); //true
	}
}
