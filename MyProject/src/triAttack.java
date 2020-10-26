import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevelManager;
import jdk.internal.util.xml.impl.Input;

import java.awt.event.KeyEvent;

/**
 * Created by arya.selvam on 8/10/2016.
 */
public class triAttack extends GameObject
{
	public triAttack()
	{
		super("triAttack", 300,100,"triAttack.png");
		setRectangleCollider(150, 50);
	}

	@Override
	public void update(float dt)
	{
		if(InputManager.isTriggered(KeyEvent.VK_Z))
		{
			PlayerShip.upgrade1 = true;
			System.out.println("tri");
			GameLevelManager.goToLevel(new Level10());
		}
	}
}
