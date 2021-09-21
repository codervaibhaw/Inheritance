package inheritance;
class Bike{
	private int price;
	private String company_name;
	public void setPrice(int p) {
		price=p;
	}
	public void setName(String name) {
		company_name=name;
	}
	public void show() {
		System.out.println("price= "+maxSpeed+ " name= "+company_name);
	}
}
class SportsBike extends Bike{
	private int maxSpeed;
	private String sbName;
	public void setSpeed(int speed) {
		maxSpeed=speed;
	}
	public void SetSbname(String sbname) {
		sbName=sbname;
	}
}

public class InheriConcept {

	public static void main(String[] args) {
		
SportsBike b1=new SportsBike();
b1.setSpeed(400);
b1.SetSbname("Ducati");
b1.setPrice(76000);
b1.setName("pulsar");
b1.show();
	}

}
