package kodlamaio.hrms.business.validator.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.validator.abstracts.CandidateEmailValidatorService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidateEmailValidatorManager implements CandidateEmailValidatorService {
	private CandidateDao candidateDao;
	

	   
    @Autowired
	public CandidateEmailValidatorManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao; 
		
		
    }
	

	@Override
	public Result emailCheck(Candidates candidate) {
		
		this.candidateDao.save(candidate);
		return new SuccessResult("Mernis ten geti Email dogrulandi, kisi eklendi.");
	}
	


}
