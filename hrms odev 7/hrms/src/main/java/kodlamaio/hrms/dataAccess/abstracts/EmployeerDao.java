package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.hrms.entities.concretes.Employeers;

public interface EmployeerDao extends JpaRepository<Employeers, Integer> {
	 boolean existsEmployeersByEmail(String email);
}
