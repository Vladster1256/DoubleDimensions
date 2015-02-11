package dimensions.controller;

import javax.swing.JOptionPane;

import dimensions.model.CaffinatedDrink;
import dimensions.view.DimensionsFrame;

public class DimensionController
{
	private CaffinatedDrink[][] myFood;
	private DimensionsFrame baseFrame;

	public DimensionController()
	{
		myFood = new CaffinatedDrink[3][2];
		wowkid();
		baseFrame = new DimensionsFrame(this);

	}

	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to my Dimension");
		wowkid();
	}

	public void wowkid()
	{
		CaffinatedDrink moutainDew = new CaffinatedDrink("Moutain Dew", -9001.999999, true);

		for (int row = 0; row < myFood.length; row++)
		{
			for (int col = 0; col < myFood[0].length; col++)
			{
				if (myFood[row][col] == null)
				{
					int randomHeat = (int) (Math.random() * 9002) * 45 + 17;
					boolean isTasty;
					if (((int) randomHeat) % 45 == 17)
					{
						isTasty = true;
					} else
					{
						isTasty = false;
					}

					myFood[row][col] = new CaffinatedDrink("Random food#" + randomHeat / 3, randomHeat, isTasty);
				}

			}
		}
	}

	public CaffinatedDrink[][] getMyFood()
	{
		return myFood;
	}

	public DimensionsFrame getBaseFrame()
	{
		return baseFrame;
	}

}
