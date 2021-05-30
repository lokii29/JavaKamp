package kodlamaio.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;
	@Autowired
     public JobAdvertisementController(JobAdvertisementService jobAdvertisementService)
     {
 	  this.jobAdvertisementService=jobAdvertisementService;
     }
  
	
	@PostMapping("/add")
     public Result add(@RequestBody JobAdvertisement jobAdvertisement) 
     {
	  return jobAdvertisementService.add(jobAdvertisement);
     }
  
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){		
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getallactive")
	public DataResult<List<JobAdvertisement>> getByIsActive(){
		
		return this.jobAdvertisementService.getByIsActive();
	}
	
	@GetMapping("/setpassive")
	public Result setPassive(@RequestParam int jobAdvertisementId) {
		return this.jobAdvertisementService.setPassive(jobAdvertisementId);
	}
	
	@GetMapping("/getbysorteddate")
	public DataResult<List<JobAdvertisement>> getByIsAktiveTrueSorted() {
		return this.jobAdvertisementService.getByIsAktiveTrueSorted();
	}
	
	@GetMapping("/getbyEmployerJobAdvertisement")
	public DataResult<List<JobAdvertisement>> findByIsActiveAndEmployeers_Id(int employeerId){
		
		return this.jobAdvertisementService.findByIsActiveAndEmployeer_Id(employeerId);
	}
	
	
	
	
	
}
