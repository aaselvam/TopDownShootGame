import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/10/2016.
 */
public class Level10 extends GameLevel
{
	@Override public void create()
	{
		System.out.println(PlayerShip.numEnemies + "level");
		GameObject Menu2 = new Menu();
		Menu2.setPosition(335, 0);
		Menu2.setZOrder(-1);
		GameObject Background = new Background();
		Background.setPosition(-20, 0);

		GameObject PlayerShip = new PlayerShip2(1);
		PlayerShip.setRotation(90);

		GameObject MShip = new MShip();
		MShip.setRotation(180);
		MShip.setPosition(50, 550);

		GameObject MShip2 = new MShip1();
		MShip2.setRotation(180);
		MShip2.setPosition(-50, 550);

		GameObject MShip3 = new MShip2();
		MShip3.setRotation(180);
		MShip3.setPosition(0, 700);

		GameObject Lv2Droid = new Droid();
		Lv2Droid.setPosition(0, 350);
		Lv2Droid.setZOrder(5);

		GameObject Lv2Droid2 = new Droid1();
		Lv2Droid2.setPosition(50, 350);
		Lv2Droid2.setZOrder(5);

	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 10;

		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Level11());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{

	}
}
