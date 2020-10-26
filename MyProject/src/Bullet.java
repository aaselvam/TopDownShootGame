import edu.digipen.gameobject.GameObject;
import edu.digipen.math.Vec2;

/**
 * Created by arya.selvam on 8/5/2016.
 */
public class Bullet extends GameObject
{
	boolean PlayerTeam;
	float speed = 10;

	public Bullet(float rotation, Vec2 position, boolean playerTeam)
	{
		super("Bullet", 32, 32, "Laser.png");
		setCircleCollider(8);
		PlayerTeam = playerTeam;
		if(!playerTeam)
		{
			setModulationColor(1, 0, 1, 1);
		}

		setRotation(rotation);
		setPosition(position);
		setZOrder(5);
	}

	@Override
	public void update(float dt)
	{


		float angle = (float)Math.toRadians(getRotation());


		float x,y;
		x = (float) Math.cos(angle) * speed;
		y = (float) Math.sin(angle) * speed;

		setPosition(Vec2.add(getPosition(), new Vec2(x,y)));

	}
}
