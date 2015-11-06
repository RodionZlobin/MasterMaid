package se.rodion.thinker.console;

import java.util.List;

import se.rodion.thinker.answer.Answer;

public final class PrintBoard
{
	// private List list;

	private Answer length = new Answer();
	private int modLength;

	public PrintBoard()
	{
		// List<String> list = new ArrayList<>();
		modLength = length.getGameBoardLength() * 2;
	}

	public void printList(List<String> list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			if ((i) % modLength == 0)
			{
				System.out.println();
				System.out.print((i / modLength + 1) + ":\t | ");
			}
			if (list.get(i) != null)
				if ((i % modLength) >= 0 && (i % modLength) < modLength / 2)
			{
				System.out.print(list.get(i) + " | ");
			}
			else
			{
				System.out.print(list.get(i) + " ");
			}
		}

		System.out.println();
	}
}
