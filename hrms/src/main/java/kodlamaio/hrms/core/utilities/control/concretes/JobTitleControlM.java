package kodlamaio.hrms.core.utilities.control.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.control.abstracts.JobTitleControlS;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleControlM implements JobTitleControlS{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleControlM(JobTitleDao jobTitleDao) {
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
