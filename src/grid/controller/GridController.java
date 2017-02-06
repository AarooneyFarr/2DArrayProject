package grid.controller;

import grid.view.GridFrame;
import java.util.Vector;
import grid.model.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;


public class GridController
	{
		private GridFrame appFrame;
		private Vector<People> peopleDex;
		private Image[][] people;

		public GridController()
			{
				setupPeopleDex();
				setupPeople();
				appFrame = new GridFrame(this);
				peopleDex = new Vector<People>();
				people = new Image[5][5];
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
				Tommy tom = new Tommy();
				peopleDex.add(tom);
				Bertha ber = new Bertha();
				peopleDex.add(ber);
				Bigs big = new Bigs();
				peopleDex.add(big);
				Bill bil = new Bill();
				peopleDex.add(bil);
				Bones bon = new Bones();
				peopleDex.add(bon);
				Bruce bru = new Bruce();
				peopleDex.add(bru);
				Dink din = new Dink();
				peopleDex.add(din);
				Donk don = new Donk();
				peopleDex.add(don);
				Egbert egb = new Egbert();
				peopleDex.add(egb);
				Frank fra = new Frank();
				peopleDex.add(fra);
				Jenkins jen = new Jenkins();
				peopleDex.add(jen);
				Joe joe = new Joe();
				peopleDex.add(joe);
				KittyFace kit = new KittyFace();
				peopleDex.add(kit);
				MingLao mil = new MingLao();
				peopleDex.add(mil);
				MingShao mis = new MingShao();
				peopleDex.add(mis);
				Mordu mor = new Mordu();
				peopleDex.add(mor);
				Mumbo mum = new Mumbo();
				peopleDex.add(mum);
				RobBot rob = new RobBot();
				peopleDex.add(rob);
				Samoset sam = new Samoset();
				peopleDex.add(sam);
				Sean sea = new Sean();
				peopleDex.add(sea);
				Sebastian seb = new Sebastian();
				peopleDex.add(seb);
				Senpai sen = new Senpai();
				peopleDex.add(sen);
				Tabitha tab = new Tabitha();
				peopleDex.add(tab);
				Winston win = new Winston();
				peopleDex.add(win);
			}

		public void setupPeople()
			{
				for (int person = 0; person < peopleDex.size(); person++)
					{
						for (Image[] row : people)
							{
								for (Image currentPerson : row)
									{
										BufferedImage img = null;
										try {
										    img = ImageIO.read(new File(peopleDex.elementAt(person).getName() + ".png"));
										} catch (IOException e) {
										}
										
										
									}
							}
					}
			}

		public Image[][] getGrid()
			{
				return people;
			}
		
		
	}
