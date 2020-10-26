
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

import java.util.logging.Level;

/**
 * Created by arya.selvam on 8/5/2016.
 */
public class Sentry_1 extends GameObject
{
	float shootTimer = 0.3f;
	float maxShooTimer = shootTimer;
	int enemyCount = 3;
	int test = 0;


	public Sentry_1()
	{
		super("Sentry_1", 75, 75, "Sentry.png");
		setCircleCollider(25);
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

			//Move towards the player
			getPosition().add(toPlayer);

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
			other.kill();
			kill();
			PlayerShip.numEnemies--;
		}



	}
}
