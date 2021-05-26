package kodlamaio.hrms.core.utilities.control.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.control.abstracts.CandidatesControlS;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.validator.abstracts.CandidateEmailValidatorS;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;
@Service
public class CandidatesControlM implements CandidatesControlS{
	private CandidateDao candidateDao;
	private CandidateEmailValidatorS candidateEmailValidatorS;
	

	   
    @Autowired
	public CandidatesControlM(CandidateDao candidateDao,CandidateEmailValidatorS candidateEmailValidatorS) {
		super();
		this.candidateDao = candidateDao; 
		this.candidateEmailValidatorS=candidateEmailValidatorS;
		
    }


	@Override
	public Result CandidatesKontrol(Candidates candidates) {
		if(candidates.getBirthDay()==0
	     ||candidates.getEmail().isEmpty()==true
	     ||candidates.getFirstName().isEmpty()==true
	     ||candidates.getLastName().isEmpty()==true
	     ||candidates.getIdentityNumber().isEmpty()==true
	     ||candidates.getPassword().isEmpty()==true) 
		{
		
			return new ErrorResult("Boş alan birakilamaz.");
			
		}else if(candidateDao.existsCandidatesByEmail(candidates.getEmail())==true) 
		{
		   return new ErrorResult("Mail daha önce kullanilmis."); 
		}else if(candidateDao.existsCandidatesByIdentityNumber(candidates.getIdentityNumber())==true) 
		{
			return new ErrorResult("Tc zaten kullanimda."); 
		}else {
			
			return candidateEmailValidatorS.emailCheck(candidates);
			
		}
		
		
	}
	
}
