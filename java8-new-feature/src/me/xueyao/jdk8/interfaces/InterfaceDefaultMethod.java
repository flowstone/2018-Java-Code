package me.xueyao.jdk8.interfaces;

/**
 * @author XueYao
 * 接口的默认方法，实现接口的类不用实现这个新加的方法
 */
public interface InterfaceDefaultMethod {
	default String notRequired() {
		return "Default implementation";
	}
}
