package kodlamaio.hrms.business.validator.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employeers;

public interface EmployeerValidatorService {
	public Result emailValid(Employeers employeer);
	 public Result employeeValid(Employeers employeer);
}
