package me.xueyao.jdk8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author XueYao
 * Java8 对Base64编码的支持
 */
public class Base64s {
	public static void main(String[] args) {
		final String text = "Base64 finally in Java 8";
		//编码
		final String encoded = Base64.getEncoder()
				.encodeToString(text.getBytes(StandardCharsets.UTF_8));
		System.out.println(encoded);
		
		//解码
		final String decoded = new String(
				Base64.getDecoder().decode(encoded),StandardCharsets.UTF_8);
		
		System.out.println(decoded);
	}
}
