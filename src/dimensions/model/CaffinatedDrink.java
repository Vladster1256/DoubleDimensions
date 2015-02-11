package dimensions.model;

public class CaffinatedDrink
{
	private String name;
	private double heatLevel;
	private boolean isTasty;
	
	public String getName()
	{
		return name;
	}
	public double getHeatLevel()
	{
		return heatLevel;
	}
	public boolean isTasty()
	{
		return isTasty;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHeatLevel(double heatLevel)
	{
		this.heatLevel = heatLevel;
	}
	public void setTasty(boolean isTasty)
	{
		this.isTasty = isTasty;
	}
	
	@Override
	public String toString()
	{
		String foodInfo = "";
		
		foodInfo += "Hi, I am a spicy food object :D. My name is " + name;
		foodInfo += ". I have a heat level of: " + heatLevel;
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
