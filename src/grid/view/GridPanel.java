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
			rowField.setBounds(66, 412, 81, 22);
			columnField.setBounds(216, 412, 81, 22);
			inputField.setBounds(353, 412, 81, 22);
			inputLabel.setBounds(313, 412, 50, 22);
			columnLabel.setBounds(161, 412, 70, 22);
			rowLabel.setBounds(29, 412, 50, 22);
			submitButton.setBounds(198, 459, 81, 22);






		}
		
		private void setupListeners()
		{
			
		}

	}
