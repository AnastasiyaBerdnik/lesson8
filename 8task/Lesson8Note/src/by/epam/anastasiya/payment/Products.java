package by.epam.anastasiya.payment;

public class Products {
	private String products;
	private ProductOptions productOptions;
	
	public Products(){
		this ("", null);
	}
	

	public Products (String products, ProductOptions productOptions){
		this.products = products;
		this.productOptions = productOptions;
	}
	
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public ProductOptions getProductOptions() {
		return productOptions;
	}
	
		
	}
	
	





	

