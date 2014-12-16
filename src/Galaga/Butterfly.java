package Galaga;

import Galaga.Enemy.FlightPath;
import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Defines a butterfly, the middle section of the Galaga formation
 * 
 * @author Christopher Glasz
 */
public class Butterfly extends Enemy {

	/**
	 * Constructor initializes variables
	 * 
	 * @param x
	 *            x coordinate
	 * @param y
	 *            y coordinate
	 */
	public Butterfly(float x, float y, FlightPath entryPath) {
		super(x, y, entryPath);
		formationScore = 80;
		attackingScore = 160;
	}

	/**
	 * Constructor initializes variables
	 * 
	 * @param x
	 *            x coordinate
	 * @param y
	 *            y coordinate
	 * @param goalX
	 *            the starting destination
	 * @param goalY
	 *            the starting destination
	 */
	public Butterfly(float x, float y, float goalX, float goalY, FlightPath entryPath) {
		super(x, y, goalX, goalY, entryPath);
		formationScore = 80;
		attackingScore = 160;
	}

	@Override
	public void update(float elapsed) {
		super.update(elapsed);
	}


	@Override
	public Enemy clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void createSprite() {
		super.createSprite();
		sprite1 = (new PApplet()).loadImage("Sprites/butterfly.png");
		sprite2 = (new PApplet()).loadImage("Sprites/butterfly2.png");
	}

}
