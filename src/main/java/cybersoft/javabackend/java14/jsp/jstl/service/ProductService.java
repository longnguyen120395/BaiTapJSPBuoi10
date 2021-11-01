package cybersoft.javabackend.java14.jsp.jstl.service;

import java.util.ArrayList;
import java.util.List;

import cybersoft.javabackend.java14.jsp.jstl.model.Product;

public class ProductService {
	private List<Product> listProduct; 
	
	public ProductService() {
		listProduct = new ArrayList<>();
	}
	 public boolean addProduct(Product product) {
		// check null
		 if ( product == null){
			 return false;
		 }
		 
		   //check duplicated
		 for ( Product p : listProduct) {
			 if ( p.getName().equals(product.getName())){
				 return false;
			 }
			 
		 }
		 	return listProduct.add(product);
	 }
	 // liệt kê ra các product có trong listProduct
	 public List<Product> getProduct() {
		 return this.listProduct;
	 }
}
