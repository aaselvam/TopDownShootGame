import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/8/2016.
 */
public class Level3 extends GameLevel
{

	@Override public void create()
	{
		GameObject Menu2 = new Menu();
		Menu2.setPosition(335, 0);
		Menu2.setZOrder(-1);
		GameObject Background = new Background();
		Background.setPosition(-20, 0);
		GameObject PlayerShip = new PlayerShip(1);
		PlayerShip.setRotation(90);

		GameObject MShip = new Lv3MShip();
		MShip.setPosition(0, 400);
		MShip.setRotation(180);



	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 3;

		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Level4());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{
		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Level4());
			System.out.println("hi");
		}
	}
}
