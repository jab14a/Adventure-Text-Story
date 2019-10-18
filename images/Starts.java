package AdventureCode;

import javax.swing.*;

public class Starts {

	private static String[] defaultValues = { "New Game", "Load Game",  "End Game"};
	private static JFrame frame = new JFrame();
	static boolean choice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoryMode();
		House house = new House();
		//Desert desert = new Desert();
		//Mountains mountains = new Mountains();
		//Forest forest = new Forest();
		//Swamp swamp = new Swamp();
		//Bosses bosses = new Bosses();
		//End end = new End();
	}

	private static boolean StoryMode() {
		String mult = (String) JOptionPane.showInputDialog(frame, "Would you like to play Adeventure Text?",
				"Adventure Text", JOptionPane.QUESTION_MESSAGE, null, defaultValues, defaultValues[0]);
		if (mult.equalsIgnoreCase("New Game")) {
			choice = true;
		} else if (mult.equalsIgnoreCase("Load Game")){
			choice = false;
			SaveFile.LoadGame();
		} else if (mult.equalsIgnoreCase("End Game")) {
			Options.sys();
		}
		return choice;
	}

}
