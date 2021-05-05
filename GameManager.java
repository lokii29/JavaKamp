
public class GameManager extends Game implements IGameManager{

	

	@Override
	public void Add(Game game) {
		System.out.println(game.getName()+" Eklendi");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getName()+" Silindi");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getName()+" Guncellendi");
		
	}

	@Override
	public void ShellGame(Game game) {
		System.out.println(game.getName()+" Satildi");
		
	}

	
}
