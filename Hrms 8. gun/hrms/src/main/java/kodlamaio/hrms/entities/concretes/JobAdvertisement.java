package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisement")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdvertisement"})
public class JobAdvertisement {
 	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "id")
	private int id;
	
	@Column( name = "job_description")
	private String jobDescription;
	
	@Column( name = "min_salary")
	private int minSalary;
	
	@Column( name = "max_salary")
	private int maxSalary;
	
	@Column( name = "number_of_open_positions")
	private int numberOfOpenPositions;
	
	@Column( name = "position_activity")
	private boolean isActive;
	
	@Column( name = "date_of_upload")
	private LocalDateTime dateOfUpload; 
	
	@ManyToOne
	@JoinColumn(name="employeer_id")
	private Employeers employeer;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private Cities city;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobTitle jobTitle;
	
	
	
	
}
