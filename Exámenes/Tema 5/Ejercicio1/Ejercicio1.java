public class Ejercicio1
{

	public static void main(String[] args)
	{
		HotelInfinito hotel = new HotelInfinito(21);
		System.out.println(hotel.numHuespedes());
		
		hotel.setNumNoches(100);
		System.out.println(hotel.numHuespedes());
		
		hotel.setNumNoches(100000);
		System.out.println(hotel.numHuespedes());
	}

}
