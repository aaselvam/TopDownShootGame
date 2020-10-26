import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/11/2016.
 */
public class Level16 extends GameLevel
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
		

		GameObject Boss = new Boss();
		Boss.setPosition(0,600);


PewPew2.setPosition(-100,350);
		
		GameObject MShip2 = new MShip();
		MShip2.setRotation(180);
		MShip2.setPosition(-50, 550);

		GameObject MShip = new MShip();
	MShip.setRotation(180);
		MShip.setPosition(50, 550);

	}

	@Override public void initialize()
	{
		PlayerShip.Level = 16;


	}

	@Override public void update(float v)
	{

	}

	@Override public void uninitialize()
	{

	}
}
