
public class Line {
	private Vect2 aStore;
	private Vect2 bStore;
	private double slope;
	public Line(Vect2 a, Vect2 b){
		this.aStore = a;
		this.bStore = b;
		slope = (aStore.getY() - bStore.getY())/(aStore.getX() - bStore.getY());
		
	}
	public Vect2 getPointA(){
		return aStore;
	}
	public Vect2 getPointB() {
		return bStore;
	}
	public Line rotate(double angle, Vect2 center) {
		center.rotate();
	}
	
}
