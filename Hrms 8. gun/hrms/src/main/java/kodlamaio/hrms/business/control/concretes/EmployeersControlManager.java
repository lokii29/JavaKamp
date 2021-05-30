package kodlamaio.hrms.business.control.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.control.abstracts.EmployeersControlService;
import kodlamaio.hrms.business.validator.abstracts.EmployeerValidatorService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.EmployeerDao;
import kodlamaio.hrms.entities.concretes.Employeers;

@Service
public class EmployeersControlManager implements EmployeersControlService{
	private EmployeerDao employeerDao;
	private EmployeerValidatorService employeersValidatorService;
	   
    @Autowired
	public EmployeersControlManager(EmployeerDao employeerDao,EmployeerValidatorService employeersValidatorService) {
		super();
		this.employeerDao = employeerDao;
		this.employeersValidatorService = employeersValidatorService;
		
	}
	
	@Override
	public Result EmployeersKontrol(Employeers employeers) {
		if (employeers.getCompanyName().isEmpty()==true
		  ||employeers.getEmail().isEmpty()==true
		  ||employeers.getPassword().isEmpty()==true
		  ||employeers.getPhoneNumber().isEmpty()==true
		  ||employeers.getWebAdress().isEmpty()==true
		  ) 
		{
		
			return new ErrorResult("Boş alan birakilamaz.");
			
		} else if (employeerDao.existsEmployeersByEmail(employeers.getEmail())==true)
		{
			return new ErrorResult("Mail zaten kullanimda.");
		}else 
		{
			return employeersValidatorService.emailValid(employeers);
		}
		
		
	}

}
