import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/12/2016.
 */
public class Start extends GameLevel
{
	@Override public void create()
	{
		GameObject StartPic = new StartPic();

	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		if(InputManager.isTriggered(KeyEvent.VK_Z))
		{
			GameLevelManager.goToLevel(new Ready());
		}
	}

	@Override public void uninitialize()
	{

	}
}
