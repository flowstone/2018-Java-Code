package me.xueyao.jdk8.interfaces;

public class InterfaceDefaultMethodImpl implements InterfaceDefaultMethod{

}

class OverridableImpl implements InterfaceDefaultMethod{
	@Override
	public String notRequired() {
		return "Overridden implementation";
	}
}
