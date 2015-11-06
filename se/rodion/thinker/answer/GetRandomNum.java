package se.rodion.thinker.answer;

import java.util.Random;

public class GetRandomNum
{
	int min;
	int max;
	
	public GetRandomNum (int min, int max)
	{
		this.min = min;
		this.max = max;
	}
	
	public int randNumber()
	{
		Random rand = new Random();
		int randomNum = rand.nextInt(max - min + 1) + min;
		return randomNum;
	}
}
