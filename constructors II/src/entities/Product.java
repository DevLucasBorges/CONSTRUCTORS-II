package entities;

import java.util.Scanner;

public class Product {

	public String name1;
	public double price1;
	public int quantity1;
	
	public Product(String name, double price, int quantity) {
		Scanner sc = new Scanner(System.in);
	this.name1 = name;
	this.price1 = price;
	this.quantity1 = quantity;
	
	System.out.println("Enter product data: ");
	System.out.print("Name: ");
	String name1 = sc.nextLine();
	System.out.print("Price: ");
	double price1 = sc.nextDouble();
	System.out.print("Quantity in stock: ");
	int quantity1 = sc.nextInt();
	Product product = new Product(name1, price1, quantity1);
	}
}