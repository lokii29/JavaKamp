
public class Main {

	public static void main(String[] args) {
		Game pubg = new Game();
		pubg.setId(5);
		pubg.setKategori("savas");
		pubg.setName("Pubg");
		pubg.setPrices(200);
		GameManager gameManager = new GameManager();
		gameManager.Add(pubg);
		gameManager.Delete(pubg);
		gameManager.Update(pubg);
		gameManager.ShellGame(pubg);
		
		Gamer ahmet = new Gamer();
		ahmet.setId(1);
		ahmet.setFirstName("ahmet");
		ahmet.setLastName("mehmet");
		ahmet.setBirthday(1996);
		ahmet.setKimlikNo("123456");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.Add(ahmet);
		gamerManager.BuyGame(ahmet);
		gamerManager.Delete(ahmet);
		gamerManager.Mersis(ahmet);
		gamerManager.Update(ahmet);
		
		Campaigns campaigns = new Campaigns();
		campaigns.setId(1);
		campaigns.setName("Bahar Indirimi");
		campaigns.setIndirimYuzdesi(20);
		
		CampaignsManager campaignsManager = new CampaignsManager();
		campaignsManager.Add(campaigns);
		campaignsManager.Delete(campaigns);
		campaignsManager.Update(campaignsManager);
		
		
		
		
		
		
		
		
		
		
	}

}
