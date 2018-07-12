package by.epam.anastasiya.payment;

import java.util.ArrayList;
import java.util.List;


public class ProductsAr {
	private List <Products> product = new ArrayList <Products> (); //generic - параметризация родовые типы

	public ProductsAr() {
		}
	
	public List <Products> getProducts(){
		return product;
	}

	public void  add (Products products) {
		product.add(products);
	}

	
	public Products findBySubj (String subj) {
		for (Products products: product) {
			if (products.getProducts().equals(subj)) {
				return products;
			}
		}
		return null;
	}

}
