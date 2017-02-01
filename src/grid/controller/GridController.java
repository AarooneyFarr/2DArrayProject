package grid.controller;

import grid.view.GridFrame;

public class GridController
	{
		private GridFrame appFrame;

		public GridController()
			{
				appFrame = new GridFrame(this);
			}

		public void start()
			{

			}

		public GridFrame getFrame()
			{
				return appFrame;
			}
	}
