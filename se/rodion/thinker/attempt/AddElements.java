package se.rodion.thinker.attempt;

import java.util.List;

public final class AddElements
{
	
	public void addElements(String[] elementsToAdd, List<String> list)
	{
		for (String element : elementsToAdd)
			list.add(element);			
	}

}
