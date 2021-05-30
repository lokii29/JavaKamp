package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CitiesDao;
import kodlamaio.hrms.entities.concretes.Cities;

@Service
public class CityManager implements CityService  {

	private CitiesDao citiesDao;
	
	@Autowired
	public CityManager(CitiesDao citiesDao) 
	{
		this.citiesDao = citiesDao;
	}
	
	@Override
	public DataResult<List<Cities>> getAll() {
		return new SuccessDataResult<List<Cities>>
		(this.citiesDao.findAll(),"Sehirler listelendi");
	}

}
