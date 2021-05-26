package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.control.abstracts.JobTitleControlS;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;
	private JobTitleControlS jobTitleControl;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao,JobTitleControlS jobTitleControl) {
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
