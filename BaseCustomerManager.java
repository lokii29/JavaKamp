
public abstract class BaseCustomerManager implements InterfacesCustomerServices{

	@Override
	public  void Save(Customer customer) {
		System.out.println("Save to db " +customer.getFirstName());
		
	}

}
