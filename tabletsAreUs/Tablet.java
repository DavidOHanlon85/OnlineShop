/**
 * 
 */
package tabletsAreUs;

/**
 * This is the Tablet class - contains required details about a tablet and
 * relevant methods (getters and setters included)
 */
public class Tablet {

	// Instance variables

	private String manufacturer;
	private String model;
	private double price;
	private boolean android;
	private double size;
	private String notes;

	// Constructors

	/**
	 * This is the default constructor
	 */

	Tablet() {

	}

	/**
	 * This is the constructor with args
	 * 
	 * @param manufacturer
	 * @param model
	 * @param price
	 * @param android
	 * @param size
	 * @param notes
	 */
	public Tablet(String manufacturer, String model, double price, boolean android, double size, String notes) {

		this.setManufacturer(manufacturer);
		this.setModel(model);
		this.setPrice(price);
		this.setAndroid(android);
		this.setSize(size);
		this.setNotes(notes);
	}

	// Getter and setters

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the android
	 */
	public boolean isAndroid() {
		return android;
	}

	/**
	 * @param android the android to set
	 */
	public void setAndroid(boolean android) {
		this.android = android;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		if (size < 5 || size > 21) {
			this.size = 0;
			System.out.println("This size is invalid. It has been defaulted to zero");
		} else {
			this.size = size;
		}
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		
	String truncatedMessage = "";
	
		if (notes.length() > 250) {
			for (int i = 0; i < 250; i++) {
				truncatedMessage += notes.charAt(i);
			}
			this.notes = truncatedMessage;
			System.out.println("Your message has been truncated to 250 characters");
		} else {
			this.notes = notes;
		}
	}

	// Methods

	public void allDetails() {
		System.out.println();
		System.out.println("Tablet details __________________\n");
		System.out.println("Manufacturer : " + this.getManufacturer());
		System.out.println("Model : " + this.getModel());
		System.out.println("Price : " + this.getPrice());
		System.out.println("Android : " + this.isAndroid());
		System.out.println("Size : " + this.getSize());
		System.out.println("Notes : " + this.getNotes());
	}

}
