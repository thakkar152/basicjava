import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// immutable List
		List<String> countries = List.of("Canada", "India", "USA");

		System.out.println(countries);

		// all below are mutable list. We can pass immutable List below. thats fine.
		// Still it is mutable.

		List<String> countriesArrayList = new ArrayList<String>(countries);
		countriesArrayList.add(2, "Aruba");
		countriesArrayList.add(3, "Aruba");

		List<String> newContries = List.of("West Indies", "Australia");
		List<String> newContries1 = List.of("NewZealand", "Cuba");

		countriesArrayList.addAll(newContries);
		countriesArrayList.addAll(newContries1);

		countriesArrayList.set(3, "Updating Aruba duplication");

		countriesArrayList.remove(2);

		// isRemoved will be false if it does not exist.
		boolean isRemoved = countriesArrayList.remove("Australia");

		for (String country : countriesArrayList) {
			System.out.println(country);
		}

		for (int i = 0; i < countriesArrayList.size(); i++) {
			System.out.println(countriesArrayList.get(i));
		}

		Iterator<String> countriesIterator = countriesArrayList.iterator();

		while (countriesIterator.hasNext()) {
			System.out.println(countriesIterator.next());
		}

		Iterator<String> countriesIteratorRemove = countriesArrayList.iterator();

		while (countriesIteratorRemove.hasNext()) {
			if (countriesIteratorRemove.next().endsWith("tion")) {
				countriesIteratorRemove.remove();
			}
		}

		System.out.println(countriesArrayList);

		// all above opreration on ArrayList is also possible for below linked list or
		// vector.
		List<String> countriesVector = new Vector<String>();
		countriesVector.add("Canada");
		countriesVector.add("India");
		countriesVector.add("USA");

		// System.out.println(countriesVector);

		List<String> countriesLinkedList = new LinkedList<String>();
		countriesLinkedList.add("Canada");
		countriesLinkedList.add("India");
		countriesLinkedList.add("USA");

		// System.out.println(countriesLinkedList);

	}

}
