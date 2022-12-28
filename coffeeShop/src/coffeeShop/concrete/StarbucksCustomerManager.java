package coffeeShop.concrete;

import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.Abstract.ICustomerCheckService;
import coffeeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		System.out.println("Not a valid person");
	}
}
