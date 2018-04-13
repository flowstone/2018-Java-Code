package me.xueyao.nowcoder;

import java.util.ArrayList;
import java.util.List;

public class Qid49832 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		List<Integer> list2 = list;
		System.out.println(list.get(0) instanceof Integer);
		System.out.println(list2.get(0) instanceof Integer);
	}

}
