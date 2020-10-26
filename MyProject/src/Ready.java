import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/9/2016.
 */
public class Ready extends GameLevel
{
	public static int Level;
	@Override public void create()
	{
		GameObject Ready = new ReadyPic();
		Ready.setPosition(0,0);
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		GameLevelManager.goToLevel(new Level_1());
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
