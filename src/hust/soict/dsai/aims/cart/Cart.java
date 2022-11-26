package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0; 
	
	// Get Number of List DVD
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void setQtyOrdered(int n) {
		qtyOrdered += n;
	}
	
	//	Add 1 DVD to List Card
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.getQtyOrdered() != 20) {
			itemsOrdered[this.getQtyOrdered()] = disc;
			setQtyOrdered(1);
			System.out.println("The disc has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	
	// Add list N DVD to list Card	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int n = dvdList.length;
		if(n == 0 || (n + this.getQtyOrdered()) >= 20) {
			System.out.println("The cart is almost full");
			return;
		}
		else {
			for(int i = 0; i < n; i++) {
				addDigitalVideoDisc(dvdList[i]);
			}
			System.out.println("The disc has been added");
		}
	}
	
	// Add 2 DVD to List Card	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(this.getQtyOrdered() >= 19) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[this.getQtyOrdered()] = dvd1;
			setQtyOrdered(1);
			itemsOrdered[this.getQtyOrdered()] = dvd2;
			setQtyOrdered(1);
			System.out.println("The disc has been added");
		}
	}
	
	
	// Remove DVD of Card	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].getTitle() == disc.getTitle()) {
				for(int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				i--;
				setQtyOrdered(-1);
				System.out.println("The disc has been removed");
			}
		}
	}
	
	//	Total Cost of Card
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	// Search by ID	
	public boolean search(int id) {
		int n = getQtyOrdered();
		for(int i = 0; i < n; i++) {
			if(itemsOrdered[i].getId() == id) {
				return true;
			}
		}
		return false;
	}
	// Search by Title
	public boolean search(String title) {
		int n = getQtyOrdered();
		for(int i = 0; i < n; i++) {
			if(itemsOrdered[i].getTitle() == title) {
				return true;
			}
		}
		return false;
	}
	// Print Cart
	public void printCart() {
		System.out.println("***********************CART***********************");
		int n = getQtyOrdered();
		for(int i = 0; i < n; i++) {
			System.out.println((i+1) + ".DVD - " + itemsOrdered[i].getTitle() + " - " + 
					itemsOrdered[i].getCategory() + " - " + 
					itemsOrdered[i].getTitle() + " - " + 
					itemsOrdered[i].getDirector() + " - " + 
					itemsOrdered[i].getLength() + " : " + 
					itemsOrdered[i].getCost());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
}
