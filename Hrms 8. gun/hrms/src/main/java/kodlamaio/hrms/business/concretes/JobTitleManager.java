package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.business.control.abstracts.JobTitleControlService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;
	private JobTitleControlService jobTitleControl;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao,JobTitleControlService jobTitleControl) {
		super();
		this.jobTitleDao = jobTitleDao;
		this.jobTitleControl=jobTitleControl;
	}
	
	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

	@Override
	public Result add(JobTitle jobTitle) {
		
		return jobTitleControl.JobTitleKontrol(jobTitle);
	}

}
