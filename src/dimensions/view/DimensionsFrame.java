package dimensions.view;

import javax.swing.JFrame;

import dimensions.controller.DimensionController;

public class DimensionsFrame extends JFrame
{
	private DimensionsPanel basePanel;

	public DimensionsFrame(DimensionController baseController)
	{
		basePanel = new DimensionsPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setSize(600, 600);
		this.setContentPane(basePanel);
		this.setVisible(true);
		this.setResizable(false);
	}
}