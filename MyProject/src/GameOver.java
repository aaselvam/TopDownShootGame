import edu.digipen.InputManager;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/8/2016.
 */
public class GameOver extends GameLevel
{

	@Override public void create()
	{

	}

	@Override public void initialize()
	{
		GameOverPic pic = new GameOverPic();
	}

	@Override public void update(float v)
	{
		PlayerShip.numEnemies =0;
		if(InputManager.isTriggered(KeyEvent.VK_SPACE))
		{
			ObjectManager.removeAllObjects();
			PlayerShip.numEnemies = 0;
			if (PlayerShip.Level == 1)
			{
				GameLevelManager.goToLevel(new Level_1());
			}
			if (PlayerShip.Level == 2)
			{
				GameLevelManager.goToLevel(new Level2());
			}
			if (PlayerShip.Level == 3)
			{
				GameLevelManager.goToLevel(new Level3());
			}
			if (PlayerShip.Level == 4)
			{
				GameLevelManager.goToLevel(new Level4());
			}
			if (PlayerShip.Level == 5)
			{
				GameLevelManager.goToLevel(new Level5());
			}
			if (PlayerShip.Level == 6)
			{
				GameLevelManager.goToLevel(new Level6());
			}
			if (PlayerShip.Level == 7)
			{
				GameLevelManager.goToLevel(new Level7());
			}
			if (PlayerShip.Level == 8)
			{
				GameLevelManager.goToLevel(new Level8());
			}
			if (PlayerShip.Level == 9)
			{
				GameLevelManager.goToLevel(new Level9());
			}
			if (PlayerShip.Level == 10)
			{
				GameLevelManager.goToLevel(new Level10());
			}
			if (PlayerShip.Level == 11)
			{
				GameLevelManager.goToLevel(new Level11());
			}
			if (PlayerShip.Level == 12)
			{
				GameLevelManager.goToLevel(new Level12());
			}
			if (PlayerShip.Level == 13)
			{
				GameLevelManager.goToLevel(new Level13());
			}
			if (PlayerShip.Level == 14)
			{
				GameLevelManager.goToLevel(new Level14());
			}
			if (PlayerShip.Level == 15)
			{
				GameLevelManager.goToLevel(new Level15());
			}
			if (PlayerShip.Level == 16)
			{
				GameLevelManager.goToLevel(new Level16());
			}
		}
	}

	@Override public void uninitialize()
	{

	}
}
