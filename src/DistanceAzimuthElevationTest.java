import fr.iutvalence.java.gps.simulator.Location;


public class DistanceAzimuthElevationTest
{
	public final static double VALENCE_LATITUDE = 44.93;
	public final static double VALENCE_LONGITUDE = 4.87;
	public final static float VALENCE_ALTITUDE = 150.0f;
	
	public final static double GRENOBLE_LATITUDE = 45.18;
	public final static double GRENOBLE_LONGITUDE = 5.73;
	public final static float GRENOBLE_ALTITUDE = 220.0f;	
	
	public final static double LYON_LATITUDE = 45.76;
	public final static double LYON_LONGITUDE = 4.83;
	public final static float LYON_ALTITUDE = 220.0f;	
	
	
	public static void main(String[] args)
	{
		Location valence = new Location(VALENCE_LONGITUDE, VALENCE_LATITUDE, VALENCE_ALTITUDE);
		Location grenoble = new Location(GRENOBLE_LONGITUDE, GRENOBLE_LATITUDE, GRENOBLE_ALTITUDE);
		Location grenobleHigher = new Location(GRENOBLE_LONGITUDE, GRENOBLE_LATITUDE, 15000);
		Location lyon = new Location(LYON_LONGITUDE, LYON_LATITUDE, LYON_ALTITUDE);
		
		System.out.println("Valence to Grenoble over ground");
		System.out.println(valence.getOverGroundDistance(grenoble));
		System.out.println("Grenoble to Valence over ground");
		System.out.println(grenoble.getOverGroundDistance(valence));
		System.out.println("Valence to 15000m above Grenoble over ground");
		System.out.println(valence.getOverGroundDistance(grenobleHigher));
		System.out.println("15000m above Grenoble to Valence over ground");
		System.out.println(grenobleHigher.getOverGroundDistance(valence));
		System.out.println("Grenoble to 15000m above Grenoble over ground");
		System.out.println(grenoble.getOverGroundDistance(grenobleHigher));
		System.out.println("15000m above Grenoble to Grenoble over ground");
		System.out.println(grenobleHigher.getOverGroundDistance(grenoble));
		System.out.println("Grenoble to Grenoble over ground");
		System.out.println(grenoble.getOverGroundDistance(grenoble));
		System.out.println("Valence to Grenoble 3D");
		System.out.println(valence.get3DDistance(grenoble));
		System.out.println("Grenoble to Valence 3D");
		System.out.println(grenoble.get3DDistance(valence));
		System.out.println("Grenoble to Valence 3D cartesian method");
		System.out.println(grenoble.get3DDistanceFromCartesianCoordinates(valence));
		System.out.println("Valence to Grenoble 3D cartesian method");
		System.out.println(valence.get3DDistanceFromCartesianCoordinates(grenoble));
		System.out.println("Valence to 15000m above Grenoble 3D");
		System.out.println(valence.get3DDistance(grenobleHigher));
		System.out.println("15000m above Grenoble to Valence 3D");
		System.out.println(grenobleHigher.get3DDistance(valence));
		System.out.println("15000m above Grenoble to Grenoble 3D");
		System.out.println(grenobleHigher.get3DDistance(grenoble));
		System.out.println("Valence to Grenoble azymuth");
		System.out.println(valence.getAzimuth(grenoble));
		System.out.println("Grenoble to Valence azymuth");
		System.out.println(grenoble.getAzimuth(valence));
		System.out.println("Valence to Lyon azymuth");
		System.out.println(valence.getAzimuth(lyon));
		System.out.println("Lyon to Valence azymuth");
		System.out.println(lyon.getAzimuth(valence));
		System.out.println("Valence to 15000m above Grenoble elevation");
		System.out.println(valence.getElevation(grenobleHigher));
		System.out.println("Valence to Grenoble elevation");
		System.out.println(valence.getElevation(grenoble));
	}
	
}
