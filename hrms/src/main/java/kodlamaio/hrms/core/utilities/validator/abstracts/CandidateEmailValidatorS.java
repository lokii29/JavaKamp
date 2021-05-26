package kodlamaio.hrms.core.utilities.validator.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidateEmailValidatorS {
  public Result emailCheck(Candidates candidate);
}
