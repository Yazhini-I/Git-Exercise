package JavaRestClients;

public class Idtype {
	private String id,type;
	

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

	@Override
	public String toString() {
		return "Idtype [id=" + id + ", type=" + type + "]";
	}

}
