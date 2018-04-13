package me.xueyao.nowcoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Qid74666 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("a");
		//Set不可以重复
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("a");
		
		System.out.println(list.size()+","+set.size());
	}

}
