package by.epam.anastasiya.payment;
import java.util.List;

public class Cart {
	
	public static void main (String [] args) {
		ProductsAr myProductsAr =new ProductsAr();
		Products p1 = new Products ("Samsung", new ProductOptions("TV", 7, 5 , 330, Currency.RYB));
		myProductsAr.add(p1);
		myProductsAr.add(new Products ("Sony", new ProductOptions("Camera", 4, 7 , 9999, Currency.RYB)));
		Products findProducts = myProductsAr.findBySubj("subj2");
		if (findProducts != null) {
			print(findProducts);
		}
		print (myProductsAr);
		}

	public static void print(ProductsAr productsAr) {
		
		List <Products> printProduct = productsAr.getProducts();
		System.out.println ("Products: ");
		for (int i = 0; i<printProduct.size(); i++){
			Products products = printProduct.get(i);
			print(products);
		}	
	}

	public static void print (Products products) {
		System.out.println ("Note: " +  products.getProducts() + "[" + products.getProductOptions().getTitle() + "/" + products.getProductOptions().getWeight() + "kg/" +products.getProductOptions().getAmount()+ "/" +  products.getProductOptions().getPrice() +" "+ products.getProductOptions().getCurrency() + "]");
	
}
}
