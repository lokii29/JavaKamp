package kodlamaio.hrms.business.validator.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.validator.abstracts.MernisService;


@Service
public class MernisManager<T> implements MernisService<T> {

	@Override
	public boolean mernisControl(T data) {
		
		return true;
	}

	
}
