package kodlamaio.hrms.business.control.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.control.abstracts.CandidateControlService;
import kodlamaio.hrms.business.validator.abstracts.CandidateEmailValidatorService;
import kodlamaio.hrms.business.validator.abstracts.MernisService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidatesControlManager implements CandidateControlService{
	private CandidateDao candidateDao;
	private CandidateEmailValidatorService candidateEmailValidatorService;
	private MernisService mernisService;
	

	   
    @Autowired
	public CandidatesControlManager(CandidateDao candidateDao,
			CandidateEmailValidatorService candidateEmailValidatorService,
			MernisService mernisService) {
		super();
		this.candidateDao = candidateDao; 
		this.candidateEmailValidatorService=candidateEmailValidatorService;
		this.mernisService =mernisService;
		
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
			
		}else if(mernisService.mernisControl(candidates)==false) {
			
			return new ErrorResult("Mernis ten gecemedi");
		}else if(candidateDao.existsCandidatesByEmail(candidates.getEmail())==true) 
		{
		   return new ErrorResult("Mail daha önce kullanilmis."); 
		}else if(candidateDao.existsCandidatesByIdentityNumber(candidates.getIdentityNumber())==true) 
		{
			return new ErrorResult("Tc zaten kullanimda."); 
		}else {
			
			return candidateEmailValidatorService.emailCheck(candidates);
			
		}
		
		
	}
	
}