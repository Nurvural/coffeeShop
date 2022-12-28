package coffeeShop;

import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.adapters.MernisServiceAdapter;
import coffeeShop.concrete.StarbucksCustomerManager;
import coffeeShop.entities.Customer;

public class Main {
	
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Nur","Vural", 1998,"4764654"));

	}
	
	
}
