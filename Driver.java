public class Driver{
	public static void main(String[] args){
    /*
		SuperArray a = new SuperArray();
		System.out.println("-----Testing Phase 1-----");

		//Testing SuperArray initializing
		System.out.println("\n---Initializing SuperArray---");
		System.out.println("Testing toString(): should return []");
		System.out.println(a.toString());
		System.out.println("\nTesting toStringDebug(): should return [null (x10)]");
		System.out.println(a.toStringDebug());

		//testing size()
		System.out.println("\n\n---Testing size()---");
		System.out.println("Testing size(): should return 0");
		System.out.println(a.size());

		//testing add()
		System.out.println("\n\n---Testing add()---");
		System.out.println("Testing add() while empty: should return true");
		System.out.println(a.add("apple"));
		System.out.println("\nChecking add() and toString(): should return [apple]");
		System.out.println(a);
		a.add("banana");
		System.out.println("\nChecking add() and toString(): should return [apple, banana]");
		System.out.println(a);
		for (int x = 0; x < 9; x++){
			a.add("blank");
		}
		System.out.println("\n---Testing toStringDebug() again: should print [apple, banana, blank (x8)]---");
		System.out.println(a.toStringDebug());
		System.out.println("\n\n---Testing add() while full: should return false---");
		System.out.println(a.add("full"));

		//testing clear()
		System.out.println("\n\n---Testing clear()---");
		System.out.println("Testing clear(): should return []");
		a.clear();
		System.out.println(a);
		System.out.println("\n\n---Testing clear(): Should print [apple, banana, null (x8)]---");
		System.out.println(a.toStringDebug());
		System.out.println("\n---Testing clear() and size(): should return 0---");
		System.out.println(a.size());
		System.out.println("\n---Testing add(\"boop\") after clear(): should return true---");
		System.out.println(a.add("boop"));
		System.out.println("\n---Should print [boop]---");
		System.out.println(a);
		a.clear();

		//testing get()
		System.out.println("\n\n-----Testing get()-----");
		System.out.println("---Testing get() while empty: should return null---");
		System.out.println(a.get(0));
		a.add("burp");
		a.add("ahem");
		a.add("coughdrop");
		System.out.println("\n---Testing get() with indices 0-2 filled: should return values burp, ahem, coughdrop---");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println("\n---Testing get() for out of bounds: should return null---");
		System.out.println(a.get(-1));
		System.out.println(a.get(10));

		//testing set()
		System.out.println("\n\n-----Testing set()-----");
		System.out.println("---Using SuperArray from testing get()---");
		System.out.println(a);
		System.out.println("\n---Testing set(0, \"blue\"): should return burp---");
		System.out.println(a.set(0, "blue"));
		System.out.println("-Should print [blue, ahem, coughdrop]-");
		System.out.println(a);
		System.out.println("\n---Testing set(1, \"fish\"): should return ahem---");
		System.out.println(a.set(1, "fish"));
		System.out.println("-Should print [blue, fish, coughdrop]-");
		System.out.println(a);
		System.out.println("\n---Testing set(2, \"syrup\"): should return coughdrop---");
		System.out.println(a.set(2, "syrup"));
		System.out.println("-Should print [blue, fish, syrup]-");
		System.out.println(a);
		System.out.println("\n\n---Testing the error: using indices that are outside of the domain. Both should return null and print an error message---");
		System.out.println(a.set(-2, "I'm not to be seen"));
		System.out.println(a.set(100, "I'm not supposed to be here..."));
		System.out.println("\n---Using cleared SuperArray---");
		a.clear();
		System.out.println("\n---Testing set(2, \"rock\"): should return null and an error message---");
		System.out.println(a.set(2, "rock"));
		System.out.println("-Should print []-");
		System.out.println(a);


    //testing resize()
    SuperArray b = new SuperArray();
    System.out.println(b.toStringDebug());
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println("\n\n-----Testing resize()-----");
    System.out.println(b.toString());
    System.out.println("\n---Testing resize(): should return [one,two,null x18]");
    b.resize();
    System.out.println(b.toStringDebug());

    //testing contains(), indexOf(target), lastIndexOf(target)
    SuperArray b = new SuperArray();
    System.out.println(b.toStringDebug());
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("one"));
    System.out.println("\n\n-----Testing contains()-----");
    System.out.println(b.toStringDebug());
    System.out.println("\n---Testing contains(\"one\"): should return true");
    System.out.println(b.contains("one"));
    System.out.println("\n---Testing contains(\"three\"): should return false");
    System.out.println(b.contains("three"));
    System.out.println("\n\n-----Testing indexOf(target)-----");
    System.out.println(b.toString());
    System.out.println("\n---Testing contains(\"one\"): should return 0");
    System.out.println(b.indexOf("one"));
    System.out.println("\n---Testing contains(\"three\"): should return -1");
    System.out.println(b.indexOf("three"));
    System.out.println("\n\n-----Testing lastIndexOf(target)-----");
    System.out.println(b.toString());
    System.out.println("\n---Testing lastIndexOf(\"one\"): should return 8");
    System.out.println(b.lastIndexOf("one"));
    System.out.println("\n---Testing lastIndexOF(\"three\"): should return -1");
    System.out.println(b.lastIndexOf("three"));
    */
    SuperArray b = new SuperArray();
    System.out.println(b.add("one"));
    System.out.println(b.add("two"));
    System.out.println(b.add("three"));
    System.out.println(b.add("four"));
    System.out.println(b.add("five"));
    System.out.println(b.add("six"));
    System.out.println(b.add("seven"));
    System.out.println(b.add("eight"));
    System.out.println(b.add("nine"));
    System.out.println(b.add("five"));
    System.out.println(b);
    System.out.println(b.indexOf("five"));
    System.out.println(b.lastIndexOf("five"));
    System.out.println(b.remove(1));
    System.out.println(b);
    //System.out.println(b.remove("two"));
    //System.out.println(b);
	}
}
