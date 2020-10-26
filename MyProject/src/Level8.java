import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/10/2016.
 */
public class Level8 extends GameLevel
{
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

		GameObject Sentry1 = new Lv8Sentry();
		Sentry1.setPosition(50, 350);

		GameObject Sentry2 = new Lv8Sentry1();
		Sentry2.setPosition(-50, 350);

		GameObject MShip = new Lv4MShip();
		MShip.setPosition(0,450);
		MShip.setRotation(180);

		GameObject SmallShip1 = new SmallShipLv6();
		SmallShip1.setPosition(0,300);
		SmallShip1.setRotation(180);

		GameObject SmallShip2 = new SmallShip1Lv6();
		SmallShip2.setPosition(-50,300);
		SmallShip2.setRotation(180);
	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 8;

		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Level9());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{

	}
}
