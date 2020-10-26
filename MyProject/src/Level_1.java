import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/4/2016.
 */
public class Level_1 extends GameLevel
{

	@Override public void create()
	{

	}

	@Override public void initialize()
	{


		GameObject Lv1Droid = new Lv1Droid();
		Lv1Droid.setPosition(0, 300);
		Lv1Droid.setZOrder(5);

		GameObject Menu = new Menu();
		Menu.setPosition(335, 0);
		Menu.setZOrder(-1);
		GameObject Background = new Background();
		Background.setPosition(-20, 0);
		GameObject PlayerShip = new PlayerShip(1);
		PlayerShip.setRotation(90);


	}

	@Override public void update(float v)
	{

	}

	@Override public void uninitialize()
	{

	}
}
