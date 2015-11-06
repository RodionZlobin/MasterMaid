package se.rodion.thinker.answer;

import java.util.Arrays;

public class GetRandomLine
{
	String[] answerLine;
	int minNum;
	int maxNum;
	Answer length;

	public GetRandomLine()
	{
		minNum = 1;
		maxNum = 8;
		length = new Answer();
		answerLine = new String[length.getGameBoardLength()];
	}

	public String[] getAnswerLine()
	{
		do
		{
			GetRandomNum getNum = new GetRandomNum(minNum, maxNum);
			int element = getNum.randNumber();

			for (int i = 0; i < answerLine.length; i++)
			{
				String newElement = Integer.toString(element);

				if (answerLine[i] == null && !Arrays.asList(answerLine).contains(newElement))

				answerLine[i] = newElement;
			}
		}
		while (answerLine[length.getGameBoardLength()] != null);

		return answerLine;
	}
}
