
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

import java.util.logging.Level;

/**
 * Created by arya.selvam on 8/5/2016.
 */
public class PewPew3 extends GameObject
{
	float shootTimer = 0.5f;
	float maxShooTimer = shootTimer;

	public PewPew3()
	{
		super("PewPew3", 35, 35, "PewPew.png");
		setCircleCollider(10);
		PlayerShip.numEnemies++;

	}

	@Override public void update(float dt)
	{
		GameObject player = ObjectManager.getGameObjectByName("PlayerShip2");

		if (player != null)

		{
			//Make a vector that points from the enemy towards the player ship
			Vec2 toPlayer = Vec2.subtract(player.getPosition(), getPosition());

			// Reduce the length of the vector to 1
			toPlayer.normalize();

			// Scale the vector so that the enemy moves at a reasonable speed
			toPlayer.scale(1);

			//Reduce the shoot time by dt
			shootTimer -= dt;

			// If the shoot timer is less than 0
			if (shootTimer <= 0)
			{
				//Get the the angle towards the player
				float angle = (float) Math.atan2(toPlayer.getY(), toPlayer.getX());

				// Change the angle to degrees
				angle = (float) Math.toDegrees(angle);
				// Make a bullet that will move towards the player
				GameObject bullet1 = new Bullet(angle, getPosition(), false);


				GameObject bullet2 = new Bullet(angle+10, getPosition(), false);

				GameObject bullet4 = new Bullet(angle+20, getPosition(), false);


				GameObject bullet = new Bullet(angle+30, getPosition(), false);

				GameObject bullet3 = new Bullet(angle+40, getPosition(), false);

				GameObject bullet5 = new Bullet(angle+50, getPosition(), false);

				GameObject bullet6 = new Bullet(angle+60, getPosition(), false);

				GameObject bullet7 = new Bullet(angle+70, getPosition(), false);

				GameObject bullet8 = new Bullet(angle+80, getPosition(), false);

				GameObject bullet9 = new Bullet(angle-10, getPosition(), false);


				GameObject bullet10 = new Bullet(angle-20, getPosition(), false);

				GameObject bullet11 = new Bullet(angle-30, getPosition(), false);


				GameObject bullet12 = new Bullet(angle-40, getPosition(), false);

				GameObject bullet13 = new Bullet(angle-50, getPosition(), false);

				GameObject bullet14 = new Bullet(angle-60, getPosition(), false);

				GameObject bullet15 = new Bullet(angle-70, getPosition(), false);

				GameObject bullet16 = new Bullet(angle-80, getPosition(), false);

				GameObject bullet17 = new Bullet(angle-90, getPosition(), false);

				GameObject bullet18 = new Bullet(angle+90, getPosition(), false);



				//Reset shoot timer
				shootTimer = maxShooTimer;
			}
		}
	}
	@Override
	public void collisionReaction(GameObject other)
	{
		if(other instanceof Bullet && ((Bullet)other).PlayerTeam)
		{
			PlayerShip.numEnemies--;
			other.kill();
			kill();

		}
	}


}
