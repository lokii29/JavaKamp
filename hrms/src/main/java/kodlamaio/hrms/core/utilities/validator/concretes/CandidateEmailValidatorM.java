package kodlamaio.hrms.core.utilities.validator.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.validator.abstracts.CandidateEmailValidatorS;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;



@Service
public class CandidateEmailValidatorM implements CandidateEmailValidatorS {
	private CandidateDao candidateDao;
	

	   
    @Autowired
	public CandidateEmailValidatorM(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao; 
		
		
    }
	

	@Override
	public Result emailCheck(Candidates candidate) {
		
		this.candidateDao.save(candidate);
		return new SuccessResult("Email dogrulandi, kisi eklendi.");
	}
	


}
