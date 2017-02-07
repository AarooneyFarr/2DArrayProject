package grid.model;

import javax.swing.*;



public abstract class People 
	{
		private String name;
		private int age;
		private String comments;
		
		public People()
			{
				
				name = "";
				age = 0;
				comments = "";
				
				
			}

		public People(String name, int age, String comments)
			{
				this.name = name;
				this.age = age;
				this.comments = comments;
				
				
				
			}
		
		
		
		
		

		public String toString()
			{
				return name + " Age: " + age + " Comments: " + comments;
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
