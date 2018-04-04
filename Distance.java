import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Distance {
	static BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		double oneLatitude = 0;
		System.out.println("Please enter the latitude for point 1:");
		oneLatitude = toDecimals(bufferReader.readLine());
		
		double oneLongitude = 0;
		System.out.println("Please enter the longitude for point 1:");
		oneLongitude = toDecimals(bufferReader.readLine());
		
		double twoLatitude = 0;
		System.out.println("Please enter the latitude for point 2:");
		twoLatitude = toDecimals(bufferReader.readLine());
		
		double twoLongitude = 0;
		System.out.println("Please enter the longitude for point 2:");
		twoLongitude = toDecimals(bufferReader.readLine());
		
		double oneLatitudeR = toRadians(oneLatitude);
		double oneLongitudeR = toRadians(oneLongitude);
		double twoLatitudeR = toRadians(twoLatitude);
		double twoLongitudeR = toRadians(twoLongitude);
		
		double finalAngularDistance = angularDistance(oneLatitudeR, oneLongitudeR, twoLatitudeR, twoLongitudeR);
		double roundedKDistance = kDistance(finalAngularDistance);
		double roundedMDistance = mDistance(finalAngularDistance);
		
		System.out.println("Angular Distance = " + finalAngularDistance);
		System.out.println("Distance = " + roundedKDistance + " kilometers");
		System.out.println("Distance = " + roundedMDistance + " miles");
	}
	
	public static double toDecimals(String strDegree) {
		StringTokenizer st = new StringTokenizer(strDegree);
		double degree = 0.0;
		degree = Double.parseDouble(st.nextToken());
		degree += Double.parseDouble(st.nextToken()) / 60;
		return degree;
	}
	
	public static double toRadians(double degrees) {
        return (degrees * Math.PI) / 180;
    }
	
	public static double angularDistance(double oneLatitudeR, double oneLongitudeR, double twoLatitudeR, double twoLongitudeR) {
		return Math.acos(Math.sin(oneLatitudeR) * Math.sin(twoLatitudeR) + 
				Math.cos(oneLatitudeR) * Math.cos(twoLatitudeR) * Math.cos(twoLongitudeR - oneLongitudeR));
	}
	
	public static long kDistance(double finalAngularDistance) {
		double unroundedDistance = finalAngularDistance * 6372.795;
		return Math.round(unroundedDistance);
	}
	
	public static long mDistance( double finalAngularDistance) {
		double unroundedDistance = finalAngularDistance * 6372.795;
		double unroundedMDistance = unroundedDistance * 0.621371;
		return Math.round(unroundedMDistance);
	}
}
