import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/10/2016.
 */
public class Level11 extends GameLevel
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

		GameObject MShip3 = new MShip2();
		MShip3.setRotation(180);
		MShip3.setPosition(0, 550);

		GameObject Lv2Droid = new Droid();
		Lv2Droid.setPosition(0, 350);
		Lv2Droid.setZOrder(5);

		GameObject Lv2Droid2 = new Droid1();
		Lv2Droid2.setPosition(50, 350);
		Lv2Droid2.setZOrder(5);

		GameObject Sentry = new Sentry_1();
		Sentry.setPosition(50, 450);
		Sentry.setZOrder(5);

		GameObject Sentry2 = new Sentry_2();
		Sentry2.setPosition(-50, 450);
		Sentry2.setZOrder(5);

		GameObject Sentry3 = new Sentry_3();
		Sentry3.setPosition(0, 600);
		Sentry3.setZOrder(5);
	}


	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 11;

		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Level12());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{

	}
}
