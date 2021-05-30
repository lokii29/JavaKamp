package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
  List<JobAdvertisement> getByIsActive(boolean active);
  
  
  List<JobAdvertisement> getByIsActiveTrue(Sort sort);
  
  List<JobAdvertisement> findByIsActiveAndEmployeer_Id(boolean isActive, int employeerId);
}
