import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/4/2016.
 */
public class PlayerShip2 extends GameObject
{
	int EnemyCount;
	int windowWidth = 330;
	int windowHeight = 1000;

	public static int numEnemies;


	public PlayerShip2(int enemyCount)
	{
		super("PlayerShip2",64,64,"Ship.png");
		setCircleCollider(24);

		EnemyCount = enemyCount;
	}

	@Override public void update(float dt)
	{
		move();
		ScreenLock();
		shoot();

	}

	public void move()
	{
		if(InputManager.isPressed(KeyEvent.VK_UP))
		{
			setPositionY(getPositionY() + 8);
		}
		if(InputManager.isPressed(KeyEvent.VK_DOWN))
		{
			setPositionY(getPositionY() - 8);
		}
		if(InputManager.isPressed(KeyEvent.VK_LEFT))
		{
			setPositionX(getPositionX() - 7);
		}
		if(InputManager.isPressed(KeyEvent.VK_RIGHT))
		{
			setPositionX(getPositionX() + 7);
		}
	}

	public void ScreenLock(){

		if(getPositionX() +getWidth() /4 > windowWidth/2){
			setPositionX(windowWidth / 2 - getWidth() / 4);
		}

		if(getPositionX() - getWidth() /4 < -windowWidth/2){
			setPositionX(-windowWidth / 2 + getWidth() / 4);
		}

		if(getPositionY() +getWidth() /4 > windowHeight/2){
			setPositionY(windowHeight / 2 - getWidth() / 4);
		}

		if(getPositionY() - getWidth() /4 < -windowHeight/2){
			setPositionY(-windowHeight / 2 + getWidth() / 4);
		}
	}

	public void shoot()
	{


			if (InputManager.isTriggered(KeyEvent.VK_Z))
			{
				GameObject Bullet = new Bullet(getRotation(), getPosition(), true);

				GameObject Bullet1 = new Bullet(getRotation() + 5, getPosition(), true);

				GameObject Bullet2 = new Bullet(getRotation() - 5, getPosition(), true);

			}
		}


	@Override
	public void collisionReaction(GameObject other)
	{
		if(other instanceof Bullet && !((Bullet)other).PlayerTeam)
		{
			kill();
			other.kill();

			GameLevelManager.goToLevel(new GameOver());
		}
	}

}
