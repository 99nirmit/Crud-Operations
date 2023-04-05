 package com.beans;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudOperation {

	static ArrayList<String> items = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please Enter an Option: ");
			System.out.println("1. Create Item");
			System.out.println("2. Read Item");
			System.out.println("3. Update Item");
			System.out.println("4. Delte Item");
			System.out.println("5. Quit");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				createItem(scanner);
				break;
				
			case 2:
				readItem(scanner);
				break;
				
			case 3:
				updateItem(scanner);
				break;
				
			case 4:
				deleteItem(scanner);
				break;
				
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}
	}
	
	 static void createItem(Scanner scanner) {
		System.out.println("Enter item name: ");
		String itemName = scanner.next();
		items.add(itemName);
		System.out.println("Item Added");
		
	}

	 static void readItem(Scanner scanner) {
		 System.out.println("Enter item index: ");
		 int itemIndex = scanner.nextInt();
		 if(itemIndex >= 0 && itemIndex < items.size()) {
			 String itemName = items.get(itemIndex);
			 System.out.println("Item Name: " + itemName);
		 }else {
			 System.out.println("Enter valid Index.");
		 }
	}

	static void updateItem(Scanner scanner) {
		System.out.println("Enter item index: ");
		int itemIndex = scanner.nextInt();
		if(itemIndex >= 0 && itemIndex < items.size()) {
			System.out.println("Enter new item name: ");
			String newItemName=scanner.next();
			items.set(itemIndex,newItemName);
			System.out.println("Sucessfully Updated");
		}else {
			System.out.println("Invalid Index");
		}
	}

	 static void deleteItem(Scanner scanner) {
		 System.out.println("Enter item index: ");
		 int itemIndex = scanner.nextInt();
		 if(itemIndex>0 && itemIndex < items.size()) {
			 items.remove(itemIndex);
			 System.out.println("Item deleted");
		 }else {
			 System.out.println("Invalid Index.");
		 }
		}
	
}
