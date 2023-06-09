package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.DataConstraintsException;

public class Disc extends Media{
	private int length;
	private String director;
	
	public Disc(String title, String category, String director, int length, float cost) throws DataConstraintsException {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String toString() {
		return String.format("Disc - %s - %s - %s - %d: %.2f$", this.getTitle(), this.getCategory(), 
							  this.getDirector(), this.getLength(), this.getCost());
	}
}
