package org.snisarg.googleapi.query;

public class DetailsQuery {
	
	StringBuffer query = new StringBuffer("https://maps.googleapis.com/maps/api/place/details/json?");
	boolean sensor=false;
	public boolean isSensor() {
		return sensor;
	}
	public DetailsQuery setSensor(boolean sensor) {
		this.sensor = sensor;
		return this;
	}
	public DetailsQuery(String reference) {
		this.query.append("reference="+reference);
	}
	
	public DetailsQuery(String reference, boolean sensor) {
		this.query.append("reference="+reference);
		this.sensor=sensor;
	}
	
	public String toString() {
		query.append("&sensor="+sensor);
		return query.toString();
	}
}
