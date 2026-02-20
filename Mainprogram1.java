package app200226core;

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.LinkedList;
	import java.util.TreeSet;
	import java.util.Vector;

	public class Mainprogram1 {
		public static void main(String[] args) {
			HashSet hashSet = new HashSet();
			hashSet.add("Hello");
			hashSet.add(10);
			hashSet.add(10.12);
			hashSet.add("Hi");
			hashSet.add(44);
			hashSet.add('d');
			hashSet.add(true);
			hashSet.add("Hello");
			System.out.println("HashSet Elements: " + hashSet);
			
			LinkedHashSet linkedHashSet = new LinkedHashSet();
			linkedHashSet.add("Hello");
			linkedHashSet.add(10);
			linkedHashSet.add(10.12);
			linkedHashSet.add("Hi");
			linkedHashSet.add(44);
			linkedHashSet.add('d');
			linkedHashSet.add(true);
			linkedHashSet.add("Hello");
			System.out.println("LinkedHashSet Elements: " + linkedHashSet);
			
			TreeSet treeSet = new TreeSet();
			treeSet.add("C");
			treeSet.add("B");
			treeSet.add("A");
			treeSet.add("c");
			treeSet.add("b");
			treeSet.add("a");		
			System.out.println("TreeSet Elements: " + treeSet);
			
			ArrayList arrayList = new ArrayList(); 
			arrayList.add("Hello");
			arrayList.add(10);
			arrayList.add(10.12);
			arrayList.add("Hi");
			arrayList.add(44);
			arrayList.add('d');
			arrayList.add(true);
			arrayList.add("Hello");
			arrayList.add("Hello");

			System.out.println("ArrayList Elements: " + arrayList);
			
			LinkedList linkedList = new LinkedList(); 
			linkedList.add("Hello");
			linkedList.add(10);
			linkedList.add(10.12);
			linkedList.add("Hi");
			linkedList.add(44);
			linkedList.add('d');
			linkedList.add(true);
			linkedList.add("Hello");
			System.out.println("LinkedList Elements: " + linkedList);
			
			Vector vector = new Vector(); 
			vector.add("Hello");
			vector.add(10);
			vector.add(10.12);
			vector.add("Hi");
			vector.add(44);
			vector.add('d');
			vector.add(true);
			vector.add("Hello");
			System.out.println("Vector Elements: " + vector);
		}
	

}
