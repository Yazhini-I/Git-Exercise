package JavaRestClients;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pastry
{
	private String id;
	private String type;
	private String name;
	private float ppu;
	private Batters batters;
	private List<Idtype> topping;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPpu() {
		return ppu;
	}
	public void setPpu(float ppu) {
		this.ppu = ppu;
	}
	
	public Batters getBatters() {
		return batters;
	}
	public void setBatters(Batters batters) {
		this.batters = batters;
	}
	public List<Idtype> getTopping() {
		return topping;
	}
	public void setTopping(List<Idtype> topping) {
		this.topping = topping;
	}
	@Override
	public String toString() {
		return "Pastry [id=" + id + ", type=" + type + ", name=" + name + ", ppu=" + ppu + ", batters=" + batters + ", topping="
				+ topping + "]";
	}
	
	
	
	

}
