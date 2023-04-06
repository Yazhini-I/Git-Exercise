package JavaRestClients;

public class distance
{
	private int meters;
	private int feet;
	private int getMeters() {
		return meters;
	}
	private void setMeters(int meters) {
		this.meters = meters;
	}
	private int getFeet() {
		return feet;
	}
	private void setFeet(int feet) {
		this.feet = feet;
	}
	@Override
	public String toString() {
		return "distance [meters=" + meters + ", feet=" + feet + "]";
	}
	
	
}
