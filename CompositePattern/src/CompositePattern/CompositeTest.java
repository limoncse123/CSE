package CompositePattern;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component hd = new Leaf(4000,"HardDisk");
		Component mouse = new Leaf(400,"Mouse");
		Component ram = new Leaf(3000,"Ram");
		Component cpu = new Leaf(-6000,"CPU");
		Component monitor = new Leaf(10000,"Monitor");
		
		Composite ph = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite computer = new Composite("Computer");
		Composite mb = new Composite("Motherboard");
		
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		//ram.showPrice();
		computer.showPrice();
		//computer.showPrice();
		//ph.removeComponent(mouse);
		//computer.showPrice();
	}

}
