
public class CannibalCow {
	private String name;
	private int weight;
	private int nutrition;
	public CannibalCow(String name, int weight, int nutrition) {
		this.name = name;
		this.weight = weight;
		this.nutrition = nutrition;
	}
	public int getWeight() {
		return weight;
	}
	public int grow() {
		return weight += nutrition;
	}
	public int grow(int somenum) {
		return nutrition += somenum;
	}
	public void die() {
		this.weight = 0;
	}
	public void eat(CannibalCow cow) {
		int nutr = cow.getWeight()/2;
		grow(nutr);
	}

}
