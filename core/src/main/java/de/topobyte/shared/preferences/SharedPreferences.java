// Copyright 2023 Sebastian Kuerten
//
// This file is part of shared-preferences.
//
// shared-preferences is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// shared-preferences is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with shared-preferences. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.shared.preferences;


import java.util.prefs.Preferences;

public class SharedPreferences
{

	public static final String UI_SCALE = "uiScale";

	public static double getUIScale()
	{
		Preferences node = Preferences
				.userNodeForPackage(SharedPreferences.class);
		return node.getDouble(UI_SCALE, 1.0);
	}

	public static void setUIScale(double uiScale)
	{
		Preferences node = Preferences
				.userNodeForPackage(SharedPreferences.class);
		node.putDouble(UI_SCALE, uiScale);
	}

}
