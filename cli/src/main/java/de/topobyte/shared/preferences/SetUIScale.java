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

public class SetUIScale
{

	public static void main(String[] args)
	{
		if (args.length != 1) {
			System.out.println("usage: " + SetUIScale.class.getSimpleName()
					+ " <scale factor>");
			System.exit(1);
		}

		String argFactor = args[0];

		double factor = 1;
		try {
			factor = Double.parseDouble(argFactor);
		} catch (NumberFormatException e) {
			System.out.printf("Unable to parse argument to double: '%s'%n",
					argFactor);
			System.exit(1);
		}

		SharedPreferences.setUIScale(factor);
	}

}
