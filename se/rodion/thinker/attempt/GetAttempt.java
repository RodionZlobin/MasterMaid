package se.rodion.thinker.attempt;

import java.io.IOException;

import se.rodion.thinker.answer.Answer;

public class GetAttempt
{
	private String[] attempt;
	private Answer length = new Answer();
	private int lengthOfBoard;
	String output;

	public GetAttempt()
	{
		lengthOfBoard = length.getGameBoardLength();
		attempt = new String[lengthOfBoard];
	}

	public String getLine() throws java.io.IOException
	{

		// String output;
		do
		{
			System.out.println("Input 5 numbers in range: 1-8");
			output = "";
			char currentChar = (char) System.in.read();

			while (currentChar != '\n')
			{
				if (currentChar >= '1' && currentChar <= '8')
				{
					output += currentChar;
				}
				else
				{
					while (System.in.read() != '\n')
						;
					output = "";
					break;
				}
				currentChar = (char) System.in.read();
			} // while

		}
		while (output.length() < lengthOfBoard); // do

		return output;

	} // metod

	public String[] getAttempt() throws IOException
	{
		do
		{
			getLine();
		}
		while (output.length() != lengthOfBoard);
		for (int i = 0; i < lengthOfBoard; i++)
		{
			attempt[i] = output.substring(i, i + 1);
		}
		return attempt;
	}
}
