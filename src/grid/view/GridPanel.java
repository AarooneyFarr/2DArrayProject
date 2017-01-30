package grid.view;

import java.awt.Color;

import javax.swing.*;
import grid.controller.GridController;

public class GridPanel extends JPanel
	{
		private JTextField rowField;
		private JTextField columnField;
		private JTextField inputField;
		private JLabel inputLabel;
		private JLabel columnLabel;
		private JLabel rowLabel;
		private JButton submitButton;
		private GridController baseController;
		
		
		public GridPanel(GridController baseController)
		{
			super();
			this.baseController = baseController;
			
			
		
			
			rowField = new JTextField();
			columnField = new JTextField();
			inputField = new JTextField();
			inputLabel = new JLabel("Input: ");
			columnLabel = new JLabel("Column: ");
			rowLabel = new JLabel("Row: ");
			submitButton = new JButton("Submit");
			
			setupPanel();
			setupLayout();
			setupListeners();
		}
		
		private void setupPanel()
		{
			this.setBackground(Color.GRAY);
			setLayout(null);

			this.add(columnField);
			this.add(columnLabel);
			this.add(rowLabel);
			this.add(inputField);
			this.add(inputLabel);
			this.add(rowField);
			this.add(submitButton);
		}
		
		private void setupLayout()
		{
			rowField.setBounds(124, 6, 50, 50);
			columnField.setBounds(121, 97, 53, 50);
			inputField.setBounds(121, 53, 50, 50);
			inputLabel.setBounds(344, 406, 50, 50);
			columnLabel.setBounds(206, 406, 70, 50);
			rowLabel.setBounds(64, 406, 50, 50);
			submitButton.setBounds(0, 0, 50, 50);






		}
		
		private void setupListeners()
		{
			
		}

	}
