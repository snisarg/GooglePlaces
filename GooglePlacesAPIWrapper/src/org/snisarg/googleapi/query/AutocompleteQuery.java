package org.snisarg.googleapi.query;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class AutocompleteQuery {
	
	StringBuffer query = new StringBuffer("https://maps.googleapis.com/maps/api/place/autocomplete/json?");
	String input;
	boolean sensor;
	double latitude, longitude;
	int radius=500;
	
	public AutocompleteQuery(String input) {
		try {
			this.input=URLEncoder.encode(input, "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isSensor() {
		return sensor;
	}
	public AutocompleteQuery setSensor(boolean sensor) {
		this.sensor = sensor;
		return this;
	}
	public double getLatitude() {
		return latitude;
	}
	public AutocompleteQuery setLatitude(double latitude) {
		this.latitude = latitude;
		return this;
	}
	public double getLongitude() {
		return longitude;
	}
	public AutocompleteQuery setLongitude(double longitude) {
		this.longitude = longitude;
		return this;
	}
	public int getRadius() {
		return radius;
	}
	public AutocompleteQuery setRadius(int radius) {
		this.radius = radius;
		return this;
	}
	
	public String toString() {
		query.append("input="+input+"&sensor="+sensor);
		if(latitude!=0 || longitude!=0)	// Assuming 0 as not set
			query.append("&location="+latitude+","+longitude);
		if(radius>0)
			query.append("&radius="+radius);
		System.out.println(query.toString());
		return query.toString();
	}
}
