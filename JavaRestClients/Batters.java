package JavaRestClients;

import java.util.List;

public class Batters {

	private List<Idtype> batter;

	public List<Idtype> getBatter() {
		return batter;
	}

	public void setBatter(List<Idtype> batter) {
		this.batter = batter;
	}

	@Override
	public String toString() {
		return " [batter=" + batter + "]";
	}

	
	
	     
}
