package CompositePattern;
import java.util.List;
import java.util.ArrayList;
public class Composite implements Component{
	String name;
	List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addComponent(Component com) {
		
		components.add(com);
	}
	
	public void removeComponent(Component com) {
		
		components.remove(com);
	}
	
	@Override
	public void showPrice() {
		
		System.out.println(name);
		for(Component c : components) {
			c.showPrice();
		}
		
	}
}
