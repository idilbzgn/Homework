import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
	BaseCustomerManager customerManager = new NeroCustomerManager();
	 Customer customer = new Customer(1, "idil", "bezgin", "march","12345678912");
	 customer.setId(1);
	 customer.setFirstName("idil");
	 customer.setLastName("bezgin");
	 customer.setDateOfBirth("march");
	 customer.setNationalityId("12345678912");
	 
	 
	 
	 
	 

	}

}