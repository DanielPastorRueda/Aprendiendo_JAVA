public class HotelInfinito
{
	private int numNoches;

	public HotelInfinito(int numNoches)
	{
		setNumNoches(numNoches);
	}

	public int getNumNoches()
	{
		return numNoches;
	}

	public void setNumNoches(int numNoches)
	{
		if (numNoches > 0)
			this.numNoches = numNoches;
	}
	
	public int numHuespedes()
	{
		int huesped = 0;
		int auxNoches = this.numNoches;
		
		while (auxNoches > 0)
		{
			huesped++;
			for (int cont = 1; cont <= huesped; cont++)  // podría optimizarse con ((cont >= huesped)&&(auxNoches > 0))
				auxNoches--;
		}
		
		return huesped;
	}
}
