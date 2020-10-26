import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/11/2016.
 */
public class Cutscene2 extends GameLevel
{
	@Override public void create()
	{
		GameObject cutscene2 = new CutscenePic2();

		try {
			Thread.sleep(2000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		GameLevelManager.goToLevel(new Level16());
	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{

	}

	@Override public void uninitialize()
	{

	}
}
