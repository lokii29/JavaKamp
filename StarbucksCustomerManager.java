
public class StarbucksCustomerManager extends BaseCustomerManager {

	private PersonCheckServices personCheckServices;
	
	public StarbucksCustomerManager(PersonCheckServices personCheckServices) 
	{
		this.personCheckServices = personCheckServices;
	}
	
	
	@Override
	public  void Save(Customer customer) {
		
		dogrulama(customer);
		System.out.println("Save to db " +customer.getFirstName());
		
	}

	

	private void dogrulama(Customer customer) {
		// TODO Auto-generated method stub
		if(true) {
			
			System.out.println("dogrulandi");
		}
	}


	public PersonCheckServices getPersonCheckServices() {
		return personCheckServices;
	}


	public void setPersonCheckServices(PersonCheckServices personCheckServices) {
		this.personCheckServices = personCheckServices;
	}
}
