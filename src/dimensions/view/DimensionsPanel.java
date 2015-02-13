package dimensions.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import dimensions.controller.DimensionController;

public class DimensionsPanel extends JPanel
{
	
	private DimensionController baseController;
	private JTable dimensionTable;
	private JLabel appLabel;
	private SpringLayout baseLayout;
	private JScrollPane tablePane;
	private TableCellWrapRenderer myCellRenderer;
	
	public DimensionsPanel(DimensionController baseController)
	{
		this.baseController = baseController;
		appLabel = new JLabel("look 2D data :D");
		
		myCellRenderer = new TableCellWrapRenderer();
		dimensionTable = new JTable();
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, dimensionTable, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, dimensionTable, 50, SpringLayout.WEST, this);
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		String [] colHeader = {"Column 1", "Column 2"};
		dimensionTable = new JTable(new DefaultTableModel(baseController.getMyFood(), colHeader));
		for(int col = 0; col < dimensionTable.getColumnCount(); col++)
		{
			dimensionTable.getColumnModel().getColumn(col).setCellRenderer( myCellRenderer);
		}
		tablePane = new JScrollPane(dimensionTable);
		
	}
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(600,600);
		this.add(appLabel);
		this.add(tablePane);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
	
	}
}
