package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.control.abstracts.CandidateControlService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;



@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private CandidateControlService candidatesControl;

	   
    @Autowired
	public CandidateManager(CandidateDao candidateDao,CandidateControlService candidatesControl) {
		super();
		this.candidateDao = candidateDao;
		this.candidatesControl = candidatesControl;
		
	}
	
	
	@Override
	public Result add(Candidates candidate) {
		
		
			return candidatesControl.CandidatesKontrol(candidate);
		
	}


	@Override
	public DataResult<List<Candidates>> getAll() {
		
		return new SuccessDataResult<List<Candidates>>
		(this.candidateDao.findAll(),"data listelendi");
	}

}
