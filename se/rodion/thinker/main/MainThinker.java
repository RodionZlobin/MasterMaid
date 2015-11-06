package se.rodion.thinker.main;

import java.io.IOException;

import se.rodion.thinker.gameservice.PlayField;

public class MainThinker
{
	public static void main(String[] args) throws IOException
	{
		PlayField game = new PlayField(10);
		game.gameOn();
		
	}
}
