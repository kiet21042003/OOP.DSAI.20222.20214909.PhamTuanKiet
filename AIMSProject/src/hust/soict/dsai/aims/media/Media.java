package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	public Media(String title, String category, float cost) {
		this.id = ++nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public Media(String title) {
		this.id = ++nbMedia;
		this.title = title;
	}
	
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Media) {
			Media O = (Media)o;
			return this.title.equals(O.getTitle());
		}
		return false;		
	}
	
	public String toString() {
		return String.format("Media - %s - %s: %.2f$", this.getTitle(), this.getCategory(), this.getCost());
	}
}