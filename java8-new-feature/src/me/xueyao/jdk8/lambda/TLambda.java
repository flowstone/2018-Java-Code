package me.xueyao.jdk8.lambda;

import java.util.Arrays;


public class TLambda {
	
	/**
	 * Lambda表达式,也可称为闭包，允许把函数作为一个方法的参数(函数作为参数传递进方法中)
	 * 使用Lambda表达式可以使用代码变的更加简洁紧凑
	 * *****语法
	 * (parameters)->expression或
	 * (parameters)->{statements;}
	 */
	public static void main(String args[]) {
		//最简单的Lambda表达式
		//Arrays.asList("a","b","d").forEach(e->System.out.println(e));
		//显式指定该参数的类型
		//Arrays.asList("c","f","g").forEach((String e)->System.out.println(e));
		//复杂的语句块
		Arrays.asList("a","b","d").forEach(e->{
			System.out.print(e);
			System.out.print(e);
		});
		
		//Lambda表达式可以引用类成员和局部变量
		//String separator = ",";
		final String separator = ",";
		Arrays.asList("a","b","d").forEach(
				(String e)->System.out.print(e+separator));
		
		//Lambda表达式有返回值
		Arrays.asList("a","b","d").sort((e1,e2)->e1.compareTo(e2));
		Arrays.asList("a","b","d").sort((e1,e2)->{
			int result = e1.compareTo(e2);
			return result;
		});
	}
}
