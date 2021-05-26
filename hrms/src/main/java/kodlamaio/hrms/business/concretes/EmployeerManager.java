package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeerService;
import kodlamaio.hrms.core.utilities.control.abstracts.EmployeersControlS;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeerDao;
import kodlamaio.hrms.entities.concretes.Employeers;

@Service
public class EmployeerManager implements EmployeerService{

	private EmployeerDao employeerDao;
	private EmployeersControlS employeersControl;
	   
    @Autowired
	public EmployeerManager(EmployeerDao employeerDao,EmployeersControlS employeersControl) {
		super();
		this.employeerDao = employeerDao;
		this.employeersControl= employeersControl;
	}
	
	
	@Override
	public Result add(Employeers employeer) {
		return employeersControl.EmployeersKontrol(employeer);
	}

	@Override
	public DataResult<List<Employeers>> getAll() {
		return new SuccessDataResult<List<Employeers>>
		(this.employeerDao.findAll(),"data listelendi");
	}

}
