package fr.epsi.b3.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Panneau extends JButton { 

	private Color color;
	private int x;
	private int y;
	
	public Panneau(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "test");
			}
		});
	}
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){

	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
	    // System.out.println("Je suis exécutée !");
	    g.setColor(this.color);
	    g.fillRect(this.x, this.y, 100, 100);

	}               
}