package java8.features.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Items items = new Items("Cloths", 10, 100);
		Items items1 = new Items("Fruits", 100, 5000);
		Items items2 = new Items("Vegetables", 80, 400);
		Items items4 = new Items("Vegetables", 40, 300);
		ArrayList<Items> itemsArrayList = new ArrayList<Items>();
		itemsArrayList.add(items1);
		itemsArrayList.add(items);
		itemsArrayList.add(items2);
		itemsArrayList.add(items4);
		
		
		Map<String, List<Items>> collect = itemsArrayList.stream().collect(Collectors.groupingBy(Items::getName));
	System.out.println(collect);
	}

}
