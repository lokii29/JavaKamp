package kodlamaio.hrms.core.utilities.control.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.control.abstracts.EmployeersControlS;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.validator.abstracts.EmployeersValidatorS;
import kodlamaio.hrms.dataAccess.abstracts.EmployeerDao;
import kodlamaio.hrms.entities.concretes.Employeers;

@Service
public class EmployeersControlM implements EmployeersControlS{
	private EmployeerDao employeerDao;
	private EmployeersValidatorS employeersValidatorS;
	   
    @Autowired
	public EmployeersControlM(EmployeerDao employeerDao,EmployeersValidatorS employeersValidatorS) {
		super();
		this.employeerDao = employeerDao;
		this.employeersValidatorS = employeersValidatorS;
		
	}
	
	@Override
	public Result EmployeersKontrol(Employeers employeers) {
		if (employeers.getCompanyName().isEmpty()==true
		  ||employeers.getEmail().isEmpty()==true
		  ||employeers.getPassword().isEmpty()==true
		  ||employeers.getPhoneNumber().isEmpty()==true
		  ||employeers.getWebAdress().isEmpty()==true) 
		{
		
			return new ErrorResult("Boş alan birakilamaz.");
			
		} else if (employeerDao.existsEmployeersByEmail(employeers.getEmail())==true)
		{
			return new ErrorResult("Mail zaten kullanimda.");
		}else 
		{
			return employeersValidatorS.emailValid(employeers);
		}
		
		
	}

}
