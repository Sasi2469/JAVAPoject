package qa.userdefined.map;

public class Products {

	
	int productId;
	
	public int getProductId() {
		return productId;
	}


	public String getProductName() {
		return productName;
	}


	public String getProductPrice() {
		return productPrice;
	}


 String productName;
	
	 String productPrice ;
	
	
	public Products(int productId, String productNmae, String productPrice) {
		
		this.productId = productId;
		this.productName= productNmae;
		this.productPrice = productPrice;
		
	}
	
	
}
