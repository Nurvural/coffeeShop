package coffeeShop.Abstract;

import coffeeShop.entities.Customer;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("save" + customer.getFirstName());
		
	}

}
