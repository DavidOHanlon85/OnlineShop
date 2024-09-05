/**
 * 
 */
package tabletsAreUs;

import java.util.ArrayList;

/**
 * This is the test driver for the tablet class
 */
public class TabletDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// simulating a few tablets
		Tablet t1 = new Tablet("Apple", "iPad", 338.94, false, 10.2,
				"10.2 inch Retina display A10 Fusion chip Up to 10 hours of battery life");
		Tablet t2 = new Tablet("Apple", "iPad Air", 449.00, false, 10.5,
				"10.5 inch 10.5-inch Retina display with ProMotion, True Tone and wide colour, Up to 20 hours of battery life ");
		Tablet t3 = new Tablet("Google", "Fire", 79.99, true, 8, "8 inch display 10 hours of battery life");
		Tablet t4 = new Tablet("Samsung", "Galazy Tab", 180.00, true, 10.1,
				"10.1 inch  Entertainment for All: Designed with the whole family in mind, the Galaxy Tab A has what it takes to keep everyone happy. 5 hours battery.  ");
		Tablet t5 = new Tablet("Vankyo", "MatrixPad", 69.99, true, 7,
				"7-inch display Full-Featured Android Tablet with Eye Care for Kids Up to 4 hours of battery life");
		
		t1.allDetails();
		t2.allDetails();
		t3.allDetails();
		t4.allDetails();
		t5.allDetails();
		
		// Create Array of Tablets
		
		Tablet[] tablets = new Tablet[] {t1, t2, t3, t4, t5};
		
		// All screens > 10 inches
		
		double screenSize = 10;
		
		screenSizeSearch(tablets, screenSize);
		
		// All Apple products
		
		String brand = "Apple";
		
		allTabletsOfBrandSearch(tablets, brand);
		
		// All Android products
		
		isItAnAndroid(tablets);
		
		// Search Keyword
		
		System.out.println();
		String keyword = "Eye";
		
		keywordSearch(tablets, keyword);
		
		ArrayList<Tablet> tabletsAL = new ArrayList<Tablet>();
		tabletsAL.add(t1);
		tabletsAL.add(t2);
		tabletsAL.add(t3);
		tabletsAL.add(t4);
		tabletsAL.add(t5);
		
		System.out.println();
		String keyword2 = "Eye";
		
		keywordSearchWithArrayList(tabletsAL, keyword2);
		
	}

	/**
	 * This method uses an array list and the .contains method to make the search more in depth
	 * @param tabletsAL
	 * @param keyword2
	 */
	public static void keywordSearchWithArrayList(ArrayList<Tablet> tabletsAL, String keyword2) {
		System.out.println("Keyword Search using ArrayList");
		for (Tablet t: tabletsAL) {
			if(t.getManufacturer().contains(keyword2) || t.getModel().contains(keyword2) || t.getNotes().contains(keyword2)) {
				t.allDetails();
			}
		}
	}

	/**
	 * 
	 * This method search for a keyword (case sensitive) and outputs the relevant tablets details to screen
	 * @param tablets
	 * @param keyword
	 */
	public static void keywordSearch(Tablet[] tablets, String keyword) {
		System.out.println("Keyword search");
		for (Tablet t : tablets) {
			if (t.getModel().contains(keyword) || t.getManufacturer().contains(keyword) || t.getModel().contains(keyword) || t.getNotes().contains(keyword)) {
				t.allDetails();
			}
		}
	}

	/**
	 * This method outputs all details of Android Products to console
	 * @param tablets
	 */
	public static void isItAnAndroid(Tablet[] tablets) {
		System.out.println("All Android products");
		for (Tablet t : tablets) {
			if (t.isAndroid()) {
				t.allDetails();
			}
		}
	}

	/**
	 * This method outputs all tablets of desired brand to console
	 * 
	 * @param tablets
	 * @param brand
	 */
	public static void allTabletsOfBrandSearch(Tablet[] tablets, String brand) {
		System.out.println("All " + brand + " products");
		for (Tablet t : tablets) {
			if (t.getManufacturer().equalsIgnoreCase(brand))
				t.allDetails();
			System.out.println();
		}
	}

	/**
	 * 
	 * This method outputs to console all tablets with a screen size greater than that enter
	 * @param tablets
	 * @param screenSize
	 */
	public static void screenSizeSearch(Tablet[] tablets, double screenSize) {
		System.out.println("All screen sizes bigger than " + screenSize + " inches:");
		for (Tablet t : tablets) {
			if(t.getSize() > screenSize) {
				System.out.println(t.getModel());
			}
		}
	}

}
