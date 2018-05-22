package fr.epsi.b3.model;

public class Score {
	
	private int scoreA;
	private int scoreB;
	private Personne personneA;
	private Personne personneB;

	public void incrementeScoreA() {
		scoreA += 1;
		
	}
	
	public void incrementeScoreB() {
		scoreB += 1;	
	}
	
	public void miseAZero() {
		scoreA = 0;
		scoreB = 0;		
	}
	public int getScoreA() {
		return scoreA;
	}

	public int getScoreB() {
		return scoreB;
	}

	public Personne getPersonneA() {
		return personneA;
	}
	public void setPersonneA(Personne personneA) {
		this.personneA = personneA;
	}

	public Personne getPersonneB() {
		return personneB;
	}
	public void setPersonneB(Personne personneB) {
		this.personneB = personneB;
	}
	
}
