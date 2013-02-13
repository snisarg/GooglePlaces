package org.snisarg.googleapi.query;

public class NearbyQuery {
	
	public enum RankBy { PROMINANCE, DISTANCE };
	
	StringBuffer query = new StringBuffer("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
	double latitude, longitude;
	int radius=500;
	boolean sensor;
	RankBy rankby = RankBy.PROMINANCE;
	String pagetoken;
	
	public String getPagetoken() {
		return pagetoken;
	}

	public void setPagetoken(String pagetoken) {
		this.pagetoken = pagetoken;
	}

	public RankBy getRankby() {
		return rankby;
	}

	public void setRankby(RankBy rankby) {
		this.rankby = rankby;
	}

	public boolean isSensor() {
		return sensor;
	}

	public NearbyQuery setSensor(boolean sensor) {
		this.sensor = sensor;
		return this;
	}

	public int getRadius() {
		return radius;
	}

	public NearbyQuery setRadius(int radius) {
		if(radius<50001 && radius>0)
			this.radius = radius;
		return this;
	}

	public NearbyQuery(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public NearbyQuery(double latitude, double longitude, int radius, boolean sensor) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.radius = radius;
		this.sensor = sensor;
	}
	
	public String toString() {
		query.append("location="+latitude+","+longitude+"&sensor="+isSensor());
		if(rankby!=RankBy.DISTANCE)	// PROMINANCE is default, and if it is DISTANCE, don't include radius.
			query.append("&radius="+getRadius());
		if(pagetoken!=null)
			query.append("&pagetoken="+pagetoken);
		System.out.println(query.toString());
		return query.toString();
	}

}
