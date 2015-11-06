package se.rodion.thinker.answer;

import java.util.Arrays;

public final class Answer
{
	private final int GAMEBOARDLENGTH = 5;
	private final String[] ANSWER;
	private String[] answerLine; 
	private int minNum;
	private int maxNum;
	GetRandomNum getNum;
	
	public Answer()
	{
		minNum = 1;
		maxNum = 8;
		answerLine = new String [getGameBoardLength()];
		ANSWER = getLine();
	}
	
	
	public String[] getLine()
	{
		do
		{
		getNum = new GetRandomNum(minNum, maxNum);
		int element = getNum.randNumber();
		for (int i = 0; i < 5; i++)
			{
				String newElement = Integer.toString(element);
			
				if ((answerLine[i] == null) && !(Arrays.asList(answerLine).contains(newElement)))
					{
					answerLine[i] = newElement;
					break;
					}
			}
		} while (answerLine[4] == null);

		return answerLine;
	}

	
	public String[] getAnswer()
	{
		return answerLine;
	}
	
	public int getGameBoardLength()
	{
		return GAMEBOARDLENGTH;
	}
}
