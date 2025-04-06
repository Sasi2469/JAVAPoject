package qa.userdefined.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProductDetails {

	
	public static void details(int productId) {
		
	int[] ids = {7384,83278,92739};
	
	String[] names = {"iphone","bat","washing machine"};
	
	String[] prices = {"7000Rs", "2344Rs", "34254Rs"};

	Map<Integer,Products> productList = new LinkedHashMap();
	Products p;
	
		for (int i = 0; i < ids.length; i++) {
			
			productList.put(ids[i],p=new Products(ids[i], names[i], prices[i]));
			
			
		}
	
	
		
	Products products = productList.get(productId);
		System.out.println(products.productId+" "+ products.productName+ " "+ products.productPrice);
//	Set<Entry<Integer,Products>> entrySet	= productList.entrySet();
//	
//	for (Entry<Integer, Products> entry : entrySet) {
////		System.out.println(entry.getKey());
//   Products value = entry.getValue();
////		System.out.println(entry.getValue().getProductId()+" "+entry.getValue().getProductName()+"  "+entry.getValue().getProductPrice());
//	
//	System.out.println(entry.getValue().productId+" "+entry.getValue().productName+"  "+entry.getValue().productPrice);

//	}
	
	}
	
	public static void main(String[] args) {
		details(7384);
		details(83278);
		details(92739);
		details(749795);

	}
}
