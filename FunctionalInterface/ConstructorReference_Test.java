package FunctionalInterface;

import java.util.function.Supplier;

public class ConstructorReference_Test {
	
	public static void main(String[] args) {
		Supplier<Item> supplierItem =  Item::new;
		System.out.println(supplierItem.get());
		Item item= supplierItem.get();
		item.setItemId(101);
		item.setCost(555.0555f);
		item.setName("phone");
		System.out.println(item);
		
	}

}
