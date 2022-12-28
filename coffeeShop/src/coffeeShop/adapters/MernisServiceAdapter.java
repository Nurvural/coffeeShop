package coffeeShop.adapters;

import java.rmi.RemoteException;

import coffeeShop.Abstract.ICustomerCheckService;
import coffeeShop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getYearOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}	
		return true;
	}
	
}
