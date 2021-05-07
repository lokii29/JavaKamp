
public class CampaignsManager extends Campaigns implements ICampaignsManager {

	

	@Override
	public void Add(Campaigns campaigns) {
		System.out.println("Kampanya Eklendi");
		
	}

	@Override
	public void Delete(Campaigns campaigns) {
		System.out.println("Kampanya Silindi");
		
	}

	@Override
	public void Update(Campaigns campaigns) {
		System.out.println("Kampanya Guncellendi");
		
	}

}
