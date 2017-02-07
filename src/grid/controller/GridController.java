package grid.controller;

import grid.view.*;
import java.util.Vector;
import grid.model.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class GridController
	{
		private GridFrame appFrame;
		private Vector<People> peopleDex;
		private ImageIcon[][] people;
		private GridPanel appPanel;
		
		public GridController()
			{
				
				
				peopleDex = new Vector<People>();
				people = new ImageIcon[5][5];
				appPanel = new GridPanel(this);
			}

		public void start()
			{
				setupPeopleDex();
				setupPeople();
				appFrame = new GridFrame(this);

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
				
				int person = 0;
					
						for ( int row = 0 ;   row < people.length; row++ )
							{
								for (int col = 0; col < people[0].length; col++)
									{
										   System.out.println("/grid/view/images/" + peopleDex.elementAt(person).getName() + ".png");
										
											//String imageFile = new String(getClass().getResource("/grid/view/images/" + peopleDex.elementAt(person).getName() + ".png").getPath());
										    people[row][col] = new ImageIcon(getClass().getResource("/grid/view/images/" + peopleDex.elementAt(person).getName() + ".png"));
										    //people[row][col]
										
										person += 1;
										
									}
							}
					
			}

		public ImageIcon[][] getGrid()
			{
				return people;
			}
		public Vector<People> getPeople()
		{
			return peopleDex;
		}
		
		
	}
