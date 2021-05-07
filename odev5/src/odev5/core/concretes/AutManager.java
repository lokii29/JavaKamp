package odev5.core.concretes;

import odev5.core.abstracts.AutService;

public class AutManager implements AutService {

	@Override
	public void send(String eMail) {
		AutCode code = new AutCode();
		
		System.out.println("Dogrulama E postasý gönderildi" + eMail + code.randomSayi());
		
	}

	@Override
	public void tiklama() {
		System.out.println("Uyelik tamamlandi");
		
	}

	@Override
	public void googleKayit() {
		System.out.println("google ile kaydoldu.");
		
	}

	
}
