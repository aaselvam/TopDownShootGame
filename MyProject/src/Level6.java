import edu.digipen.Game;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

/**
 * Created by arya.selvam on 8/9/2016.
 */
public class Level6 extends GameLevel
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


		GameObject SmallShip = new SmallShp();
		SmallShip.setPosition(50, 350);
		SmallShip.setRotation(180);

		GameObject SmallShip1 = new SmallShipLv6();
		SmallShip1.setPosition(0,350);
		SmallShip1.setRotation(180);

		GameObject SmallShip2 = new SmallShip1Lv6();
		SmallShip2.setPosition(-50,350);
		SmallShip2.setRotation(180);

		GameObject SmallShip3 = new SmallShip2Lv6();
		SmallShip3.setPosition(50,450);
		SmallShip3.setRotation(180);

		GameObject SmallShip4 = new SmallShip3Lv6();
		SmallShip4.setPosition(-50,450);
		SmallShip4.setRotation(180);

		GameObject Lv2Droid = new Lv2Droid();
		Lv2Droid.setPosition(0,550);

		GameObject Lv2Droid2 = new Lv2Droid2();
		Lv2Droid2.setPosition(50,650);

		GameObject Lv2Droid3 = new Lv2Droid3();
		Lv2Droid3.setPosition(-50, 650);


	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
		PlayerShip.Level = 6;

		if(PlayerShip.numEnemies <= 0){
			GameLevelManager.goToLevel(new Level7());
			System.out.println("hi");
		}
	}

	@Override public void uninitialize()
	{

	}
}
