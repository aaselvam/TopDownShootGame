import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.graphics.Graphics;
import edu.digipen.math.Vec2;
import edu.digipen.physics.PhysicsSystem;

/**
 * Created by arya.selvam on 8/3/2016.
 */
public class Mouse
{
	// Get the mouse cursor's world position
	public static Vec2 getWorldPosition()
	{
		//Make a vector to return
		Vec2 worldPos = new Vec2();

		//get the window dimensions /2
		int windowWidth = Graphics.getWindowWidth() / 2;
		int windowHeight = Graphics.getWindowHeight() / 2;

		//Vector to hold the mouses cursors screen position
		Vec2 screenPos = new Vec2();

		//attempt to do whats inside the try statement
		try
		{
			screenPos = new Vec2(InputManager.getMousePosition());
		}
		catch (NullPointerException e)
		{
			return worldPos;
		}
		float x = screenPos.getX() - windowWidth + Graphics.getCameraPosition().getX() - 8;
		float y = -screenPos.getY() + windowHeight + Graphics.getCameraPosition().getY() + 32;

		worldPos.set(x,y);

		return worldPos;
	}

	public static boolean isClicked(int button)
	{
		// Left Mouse Butoon = 0
		// Right Mouse Button = 1
		// Middle Mouse Button = 2
		if(InputManager.isMouseButtonTriggered(button))
		{
			return true;
		}
		return false;
	}

	public static boolean clickedObject(GameObject object, int button)
	{
		if(isClicked(button))
		{

			if(PhysicsSystem.isObjectCollidedWith(object, getWorldPosition()))
			{
				return true;
			}
		}

		return false;
	}
}
