package CompositePattern;

public class Leaf implements Component{
	int price;
	String name;
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void showPrice() {

		System.out.println(name + " : " + price);
		
	}
}
