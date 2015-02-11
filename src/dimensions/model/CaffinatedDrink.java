package dimensions.model;

public class CaffinatedDrink
{
	private String name;
	private double caffineLevel;
	private boolean isTasty;
	
	public CaffinatedDrink(String name, double caffineLevel, boolean isTasty)
	{
		this.name = name;
		this.caffineLevel = caffineLevel;
		this.isTasty = isTasty;
	}
	
	public String getName()
	{
		return name;
	}
	public double getHeatLevel()
	{
		return caffineLevel;
	}
	public boolean isTasty()
	{
		return isTasty;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHeatLevel(double caffineLevel)
	{
		this.caffineLevel = caffineLevel;
	}
	public void setTasty(boolean isTasty)
	{
		this.isTasty = isTasty;
	}
	
	@Override
	public String toString()
	{
		String foodInfo = "";
		
		foodInfo += "Hi, I am a caffinated object. My name is " + name;
		foodInfo += ". I have a caffine level of: " + caffineLevel;
		if(isTasty)
		{
			foodInfo += ". Vlad says I am tasty too :D.";
		}
		else
		{
			foodInfo +=". Everyone knows I taste yucky!";
		}
		return foodInfo;
	}
}
