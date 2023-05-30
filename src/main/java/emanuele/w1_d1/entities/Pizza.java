package emanuele.w1_d1.entities;

public abstract class Pizza {
	
	String pizza = "";
	
	public String pizzaName() {
		return pizza;
	};
	
	public abstract double price();
}
