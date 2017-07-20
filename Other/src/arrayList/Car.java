package arrayList;

public class Car {

	private String make;
	private String model;
	private int year;
	private String license;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public void print() {
		System.out.println(getMake() + " " + getModel() + " " + getYear() + " " + getLicense());
	}

}
