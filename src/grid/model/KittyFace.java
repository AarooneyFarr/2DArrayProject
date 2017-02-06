package grid.model;

public class KittyFace extends People
	{
		public KittyFace()
			{
				super("KittyFace", 100, "A horrible accident left this man with the head of a cat.");
			}

		public KittyFace(String name, int age, String comments)
			{
				super(name, age, comments);
			}
	}
