
public class Main {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis ();
		
		System.out.println("SBI: "+s.getRateOfInterest()+"\nICICI: "+i.getRateOfInterest()+"\nAxis: "+a.getRateOfInterest());
	}

}
