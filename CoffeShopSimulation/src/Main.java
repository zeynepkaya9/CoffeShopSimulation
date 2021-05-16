import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(0,"zeynep","Kaya",LocalDate.now(),"325");
		Customer customer2 = new Customer(1,"ahmet","göksu",LocalDate.now(),"783");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(customer2);
		customerManager.save(customer1);
	}

}
