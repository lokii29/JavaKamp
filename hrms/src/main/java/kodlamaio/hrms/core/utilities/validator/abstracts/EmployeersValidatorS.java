package kodlamaio.hrms.core.utilities.validator.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employeers;

public interface EmployeersValidatorS {
 public Result emailValid(Employeers employeer);
 public Result employeeValid(Employeers employeer);
 
}
