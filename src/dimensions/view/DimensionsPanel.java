package dimensions.view;

import javax.swing.*;

import dimensions.controller.DimensionController;

public class DimensionsPanel extends JPanel
{
	
	private DimensionController baseController;
	private JTable dimensionTable;
	private JLabel appLabel;
	private SpringLayout baseLayout;
	
	public DimensionsPanel(DimensionController baseController)
	{
		this.baseController = baseController;
		
		dimensionTable = new JTable();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
	
	}
}
