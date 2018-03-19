package me.xueyao.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 对HashMap排序
 * @author XueYao
 *
 */
public class HashMapSort {
	/**
	 * (按值排序)
	 * @param hashMap
	 */
	public  void sortHashMap(Map<Integer, String> hashMap) {
		System.out.println("排序后：");
		//第一步，用HashMap构造一个LinkedList
		Set<Entry<Integer, String>> sets = hashMap.entrySet();
		LinkedList<Entry<Integer, String>> linkedList = new LinkedList<Entry<Integer,String>>(sets);
		
		//用Collections的sort方法排序 
		Collections.sort(linkedList, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// 如果o1==o2，返回0；o1>o2,返回结果大于0；o1<o2，返回结果小于0
				return o1.getValue().compareTo(o2.getValue());
				//return o1.getKey().compareTo(o2.getKey());

			}
		});
		
		//第三步，将排序后的list赋值给LinkedHashMap
		Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		for (Entry<Integer,String> entry : linkedList) {
			map.put(entry.getKey(), entry.getValue());
		}
		for (Entry<Integer,String> entry : map.entrySet()) {
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
		}
	}
	
	/**
	 * 按键排序
	 * @param hashMap
	 */
	public void sortHashMapByKey(Map<Integer,String> hashMap) {
		System.out.println("按键排序后");
		//第一步：先创建一个TreeMap实例，构造方法传入一个comparator对象
		TreeMap<Integer, String> treeMap = new TreeMap<Integer,String>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// (x < y) ? -1 : ((x == y) ? 0 : 1);
				return Integer.compare(o1, o2);
			}
		});
		
		//第二步：将要排序的hashmap添加到TreeMap中
		treeMap.putAll(hashMap);
		for (Entry<Integer,String> entry : treeMap.entrySet()) {
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
		}
	}
}
