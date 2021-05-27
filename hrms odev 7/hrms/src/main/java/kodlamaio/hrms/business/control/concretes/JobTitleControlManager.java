package kodlamaio.hrms.business.control.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.control.abstracts.JobTitleControlService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleControlManager implements JobTitleControlService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleControlManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	
	@Override
	public Result JobTitleKontrol(JobTitle jobTitle) {
		if(jobTitle.getJobTitle().isEmpty()==true)
		{
			return new ErrorResult("Boş birakilamaz.");
			
		}else if (jobTitleDao.existsJobTitleByJobTitle(jobTitle.getJobTitle())==true) {
			return new ErrorResult("Firma Pozisyonu zaten var.");
		} else {
			this.jobTitleDao.save(jobTitle);
			return new SuccessResult("Firma Pozisyonu eklendi.");
		}
		
		
	}

}

