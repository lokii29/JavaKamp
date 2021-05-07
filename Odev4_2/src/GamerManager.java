
public class GamerManager extends Gamer implements IGamerManager {

	private boolean a;

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}
	@Override
	public void Mersis(Gamer gamer) {
		if(gamer.getId()>0) {
			this.setA(true);
		}else this.setA(false);
		
	}

	@Override
	public void Add(Gamer gamer) {
		if(this.a ==true) {
			System.out.println("Mersisten onaylandi");
			System.out.println("Oyuncu Eklendi");
		}
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Oyuncu Guncellendi");
		
	}

	@Override
	public void BuyGame(Gamer gamer) {
		System.out.println("Oyun Kutuphaneye Eklendi");
		
	}

	
	

}
