package com.phone.gui_elements;

public class GuiScreensFactory {

	private static ViewScreen viewScreen;
		
	public static ViewScreen openViewScreen()
	{
		if(viewScreen==null)
		{
			viewScreen = new ViewScreen();
			viewScreen.setVisible(true);
		}
		return viewScreen;
	}
	
	public static void closeViewScreen()
	{
		if(viewScreen!=null)
		{
			viewScreen.dispose();
		}
		viewScreen = null;
	}
	
	
}
