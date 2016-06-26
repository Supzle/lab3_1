package Control;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import View.ComandView;

public class Display {
	ComandView CV;
	Frame frame=new Frame("display");
	JButton[] btn = new JButton[13];
	void clsvis(int s, int t) {
		for (int i = s; i < t; i ++)
			btn[i].setVisible(false);
	}
	public Display(ComandView cv) {
		CV = cv;
		 btn[0] =new JButton("Create a new Survey");
		 btn[1] =new JButton("Create a new Test");
		 btn[2] =new JButton("Display Survey");
		 btn[3] =new JButton("Display a Test");
		 btn[4] =new JButton("Save a Survey");
		 btn[5] =new JButton("Save a Test");
		 btn[6] =new JButton("Modify a Survey");
		 btn[7] =new JButton("Modify a Test");
		 btn[8] =new JButton("Take a Survey");
		 btn[9] =new JButton("Take a Test");
		 btn[10] =new JButton("Look survey outcome");
		 btn[11] =new JButton("Look test outcome");
		 btn[12] =new JButton("Quit");
		for (int i = 0; i < 13;i ++) {
			frame.add(btn[i]);
			btn[i].setVisible(false);
			final int j=i;
			btn[i].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				CV.action_choose(j);
				clsvis(0,13);
			}
			});
			
		}
		frame.setLayout(new FlowLayout());     
	    frame.setSize(500,400);
	    frame.setVisible(true);
	}
	public void printFirstMenu() {
		for (int i = 0; i < 13;i ++) {
			btn[i].setVisible(true);
		}
	}
}
