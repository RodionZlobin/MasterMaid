package se.rodion.thinker.gameservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import se.rodion.thinker.answer.Answer;
import se.rodion.thinker.attempt.AddElements;
import se.rodion.thinker.attempt.GetAttempt;
import se.rodion.thinker.console.HelpInfo;
import se.rodion.thinker.console.PrintBoard;

public final class PlayField
{
	List<String> playList;// = new ArrayList<>();
	private int attemptCounter;
	private int gameLength;
	Answer facit;
	GetAttempt forsok;
	String[] attempt;
	PrintBoard print;
	HelpInfo help;
	AddElements elements;

	public PlayField(int gameLength) throws IOException
	{
		this.gameLength = gameLength;
		attemptCounter = 1;
		playList = new ArrayList<>();
		facit = new Answer();
		forsok = new GetAttempt();
		print = new PrintBoard();
		help = new HelpInfo();
		elements = new AddElements();
	}

	public void gameOn() throws IOException
	{
		do
		{
			attempt = forsok.getAttempt();
			if (Arrays.equals(attempt, facit.getAnswer()))
			{
				System.out.println("Yes, you wan");
				return;
			}

			help.getHelp(attempt, facit.getAnswer());

			elements.addElements(attempt, playList);
			elements.addElements(help.getHelp(attempt, facit.getAnswer()), playList);

			print.printList(playList);

			attemptCounter++;
		}
		while (attemptCounter <= gameLength);

		System.out.println("Game Over\nRight combination was " + Arrays.toString(facit.getAnswer()));
	}

}
