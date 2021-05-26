package kodlamaio.hrms.core.utilities.validator.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.validator.abstracts.EmployeersValidatorS;
import kodlamaio.hrms.dataAccess.abstracts.EmployeerDao;
import kodlamaio.hrms.entities.concretes.Employeers;

@Service
public class EmployeersValidatorM implements EmployeersValidatorS{

	private EmployeerDao employeerDao;
	   
    @Autowired
	public EmployeersValidatorM(EmployeerDao employeerDao) {
		super();
		this.employeerDao = employeerDao;
	}
	@Override
	public Result emailValid(Employeers employeer) {
		System.out.print("Email dogrulandi");
		this.employeerDao.save(employeer);
		return new SuccessResult("Firma eklendi");
	}

	@Override
	public Result employeeValid(Employeers employeer) {
		System.out.print(" dogrulandi");
		this.employeerDao.save(employeer);
		return new SuccessResult("Firma eklendi");
	}



}
