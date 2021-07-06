package task1;

public class Products implements Comparable<Products> {
	private int productId;
	private String manufacturerName;
	private String productName;
	private double cost;
	private float ratings;
	private char availability;

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(int productId, String manufacturerName, String productName, double cost, float ratings,
			char availability) {
		this.productId = productId;
		this.manufacturerName = manufacturerName;
		this.productName = productName;
		this.cost = cost;
		this.ratings = ratings;
		this.availability = availability;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public char getAvailability() {
		return availability;
	}

	public void setAvailability(char availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", manufacturerName=" + manufacturerName + ", productName="
				+ productName + ", cost=" + cost + ", ratings=" + ratings + ", availability=" + availability + "]";
	}

	@Override
	public int compareTo(Products o) {
		Integer i1 = this.productId;
		Integer i2 = o.productId;
		return i1.compareTo(i2);
	}

}
