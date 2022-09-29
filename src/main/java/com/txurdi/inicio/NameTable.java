package com.txurdi.inicio;

import java.util.ArrayList;

public class NameTable {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final   String TAB_20 = "------------------";
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
//		    System.out.println(cars);

		ArrayList<String> model = new ArrayList<String>();
		model.add("Volvo");
		model.add("BMW");
		model.add("Ford");
		model.add("Mazda");
		// System.out.println(model);
		System.out.printf("%-20s %-20s %n","Cars","  Model ");
		System.out.printf("%-20s %-20s ",TAB_20,TAB_20);
		int index = 0;
		
		for (String car : cars) {
			System.out.printf(" %-20s%s%n ", car, model.get(index));
			
			index++;
		}

	}

}
