package app200226core;

	import java.util.ArrayList;
	import java.util.ListIterator;

	public class MainProgram3 {
		public static void main(String[] args) {
			ArrayList arrayList = new ArrayList(); 
			arrayList.add("Hello");
			arrayList.add(10);
			arrayList.add(10.12);
			arrayList.add("Hi");
			arrayList.add(44);
			arrayList.add('d');
			arrayList.add(true);
			arrayList.add("Hello");
			
			ListIterator iterator = arrayList.listIterator();
			
			while (iterator.hasNext()) {
				iterator.next();
			}
			
			while (iterator.hasPrevious()) {
				Object object = iterator.previous();
				
				System.out.println(object);
			}
			
			//ListIterator iterator = arrayList.listIterator();
			/*ListIterator iterator = arrayList.listIterator(3);
			while (iterator.hasNext()) {
				Object object = iterator.next();
				
				System.out.println(object);
			}*/
			
			/*Iterator iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				Object object = iterator.next();
				
				System.out.println(object);
			}*/
			
			/*ArrayList arrayList = new ArrayList(); 
			arrayList.add("Hello");
			arrayList.add(10);
			arrayList.add(10.12);
			arrayList.add("Hi");
			arrayList.add(44);
			arrayList.add('d');
			arrayList.add(true);
			arrayList.add("Hello");
			System.out.println("ArrayList Elements: " + arrayList);
			
			//Object object1 = arrayList.get(1);
			//Integer object1 = (Integer) arrayList.get(1);
			int object1 = (Integer) arrayList.get(1);
			System.out.println(object1);
			//Object object2 = arrayList.get(5);
			//Character object2 = (Character) arrayList.get(5);
			char object2 = (Character) arrayList.get(5);
			System.out.println(object2);*/

			//arrayList.remove("Hello");
			//arrayList.remove(7);
			//arrayList.remove(10);
			//arrayList.remove(new Integer(10));
			/*(Integer i = 10;
			arrayList.remove(i);
			System.out.println("ArrayList Elements: " + arrayList);*/
			
			/*ArrayList arrayList = new ArrayList(); 
			arrayList.add("Hello");
			arrayList.add(10);
			arrayList.add(10.12);
			arrayList.add("Hi");
			arrayList.add(44);
			arrayList.add('d');
			arrayList.add(true);
			arrayList.add("Hello");
			System.out.println("ArrayList Elements: " + arrayList);
			arrayList.add(3, 'x');
			arrayList.set(5, "Bye");
			System.out.println("ArrayList Elements: " + arrayList);*/
		}
	}


