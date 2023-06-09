package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.exception.DataConstraintsException;
import hust.soict.dsai.aims.exception.LimitExceededException;
import hust.soict.dsai.aims.media.*;

public class CartTest {

	public static void main(String[] args) throws LimitExceededException, DataConstraintsException {
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		//Test the print method
		cart.print();
		//Test the search method here
		System.out.println(cart.search(2));
		System.out.println(cart.search("Finding Nemo"));
	}

}
