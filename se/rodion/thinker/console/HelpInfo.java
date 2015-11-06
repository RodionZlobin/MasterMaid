package se.rodion.thinker.console;

import java.util.Arrays;
import java.util.Comparator;

import se.rodion.thinker.answer.Answer;

public final class HelpInfo
{
	private String[] a;
	private String[] b;
	private int stringLength;
	private Answer length = new Answer();
	
	public HelpInfo()
	{
		stringLength = length.getGameBoardLength();
		a = new String [stringLength];
		b = new String [stringLength];
		
	}
	
	public String[] getHelp(String[] a, String[] b)
	{
		String[] help = new String [stringLength];
		
		for (int i = 0; i < 5; i++)
		{
			if (a[i].equals(b[i]))
			{
				for (int j = 0; j < help.length; j++)
				{
					if (help[j] == null)
					{
						help[j] = "+";
						break;
					}
				}
			}
			
			if (Arrays.asList(a).contains(b[i]) && !(b[i].equals(a[i])) )
			{
				for (int j = 0; j < help.length; j++)
				{
					if (help[j] == null)
					{
						help[j] = "-";
						break;
					}
				}
			}
		}
//		Arrays.sort(help); // not sort with null value!!!
		Arrays.sort(help, Comparator.nullsFirst(Comparator.naturalOrder()));
		return help;
	}
}
