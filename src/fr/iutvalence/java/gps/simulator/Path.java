package fr.iutvalence.java.gps.simulator;

import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a path, in other words an ordered list of timestamped location.
 * 
 * @author sebastienjean
 *
 */
public class Path
{
	/**
	 * Ordered list of timestamped locations.
	 */
	private final List<TimestampedLocation> waypoints;
	
	public Path()
	{
		this.waypoints = new LinkedList<TimestampedLocation>();
	}
	
	public int getPathWaypointsCount()
	{
		return this.waypoints.size();
	}
	
	public TimestampedLocation getStart()
	{
		return this.waypoints.get(0);
	}
	
	public TimestampedLocation getFinish()
	{
		return this.waypoints.get(this.waypoints.size()-1);
	}
	
	public void addWaypoint(TimestampedLocation waypoint) throws BackToTheFutureException
	{
		TimestampedLocation last = this.getFinish();
		
		if ((waypoint == null)||((last != null)&&(last.getDate().compareTo(waypoint.getDate()) >= 0)))
			throw new BackToTheFutureException();
		
		this.waypoints.add(waypoint);	
	}
	
	public void removeWaypoint(int offset)
	{
		this.waypoints.remove(offset);
	}
	
	public TimestampedLocation getWaypoint(int offset)
	{
		return this.waypoints.get(offset);
	}

	public long getDuration()
	{
		return this.getFinish().getDate().getTimeInMillis() - this.getStart().getDate().getTimeInMillis();
	}
	
	public long get3DLength()
	{
		// TODO replace this mock implementation
		return 1000;
	}
	
	public long get2DLength()
	{
		// TODO replace this mock implementation
		return 500;
	}
	
	public double getAverageTrueSpeed()
	{
		return this.get3DLength() / this.getDuration();
	}
	
	public double getAverageSpeedOverGround()
	{
		return this.get2DLength() / this.getDuration();
	}
}
