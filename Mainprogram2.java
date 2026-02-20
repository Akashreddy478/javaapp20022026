package app200226core;

import java.util.HashSet;
import java.util.Iterator;

public class Mainprogram2 {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("Hello");
		hashSet.add(10);
		hashSet.add(10.12);
		hashSet.add("Hi");
		hashSet.add(44);
		hashSet.add('d');
		hashSet.add(true);
		System.out.println("HashSet Elements: " + hashSet);
		
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			
			if (object instanceof String) {
				iterator.remove();
			}
		}
		
		System.out.println("HashSet Elements: " + hashSet);
		
		/*HashSet hashSet = new HashSet();
		hashSet.add("Hello");
		hashSet.add(10);
		hashSet.add(10.12);
		hashSet.add("Hi");
		hashSet.add(44);
		hashSet.add('d');
		hashSet.add(true);
		
		for (Object object : hashSet) {
			if (object instanceof Integer) {
				//Integer i = (Integer) object;
				int i = (Integer) object;
				System.out.println("Integer: " + i);
			} else if (object instanceof Double) {
				//Double d = (Double) object;
				double d = (Double) object;
				System.out.println("Double: " + d);
			} else if (object instanceof Character) {
				Character c = (Character) object;
				System.out.println("Character: " + c);
			} else if (object instanceof Boolean) {
				Boolean b = (Boolean) object;
				System.out.println("Boolean: " + b);
			} else if (object instanceof String) {
				String s = (String) object;
				System.out.println("String: " + s);
			}
		}*/
		
		/*Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			
			if (object instanceof Integer) {
				//Integer i = (Integer) object;
				int i = (Integer) object;
				System.out.println("Integer: " + i);
			} else if (object instanceof Double) {
				//Double d = (Double) object;
				double d = (Double) object;
				System.out.println("Double: " + d);
			} else if (object instanceof Character) {
				Character c = (Character) object;
				System.out.println("Character: " + c);
			} else if (object instanceof Boolean) {
				Boolean b = (Boolean) object;
				System.out.println("Boolean: " + b);
			} else if (object instanceof String) {
				String s = (String) object;
				System.out.println("String: " + s);
			}
		}*/
		
		/*HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(35);
		hashSet.add(10);
		hashSet.add(454);
		hashSet.add(104);
		hashSet.add(44);
		
		for (Integer object : hashSet) {
			System.out.println(object);
		}*/
		
		/*Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			//Object object = iterator.next();
			//Integer object = (Integer) iterator.next();
			Integer object = iterator.next();
			
			System.out.println(object);
		}*/
		
		/*HashSet hashSet = new HashSet();
		hashSet.add("Hello");
		hashSet.add(10);
		hashSet.add(10.12);
		hashSet.add("Hi");
		hashSet.add(44);
		hashSet.add('d');
		hashSet.add(true);
		
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			
			System.out.println(object);
		}*/
		
		/*HashSet hashSet = new HashSet();
		hashSet.add("Hello");
		hashSet.add(10);
		hashSet.add(10.12);
		hashSet.add("Hi");
		hashSet.add(44);
		hashSet.add('d');
		hashSet.add(true);
		System.out.println("HashSet Elements: " + hashSet);
		
		boolean isFound = hashSet.contains("Hi");
		System.out.println(isFound);
		isFound = hashSet.contains(10);
		System.out.println(isFound);
		isFound = hashSet.contains('x');
		System.out.println(isFound);
		isFound = hashSet.contains('d');
		System.out.println(isFound);*/
		
		/*HashSet hashSet = new HashSet();
		System.out.println("HashSet Elements: " + hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		hashSet.add("Hello");
		hashSet.add(10);
		hashSet.add(10.12);
		hashSet.add("Hi");
		hashSet.add(44);
		hashSet.add('d');
		hashSet.add(true);
		System.out.println("HashSet Elements: " + hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		hashSet.add(8989);
		hashSet.add('x');
		System.out.println("HashSet Elements: " + hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		hashSet.add('r');
		System.out.println("HashSet Elements: " + hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		hashSet.remove("Hello");
		hashSet.remove(44);
		hashSet.remove('e');
		System.out.println("HashSet Elements: " + hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		hashSet.clear();
		System.out.println("HashSet Elements: " + hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());*/
				
		
		/*HashSet hashSet = new HashSet();
		System.out.println(hashSet.add("Hello"));
		hashSet.add(10);
		hashSet.add(10.12);
		hashSet.add("Hi");
		hashSet.add(44);
		hashSet.add('d');
		hashSet.add(true);
		System.out.println(hashSet.add("Hello"));
				
		ArrayList arrayList = new ArrayList(); 
		System.out.println(arrayList.add("Hello"));
		arrayList.add(10);
		arrayList.add(10.12);
		arrayList.add("Hi");
		arrayList.add(44);
		arrayList.add('d');
		arrayList.add(true);
		System.out.println(arrayList.add("Hello"));*/
	}
}


