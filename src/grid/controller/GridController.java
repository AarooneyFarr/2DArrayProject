package grid.controller;

import grid.view.GridFrame;
import java.util.Vector;
import grid.model.*;


public class GridController
	{
		private GridFrame appFrame;
		private Vector<People> peopleDex;
		private People[][] people;

		public GridController()
			{
				setupPeopleDex();
				setupPeople();
				appFrame = new GridFrame(this);
				peopleDex = new Vector<People>();
				people = new People[5][5];
			}

		public void start()
			{

			}

		public GridFrame getFrame()
			{
				return appFrame;
			}

		public void setupPeopleDex()
			{
				HaiShen hai = new HaiShen();
				peopleDex.add(hai);
			}

		public void setupPeople()
			{
				for (int person = 0; person < peopleDex.size(); person++)
					{
						for (People[] row : people)
							{
								for (People currentPerson : row)
									{
										currentPerson.setAge(peopleDex.get(person).getAge());
										currentPerson.setName(peopleDex.get(person).getName());
										currentPerson.setComments(peopleDex.get(person).getComments());
										currentPerson.changeImageDisplay(peopleDex.get(person).getName());
									}
							}
					}
			}

		public People[][] getGrid()
			{
				return people;
			}
		
		
	}
