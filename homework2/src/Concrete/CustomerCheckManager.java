package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;


public class CustomerCheckManager {
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
