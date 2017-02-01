package grid.model;

import javax.swing.*;



public abstract class People extends JPanel
	{
		private String name;
		private int age;
		private String comments;
		private JLabel nameLabel;
		private JLabel nameLabel2;
		private JLabel ageLabel;
		private JLabel ageLabel2;
		private JLabel commentsLabel;
		private JLabel commentsLabel2;
		private ImageIcon gridIcon;
		private JLabel peoplePic;

		public People()
			{
				
				name = "";
				age = 0;
				comments = "";
				nameLabel = new JLabel(name);
				nameLabel2 = new JLabel("Name is: ");
				ageLabel = new JLabel(age + "");
				ageLabel2 = new JLabel("Age: ");
				commentsLabel = new JLabel(comments);
				commentsLabel2 = new JLabel("Comments: ");
				this.peoplePic = new JLabel(new ImageIcon(People.class.getResource("/poke/view/images/pokeball.jpeg")),
						JLabel.CENTER);
				
				setupPanel();
				setupLayout();
				setupListeners();
			}

		public People(String name, int age, String comments)
			{
				this.name = name;
				this.age = age;
				this.comments = comments;
				nameLabel = new JLabel(name);
				nameLabel2 = new JLabel("Name is: ");
				ageLabel = new JLabel(age + "");
				ageLabel2 = new JLabel("Age: ");
				commentsLabel = new JLabel(comments);
				commentsLabel2 = new JLabel("Comments: ");
				this.peoplePic = new JLabel(new ImageIcon(People.class.getResource("/poke/view/images/pokeball.jpeg")),
						JLabel.CENTER);
				
				setupPanel();
				setupLayout();
				setupListeners();
			}
		
		private void setupPanel()
		{
			setLayout(null);
			this.add(commentsLabel);
			this.add(nameLabel);
			this.add(ageLabel);
			this.add(ageLabel2);
			this.add(commentsLabel2);
			this.add(nameLabel2);
			this.add(peoplePic);
		}
		
		private void setupLayout()
		{
			nameLabel.setBounds(68,6,133,16);
			ageLabel.setBounds(43, 86, 51, 16);
			ageLabel2.setBounds(6, 85, 32, 16);
			commentsLabel.setBounds(88,164,187,95);
			commentsLabel2.setBounds(6,164,76,16);
			nameLabel2.setBounds(6,6,64,16);
			peoplePic.setBounds(241,6,150,150);
		}
		
		private void setupListeners()
		{
			
		}
		
		public void changeImageDisplay(String name) {

			String path = "/grid/view/images/";
			String defaultName = "25";
			String extension = ".png";
			try {
				gridIcon = new ImageIcon(getClass().getResource(path + name + extension));
				peoplePic.setIcon(gridIcon);
			} catch (NullPointerException missingFile) {
				gridIcon = new ImageIcon(getClass().getResource(path + defaultName + ".jpeg"));
				peoplePic.setIcon(gridIcon);
			}

			repaint();

		}

		public String toString()
			{
				return name;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getAge()
			{
				return age;
			}

		public void setAge(int age)
			{
				this.age = age;
			}

		public String getComments()
			{
				return comments;
			}

		public void setComments(String comments)
			{
				this.comments = comments;
			}

	}
