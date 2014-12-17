package Galaga;

import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Defines a missile fired by the fighter
 * 
 * @author Christopher Glasz
 */
public class FighterMissile extends Missile {

	/**
	 * Constructor initializes variables
	 * 
	 * @param x
	 *            initial x coordinate of the missile
	 * @param y
	 *            initial y coordinate of the missile
	 */
	public FighterMissile(float x, float y) {
		super(x, y);
		vx = 0;
		vy = BULLET_SPEED;
		theta = PConstants.PI;
	}

	/**
	 * Loads the sprite
	 */
	protected void createSprite() {
		sprite = (new PApplet()).loadImage("Sprites/fighter_missile.png");
	}

}
