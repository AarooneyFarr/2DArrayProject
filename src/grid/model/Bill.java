package grid.model;

public class Bill extends People
	{
		public Bill()
			{
				super("Bill", 37, "Known to many as only 'BuckTooth Bill.'");
			}

		public Bill(String name, int age, String comments)
			{
				super(name, age, comments);
			}
	}
