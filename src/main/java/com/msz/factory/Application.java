package com.msz.factory;

import com.msz.views.MainMenu;

public class Application {
	private static MainMenu mainMenu = null;

	public static MainMenu program() {
		if (mainMenu == null) {
			mainMenu = new MainMenu();
		}
		return mainMenu;
	}
}
