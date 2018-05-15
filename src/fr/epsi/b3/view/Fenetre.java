package fr.epsi.b3.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.epsi.b3.model.PanneauFactory;

public class Fenetre extends JFrame {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanneauFactory factory;

	public Fenetre(){
		factory = new PanneauFactory();
		
	    this.setTitle("Handball Penalties !");
	    this.setSize(700, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	    //Instanciation d'un objet JPanel
	    JPanel pan = new JPanel();
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);        
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(pan);   

	    // Layout
	    this.setLayout(new BorderLayout());
	    
	    // 
	    JPanel conteneurDePanneaux = new JPanel(new GridLayout(2, 3));
	    JPanel afficheurScore = new JPanel();
	    JPanel afficheurMessages = new JPanel();
	    
	    //
	    final Panneau panneauBleu = factory.creer(Color.BLUE);
	    final Panneau panneauVert = factory.creer(Color.BLUE);
	    final Panneau panneauRouge = factory.creer(Color.BLUE);
	    final Panneau panneauBlanc = factory.creer(Color.BLUE);
	    final Panneau panneauBleuClair = factory.creer(Color.BLUE);
	    final Panneau panneauMagenta = factory.creer(Color.BLUE);

	    //
	    conteneurDePanneaux.setPreferredSize(new Dimension(300, 200));
	    conteneurDePanneaux.setBackground(Color.BLACK);
	    afficheurMessages.setPreferredSize(new Dimension(700, 300));
	    afficheurScore.setPreferredSize(new Dimension(400, 200));

	    //
	    conteneurDePanneaux.add(panneauBleu);
	    conteneurDePanneaux.add(panneauVert);
	    conteneurDePanneaux.add(panneauRouge);
	    conteneurDePanneaux.add(panneauBlanc);
	    conteneurDePanneaux.add(panneauBleuClair);
	    conteneurDePanneaux.add(panneauMagenta);
	    
	    //
	    JLabel score = new JLabel("0 - 0");
	    score.setFont(new Font("Verdana", 1, 36));
	    afficheurScore.setLayout(new GridBagLayout());
	    afficheurScore.add(score);
	    
	    //
	    this.add(conteneurDePanneaux, BorderLayout.LINE_START);
	    this.add(afficheurScore, BorderLayout.LINE_END);
	    this.add(afficheurMessages, BorderLayout.SOUTH);
	    
	    this.setVisible(true);
	  }
	}