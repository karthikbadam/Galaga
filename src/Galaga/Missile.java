package Galaga;

import processing.core.*;

/**
 * Defines a missile
 * 
 * @author Christopher Glasz
 */
public abstract class Missile implements ApplicationConstants {

	/**
	 * X velocity of the missile
	 */
	protected float vx, vy;

	/**
	 * Coordinates of the missile
	 */
	protected float x, y;
	
	/**
	 * Angle of attack
	 */
	protected float theta;

	/**
	 * Sprite to draw
	 */
	protected PImage sprite;

	/**
	 * Boolean to keep track of whether the missile is destroyed
	 */
	private boolean destroyed;

	/**
	 * COnstructor initializes variables
	 * 
	 * @param x
	 *            initial x-coordinate of the missile
	 * @param y
	 *            initial y-coordinate of the missile
	 */
	public Missile(float x, float y) {
		this.x = x;
		this.y = y;
		this.theta = 0;
		this.destroyed = false;
		createSprite();
	}

	/**
	 * Update position of missile
	 * 
	 * @param elapsed
	 *            time since last draw
	 */
	public void update(float elapsed) {
		y += vy * elapsed * 0.001;
		x += vx * elapsed * 0.001;
		
		if (y > WORLD_HEIGHT || y < 0)
			destroy();
	}

	/**
	 * Draws the missile to the passed PApplet
	 * 
	 * @param g
	 *            PApplet to draw to
	 */
	public void render(PApplet g) {
		g.pushMatrix();
		g.translate(x, y);
		g.scale(PIXEL_WIDTH);
		g.rotate(theta);
		g.noSmooth();
		g.imageMode(PConstants.CENTER);

		g.image(sprite, 0, 0);

		g.popMatrix();
	}

	/**
	 * Destroy the missile
	 */
	public void destroy() {
		destroyed = true;
	}

	/**
	 * Returns true if the missile is destroyed
	 * 
	 * @return true if the missile is destroyed
	 */
	public boolean isDestroyed() {
		return destroyed;
	}

	/**
	 * Accessor method for the x coordinate of the missile
	 * 
	 * @return the x coordinate of the missile
	 */
	public float getX() {
		return x;
	}

	/**
	 * Accessor method for the y coordinate of the missile
	 * 
	 * @return the y coordinate of the missile
	 */
	public float getY() {
		return y;
	}

	/**
	 * Loads the sprite for the missile
	 */
	protected abstract void createSprite();
}
