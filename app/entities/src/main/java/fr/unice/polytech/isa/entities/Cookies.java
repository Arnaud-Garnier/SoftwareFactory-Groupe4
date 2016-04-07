package fr.unice.polytech.isa.entities;

public enum Cookies {
	CASSAGEEE

	CHOCOLALALA("Chocolalala", 1.30),
	DARK_TEMPTATION("Dark Temptation", 1.90),
	SOO_CHOCOLATE("Soo Chocolate", 1.25);

	private String name;
	private double price;

	public double getPrice() { return price; }
	public String getName() { return name; }

	Cookies(String value, double price) {
		this.name = value;
		this.price = price;
	}

}
