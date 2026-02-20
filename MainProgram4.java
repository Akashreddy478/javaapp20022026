package app200226core;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.ListIterator;

	public class MainProgram4 {
		public static void main(String[] args) {
			HashMap hashMap = new HashMap();
			hashMap.put(101, "Hello");
			hashMap.put(99, 'x');
			hashMap.put(true, "Hello");
			hashMap.put('e', true);
			hashMap.put(101, "Hello");
			hashMap.put("Hello", 99.99);
			System.out.println("HashMap Elements: " + hashMap);
		}
	

}
