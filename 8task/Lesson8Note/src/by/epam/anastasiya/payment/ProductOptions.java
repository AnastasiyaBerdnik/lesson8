package by.epam.anastasiya.payment;

public class ProductOptions {
	private String title;
	private double weight;
	private double amount;
	private double  price;
	Currency currency;
	
	public ProductOptions(String title, double weight, double amount, double price, Currency currency ) {
		this.title = title;
		this.weight = weight;
		this.amount = amount;
		this.price = price;
		this.currency = currency;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	
	
	

}
