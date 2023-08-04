package IIPC_Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class AscendingOrder {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(60);
		list.add(30);
		list.add(40);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
