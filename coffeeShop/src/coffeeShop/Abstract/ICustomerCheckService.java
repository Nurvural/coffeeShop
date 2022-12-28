package coffeeShop.Abstract;

import coffeeShop.entities.Customer;


public interface ICustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
