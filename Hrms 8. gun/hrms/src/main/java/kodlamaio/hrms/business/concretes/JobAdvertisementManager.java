package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) 
	{
		this.jobAdvertisementDao= jobAdvertisementDao;
	}
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İs ilani eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"İs ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActive(true),"Aktif İs ilanları listelendi");
	}

	
	

	@Override
	public DataResult<List<JobAdvertisement>> getByIsAktiveTrueSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "dateOfUpload");
        return new SuccessDataResult<>(this.jobAdvertisementDao.getByIsActiveTrue(sort));
	}

	@Override
	public Result setPassive(int jobAdvertisementId) {
		JobAdvertisement jobAdvertisement =this.jobAdvertisementDao.getById(jobAdvertisementId);
		jobAdvertisement.setActive(false);
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Aktiflik iptal edildi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveAndEmployeer_Id(int employeerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.findByIsActiveAndEmployeer_Id(true, employeerId));
	}

	



	
	
	



	

}
