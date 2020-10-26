import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/10/2016.
 */
public class PowerUpgrade1 extends GameLevel
{
	@Override public void create()
	{
		GameObject PowerUpgradePic = new PowerUpgradeGO();

		GameObject triAttack = new triAttack();
		triAttack.setPosition(0, -200);
	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{
	}

	@Override public void uninitialize()
	{

	}
}
