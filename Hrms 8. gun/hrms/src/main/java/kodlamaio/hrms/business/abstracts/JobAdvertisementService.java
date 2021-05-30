package kodlamaio.hrms.business.abstracts;

import java.util.List;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;


public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>>   getAll();
	
    DataResult<List<JobAdvertisement>> getByIsActive();
    
    Result setPassive(int jobAdvertisementId);
    
    DataResult<List<JobAdvertisement>> getByIsAktiveTrueSorted();
    
    DataResult<List<JobAdvertisement>> findByIsActiveAndEmployeer_Id( int employeerId);
    
   
    

	
	
	
}
