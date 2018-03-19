package me.xueyao.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/**
 * HashMap的遍历方式
 * @author XueYao
 * 结论：1、keySet的两种方式都会遍历两次，所以效率没有使用EntrySet高
 * 	   2、HashMap输出是无序的，这个无序不是说每次遍历 的结果顺序不一样，而是说插入顺序不一样
 */
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hs = new HashMap<Integer, String>();
		int i = 0;
		hs.put(199, "序号："+201);
		while(i<50) {
			hs.put(i, "序号：" +i);
			i++;
		}
		hs.put(-1, "序号：" +200);
		hs.put(200, "序号："+200);
		
		//遍历方式一：for each遍历HashMap的entrySet，注意这种方式在定义的时候必须写成
		//Map<Integer,String> hs，不能写成Map hs
		/*for (Entry<Integer,String> entry : hs.entrySet() ) {
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
		}*/
		
		//遍历方式二：使用EntrySet的Iterator
		/*Iterator<Entry<Integer, String>> iterator = hs.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
		}*/
		
		//遍历方式三：for each直接使用HashMap的keySet
		/*for (Integer key : hs.keySet()) {
			System.out.println("key:"+key+" value:"+hs.get(key));
		}*/
		
		//遍历方式四：使用keySet的Iterator
		/*Iterator<Integer> iterator = hs.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer)iterator.next();
			System.out.println("key:"+key+" value:"+hs.get(key));
		}*/
		System.out.println("------------排序功能-----------");
		//排序
		HashMapSort hashMapSort = new HashMapSort();
		//hashMapSort.sortHashMap(hs);
		
		hashMapSort.sortHashMapByKey(hs);
	}
	
	
}
