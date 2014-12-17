package Galaga;

import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Defines a missile fired by an enemy
 * 
 * @author Christopher Glasz
 */
public class EnemyMissile extends Missile {

	/**
	 * Constructor initializes variables
	 * 
	 * @param x
	 *            initial x coordinate of the missile
	 * @param y
	 *            initial y coordinate of the missile
	 * @param theta
	 *            initial angle of the missile
	 */
	public EnemyMissile(float x, float y, float theta) {
		super(x, y);
		this.theta = theta + PConstants.PI / 2;
		this.vx = BULLET_SPEED * PApplet.cos(theta);
		this.vy = BULLET_SPEED * PApplet.sin(theta);
	}

	/**
	 * Loads the sprite
	 */
	protected void createSprite() {
		sprite = (new PApplet()).loadImage("Sprites/enemy_missile.png");
	}

}
