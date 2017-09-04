package datastructure;

import databases.ConnectDB;
import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("Chocolate");
		arrayList.add(1, "Black Forrest");
		arrayList.add("Red Velvet");
		arrayList.add("Vanilla");

		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(arrayList.size()-1));
		arrayList.remove("Vanilla");
		System.out.println(arrayList.get(arrayList.size()-1));

		System.out.println();

		for(Object s: arrayList){
			System.out.println(s);
		}

		System.out.println();

		Iterator it = arrayList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


		ConnectDB connectDB = new ConnectDB();


		connectDB.InsertDataFromArrayListToMySql(arrayList, "Cake", "Flavors");
		connectDB.readDataBase("Cake", "Flavors");



	}

}
