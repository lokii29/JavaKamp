
public class Main {

	public static void main(String[] args) {
	
   Customer customer = new Customer(1, "Ali", "Veli", "135645");
   BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
   baseCustomerManager.Save(customer);
   
  
  
	
	
	}

}
