package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		// TODO Auto-generated method stub
		this.category = category;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		// TODO Auto-generated method stub
		this.director = director;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		// TODO Auto-generated method stub
		this.length = length;
	}
	
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		// TODO Auto-generated method stub
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
 	public void setId() {
		id = getNbDigitalVideoDiscs();
		nbDigitalVideoDiscs++;
	}
}
