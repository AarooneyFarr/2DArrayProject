package grid.view;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.*;
import grid.controller.GridController;
import grid.controller.*;
import java.awt.event.*;

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
		private JTable gridTable;
		private JScrollPane gridPane;
		private ImageIcon gridIcon;
		private JLabel peoplePic;

		public GridPanel(GridController baseController)
			{
				super();
				this.baseController = baseController;

				rowField = new JTextField();
				columnField = new JTextField();
				inputField = new JTextField();
				inputLabel = new JLabel("New Age: ");
				columnLabel = new JLabel("Column: ");
				rowLabel = new JLabel("Row: ");
				submitButton = new JButton("Submit");
				gridIcon = new ImageIcon();
				peoplePic = new JLabel();

				setupTable();
				setupPanel();
				setupLayout();
				setupListeners();
			}

		public void setupTable()
			{
				// load model
				DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String[] { "one", "two", "three", "four", "five" });
				gridTable = new JTable(data)
					{

						public String getToolTipText(MouseEvent e)
							{
								String tip = null;
								java.awt.Point p = e.getPoint();
								int rowIndex = rowAtPoint(p);
								int colIndex = columnAtPoint(p);

								try
									{
										int position = ((colIndex + 1) + (rowIndex * 5)) - 1;
										String comments = baseController.getPeople().elementAt(position).getComments();
										String name = baseController.getPeople().elementAt(position).getName();
										int age = baseController.getPeople().elementAt(position).getAge();
										tip = "Name: " + name + ". Comments: " + comments + ". Age: " + age;
									}
								catch (RuntimeException e1)
									{

									}

								return tip;
							}

						public Class getColumnClass(int column)
							{
								return getValueAt(0, column).getClass();
							}
					};
				gridTable.setFillsViewportHeight(true);
				gridTable.setRowHeight(50);
				gridTable.setEnabled(false);
				gridTable.setModel(data);
				// gridTable.setToolTipText(baseController.getPeople().toString());

				gridPane = new JScrollPane();
				gridPane.setViewportView(gridTable);

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
				this.add(gridPane);

				// this.add(peoplePic);
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
				gridPane.setBounds(6, 6, 488, 394);

			}

		private void setupListeners()
			{
			submitButton.addActionListener(new ActionListener()
					{
				public void actionPerformed(ActionEvent evt)
				{
				try{
					int col = Integer.parseInt(columnField.getText());
					int row = Integer.parseInt(rowField.getText());
					int newAge = Integer.parseInt(inputField.getText());
					
					baseController.getPeople().elementAt((((row-1)*5)+ col)-1).setAge(newAge);
					repaint();
				}
				catch(NumberFormatException e)
					{
						
					}
				}
					});
			}

		public void changeImageDisplay(String name)
			{

				String path = "/grid/view/images/";
				String defaultName = "25";
				String extension = ".png";
				try
					{
						gridIcon = new ImageIcon(getClass().getResource(path + name + extension));
						peoplePic.setIcon(gridIcon);
					}
				catch (NullPointerException missingFile)
					{
						gridIcon = new ImageIcon(getClass().getResource(path + defaultName + ".png"));
						peoplePic.setIcon(gridIcon);
					}

				repaint();

			}

		public GridController getBaseController()
			{
				return baseController;
			}

	}
