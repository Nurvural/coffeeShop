package coffeeShop.concrete;

import coffeeShop.Abstract.ICustomerCheckService;
import coffeeShop.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
	 
		
		return true;
	}

}
