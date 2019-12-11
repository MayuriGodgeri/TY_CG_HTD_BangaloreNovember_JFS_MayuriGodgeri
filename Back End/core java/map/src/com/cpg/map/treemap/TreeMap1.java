package com.cpg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
      TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
      t1.put(55,"mayu");
      t1.put(22,"mayu");
      t1.put(39,"kiru");
      t1.put(66,null);
     // t1.put(null,null);---->exception key cannot be null
      Set<Map.Entry<Integer,String>> s1 =t1.entrySet();
      for(Map.Entry<Integer,String> m1:s1)
      {
    	 System.out.println(m1.getValue());
    	 System.out.println(m1.getKey());
    	 System.out.println("---------");
      }
	}
}
