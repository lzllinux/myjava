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
		//put���Ԫ��
		map.put("����", 99);
		map.put("Ӣ��", 96);
		map.put("��ѧ", 95);
		map.put("����", 98);
		map.put("��ѧ", 92);
		System.out.println(map);
		Integer value = map.get("����");
		System.out.println(value);
		value = map.remove("����");
		System.out.println(value);
		//��ȡkey
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		for(String key : keySet)
		{
			System.out.println(key);
		}
		//������ֵ��
		Set<Entry<String,Integer>> entryset = map.entrySet();
		for(Entry<String,Integer> e : entryset)
		{
			String key = e.getKey();
			value = e.getValue();
			System.out.println(key+value);
		}
		//����ֵ
		Collection<Integer> values = map.values();
		for(Integer v : values)
		{
			System.out.println(v);
		}
		
	}
	
	

}
