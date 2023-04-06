package JavaRestClients;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class space {
	private String name;
	private String type;
	private String active;
	private int stages;
	private int boosters;
	private int cost_per_launch;
	private int success_rate_pct;
	private String first_flight;
	private String country;
	private String company;
	private String description;
	private String wikipedia;
	private distance height;
	private distance diameter;
	private weight mass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public int getStages() {
		return stages;
	}
	public void setStages(int stages) {
		this.stages = stages;
	}
	public int getBoosters() {
		return boosters;
	}
	public void setBoosters(int boosters) {
		this.boosters = boosters;
	}
	public int getCost_per_launch() {
		return cost_per_launch;
	}
	public void setCost_per_launch(int cost_per_launch) {
		this.cost_per_launch = cost_per_launch;
	}
	public int getSuccess_rate_pct() {
		return success_rate_pct;
	}
	public void setSuccess_rate_pct(int success_rate_pct) {
		this.success_rate_pct = success_rate_pct;
	}
	public String getFirst_flight() {
		return first_flight;
	}
	public void setFirst_flight(String first_flight) {
		this.first_flight = first_flight;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWikipedia() {
		return wikipedia;
	}
	public void setWikipedia(String wikipedia) {
		this.wikipedia = wikipedia;
	}
	public distance getHeight() {
		return height;
	}
	public void setHeight(distance height) {
		this.height = height;
	}
	public distance getDiameter() {
		return diameter;
	}
	public void setDiameter(distance diameter) {
		this.diameter = diameter;
	}
	public weight getMass() {
		return mass;
	}
	public void setMass(weight mass) {
		this.mass = mass;
	}
	@Override
	public String toString() {
		return "space [name=" + name + ", type=" + type + ", active=" + active + ", stages=" + stages + ", boosters="
				+ boosters + ", cost_per_launch=" + cost_per_launch + ", success_rate_pct=" + success_rate_pct
				+ ", first_flight=" + first_flight + ", country=" + country + ", company=" + company + ", description="
				+ description + ", wikipedia=" + wikipedia + ", height=" + height + ", diameter=" + diameter + ", mass="
				+ mass + ", getName()=" + getName() + ", getType()=" + getType() + ", getActive()=" + getActive()
				+ ", getStages()=" + getStages() + ", getBoosters()=" + getBoosters() + ", getCost_per_launch()="
				+ getCost_per_launch() + ", getSuccess_rate_pct()=" + getSuccess_rate_pct() + ", getFirst_flight()="
				+ getFirst_flight() + ", getCountry()=" + getCountry() + ", getCompany()=" + getCompany()
				+ ", getDescription()=" + getDescription() + ", getWikipedia()=" + getWikipedia() + ", getHeight()="
				+ getHeight() + ", getDiameter()=" + getDiameter() + ", getMass()=" + getMass() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}