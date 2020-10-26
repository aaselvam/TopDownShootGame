import edu.digipen.Game;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Game.initialize(1000,1000,60, new Start());

        while(!Game.getQuit())
   {

            Game.update();
        }

    }
}
