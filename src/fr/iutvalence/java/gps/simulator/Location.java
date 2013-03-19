/*
 Copyright (C) 2013 Sebastien Jean <baz dot jean at gmail dot com>

 This program is free software: you can redistribute it and/or modify
 it under the terms of the version 3 GNU General Public License as
 published by the Free Software Foundation.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.iutvalence.java.gps.simulator;

/**
 * This class represents a location, consisting in longitude/latitude/altitude
 * elements.
 * 
 * @author sebastienjean
 */
public class Location
{
	/**
	 * Location longitude (in +/-dd.d).
	 */
	private final double longitude;

	/**
	 * Location latitude (in +/-dd.d).
	 */
	private final double latitude;

	/**
	 * Location latitude (in meters).
	 */
	private final float altitude;

	/**
	 * Creates a new location, from given longitude/latitude/altitude.
	 * 
	 * @param longitude
	 *            location longitude (in +/-dd.d)
	 * @param latitude
	 *            location latitude (in +/-dd.d)
	 * @param altitude
	 *            location altitude (in meters)
	 */
	public Location(double longitude, double latitude, float altitude)
	{
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
	}

	/**
	 * Getter for location longitude (in +/-dd.d).
	 *  
	 * @return location longitude 
	 */
	public double getLongitude()
	{
		return this.longitude;
	}

	/**
	 * Getter for location latitude (in +/-dd.d).
	 *  
	 * @return location latitude 
	 */
	public double getLatitude()
	{
		return this.latitude;
	}

	/**
	 * Getter for location altitude (in meters).
	 *  
	 * @return location altitude 
	 */
	public float getAltitude()
	{
		return this.altitude;
	}
}
