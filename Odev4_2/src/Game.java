
public class Game {

	 private int id;
	 private String name;
	 private String kategori;
	 private double prices;
	 public Game() {
		 
	 }
	 
	public Game(int id, String name, String kategori, double prices) {
		
		this.id = id;
		this.name = name;
		this.kategori = kategori;
		this.prices = prices;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
}
