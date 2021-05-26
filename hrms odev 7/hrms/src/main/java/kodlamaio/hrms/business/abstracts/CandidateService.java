package kodlamaio.hrms.business.abstracts;



import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;



public interface CandidateService {

	Result add(Candidates candidate);
	DataResult<List<Candidates>>   getAll();
}
