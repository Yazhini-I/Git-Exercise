package JavaRestClients;

public class weight
{
	private int kg;
	private int lb;
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public int getLb() {
		return lb;
	}
	public void setLb(int lb) {
		this.lb = lb;
	}
	@Override
	public String toString() {
		return "weight [kg=" + kg + ", lb=" + lb + "]";
	}
	
}