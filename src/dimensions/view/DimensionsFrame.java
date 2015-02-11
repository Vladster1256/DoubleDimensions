package dimensions.view;

import javax.swing.JFrame;

import dimensions.controller.DimensionController;

public class DimensionsFrame extends JFrame
{
	private DimensionsPanel basePanel;
	public DimensionsFrame(DimensionController basecontroller)
	{
		basePanel = new DimensionsPanel(baseController);
		setupFrame();
	}
}

private void setupFrame()
{
	this.setContentPane(basePanel);
}
