package kodlamaio.hrms.business.validator.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidateEmailValidatorService {
	 public Result emailCheck(Candidates candidate);
}
