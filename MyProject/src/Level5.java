import edu.digipen.Game;
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/9/2016.
 */
public class Level5 extends GameLevel
{
	GameObject Lv2Droid;
	GameObject Lv2Droid2;
	GameObject Lv2Droid3;
	GameObject MShip;
	GameObject MShip1;

	@Override public void create()
	{
		System.out.println(PlayerShip.numEnemies + "level");
		GameObject Menu2 = new Menu();
		Menu2.setPosition(335, 0);
		Menu2.setZOrder(-1);
		GameObject Background = new Background();
		Background.setPosition(-20, 0);
		GameObject PlayerShip = new PlayerShip(1);
		PlayerShip.setRotation(90);

		MShip = new Lv4MShip();
		MShip.setPosition(0, 650);
		MShip.setRotation(180);

		MShip1 = new Lv4MShip1();
		MShip1.setPosition(0, 450);
		MShip1.setRotation(180);

		Lv2Droid = new Lv2Droid();
		Lv2Droid.setPosition(0, 350);
		Lv2Droid.setZOrder(5);

		Lv2Droid2 = new Lv2Droid2();
		Lv2Droid2.setPosition(50, 350);
		Lv2Droid2.setZOrder(5);

		Lv2Droid3 = new Lv2Droid3();
		Lv2Droid3.setPosition(-50, 350);
		Lv2Droid3.setZOrder(5);



	}

	@Override public void initialize()
	{



	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 5;

		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Level6());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{

	}
}
