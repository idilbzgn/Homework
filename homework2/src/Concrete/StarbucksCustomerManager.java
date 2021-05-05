package Concrete;


import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService _customerCheckService;

	public void SturbucksCustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	public void Save(Customer customer){

		try {
			if (_customerCheckService.checkIfRealPerson(customer)) {    
				super.save(customer);
			}else {
				System.out.println("Not a valid person");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}
}
