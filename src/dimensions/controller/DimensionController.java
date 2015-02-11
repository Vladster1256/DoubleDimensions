package dimensions.controller;

import javax.swing.JOptionPane;

import dimensions.model.CaffinatedDrink;

public class DimensionController
{
	private CaffinatedDrink [][] myFood;

	public DimensionController()
	{
		myFood = new CaffinatedDrink[3][2];
		
		
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to my Dimension");
		wowkid();
	}
	
	public void wowkid()
	{
		for(int row = 0; row < myFood.length; row++)
		{
			for (int col = 0; col < myFood[0].length; col++)
			{
				myFood[row][col] = (Math.random() * 6);
			}
		}
	}
	
	
	
}
