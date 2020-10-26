import edu.digipen.Game;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/10/2016.
 */
public class Level9 extends GameLevel
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

		GameObject Sentry3 = new Sentry1();
		Sentry3.setPosition(0, 450);
	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 9;

		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new PowerUpgrade1());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{

	}
}
