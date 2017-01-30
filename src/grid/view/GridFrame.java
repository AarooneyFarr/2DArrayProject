package grid.view;

import javax.swing.JFrame;
import java.awt.Color;

import java.awt.Dimension;

import grid.controller.GridController;

public class GridFrame extends JFrame
{
	private GridController baseController;
	private GridPanel appPanel;
	
	
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new GridPanel(baseController);
		
		setupFrame(500,500);
		setupListeners();
	}
	
	private void setupFrame(int width, int height)
	{
		this.setContentPane(appPanel);
		this.setTitle("People");
		this.setSize(new Dimension(width, height));
		this.setVisible(true);
		this.setBackground(Color.GREEN);
	}
	
	private void setupListeners()
	{
		this.addWindowListener(new java.awt.event.WindowAdapter()
		{
			
		@Override
		public void windowClosing(java.awt.event.WindowEvent windowEvent)
		{
			System.exit(0);
		}
				
			
				
		});
	}
}

