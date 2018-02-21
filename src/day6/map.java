package day6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.crypto.MacSpi;

public class map {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		//put添加元素
		map.put("语文", 99);
		map.put("英语", 96);
		map.put("数学", 95);
		map.put("物理", 98);
		map.put("化学", 92);
		System.out.println(map);
		Integer value = map.get("语文");
		System.out.println(value);
		value = map.remove("语文");
		System.out.println(value);
		//获取key
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		for(String key : keySet)
		{
			System.out.println(key);
		}
		//遍历键值对
		Set<Entry<String,Integer>> entryset = map.entrySet();
		for(Entry<String,Integer> e : entryset)
		{
			String key = e.getKey();
			value = e.getValue();
			System.out.println(key+value);
		}
		//遍历值
		Collection<Integer> values = map.values();
		for(Integer v : values)
		{
			System.out.println(v);
		}
		
	}
	
	

}
