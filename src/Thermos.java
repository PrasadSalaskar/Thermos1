
public class Thermos {
	
	float volume;
	String Brand, Liquid;
	
	Thermos(float volume, String Brand, String Liquid)
	{
		this.volume = volume = 0;
		this.Brand = Brand;
		this.Liquid = Liquid;
	}
	
	void addLiquid(double d) {
		if(d <= 1)
		{
			volume = (float) (volume + d);
		}
		else {
			System.out.println("The capacity of thermos is 1 liter\n");
		}
	}
	
	void pourLiquid(double p)
	{
		if(p <= volume)
		{
			volume= (float)(volume-p);
		}
		else {
			System.out.println("The  thermos is empty\n");
		}
	}
	
	void displayDetails() {
		System.out.println("Brand:"+Brand);
		System.out.println("\nLiquid:"+Liquid);
		System.out.println("\nvolume(in liters):"+volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Thermos godrej = new Thermos(1,"Godrej","orange juice");
  godrej.addLiquid(0.4);
  godrej.pourLiquid(0.2);
  godrej.displayDetails();
	}

}
