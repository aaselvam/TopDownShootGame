import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/11/2016.
 */
public class Level15 extends GameLevel
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

		GameObject PewPew = new PewPew();
		PewPew.setPosition(100, 350);

		GameObject PewPew2 = new PewPew2();
		PewPew2.setPosition(-100,350);

		GameObject PewPew3 = new PewPew3();
		PewPew3.setPosition(0,400);

		GameObject Sentry = new Sentry_1();
		Sentry.setPosition(0, 250);
		Sentry.setZOrder(5);

		GameObject Lv2Droid2 = new Droid1();
		Lv2Droid2.setPosition(0, 550);
		Lv2Droid2.setZOrder(5);
	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 15;

		System.out.println(PlayerShip.numEnemies + "level");
		System.out.println("level:" + PlayerShip.Level);
		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Cutscene1());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{

	}
}
