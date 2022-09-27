package Maps;

import java.util.HashMap;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "KUSHI");
		hm.put(2,"RRR");
		hm.put(3, "KUSHI");
		hm.put(4, "GABBAR SINGH");
		hm.put(2,"BHEEMLA NAYAK");//If we use duplicate keys that value is going to be store in original key
		hm.put(null,"AAEA");
		System.out.println(hm);
		System.out.println(hm.keySet());//for getting keys
		System.out.println(hm.values());//for getting values
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("GABBAR SINGH"));
		Set<Integer> keys = hm.keySet();
		for(Integer i:keys)
		{
			System.out.println(i);
		}
		for(Integer j:keys)
		{
		System.out.println(j+" "+hm.get(j));
		}

	}

}
