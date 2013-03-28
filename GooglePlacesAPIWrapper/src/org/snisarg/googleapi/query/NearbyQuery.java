package org.snisarg.googleapi.query;

import java.util.ArrayList;

public class NearbyQuery {
	
	public enum RankBy { PROMINANCE, DISTANCE };
	
	StringBuffer query = new StringBuffer("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
	double latitude, longitude;
	int radius=500;
	boolean sensor;
	RankBy rankby = RankBy.PROMINANCE;
	String pagetoken;
	ArrayList<String> supportedTypes = new ArrayList<String>();
	StringBuffer types = new StringBuffer();
	
	public String getPagetoken() {
		return pagetoken;
	}

	public void setPagetoken(String pagetoken) {
		this.pagetoken = pagetoken;
	}

	public RankBy getRankby() {
		return rankby;
	}

	public NearbyQuery setRankby(RankBy rankby) {
		this.rankby = rankby;
		return this;
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
		setTypes();
		query.append("location="+latitude+","+longitude+"&sensor="+isSensor());
		if(rankby!=RankBy.DISTANCE) {	// PROMINANCE is default, and if it is DISTANCE, don't include radius.
			query.append("&radius="+getRadius());
		} else {
			query.append("&rankby=distance&types="+types);
		}
		if(pagetoken!=null)
			query.append("&pagetoken="+pagetoken);
		//System.out.println(query.toString());
		return query.toString();
	}
	
	public void setTypes() {
		supportedTypes.add("accounting");
		supportedTypes.add("airport");
		supportedTypes.add("amusement_park");
		supportedTypes.add("aquarium");
		supportedTypes.add("art_gallery");
		supportedTypes.add("atm");
		supportedTypes.add("bakery");
		supportedTypes.add("bank");
		supportedTypes.add("bar");
		supportedTypes.add("beauty_salon");
		supportedTypes.add("bicycle_store");
		supportedTypes.add("book_store");
		supportedTypes.add("bowling_alley");
		supportedTypes.add("bus_station");
		supportedTypes.add("cafe");
		supportedTypes.add("campground");
		supportedTypes.add("car_dealer");
		supportedTypes.add("car_rental");
		supportedTypes.add("car_repair");
		supportedTypes.add("car_wash");
		supportedTypes.add("casino");
		supportedTypes.add("cemetery");
		supportedTypes.add("church");
		supportedTypes.add("city_hall");
		supportedTypes.add("clothing_store");
		supportedTypes.add("convenience_store");
		supportedTypes.add("courthouse");
		supportedTypes.add("dentist");
		supportedTypes.add("department_store");
		supportedTypes.add("doctor");
		supportedTypes.add("electrician");
		supportedTypes.add("electronics_store");
		supportedTypes.add("embassy");
		supportedTypes.add("establishment");
		supportedTypes.add("finance");
		supportedTypes.add("fire_station");
		supportedTypes.add("florist");
		supportedTypes.add("food");
		supportedTypes.add("funeral_home");
		supportedTypes.add("furniture_store");
		supportedTypes.add("gas_station");
		supportedTypes.add("general_contractor");
		supportedTypes.add("grocery_or_supermarket");
		supportedTypes.add("gym");
		supportedTypes.add("hair_care");
		supportedTypes.add("hardware_store");
		supportedTypes.add("health");
		supportedTypes.add("hindu_temple");
		supportedTypes.add("home_goods_store");
		supportedTypes.add("hospital");
		supportedTypes.add("insurance_agency");
		supportedTypes.add("jewelry_store");
		supportedTypes.add("laundry");
		supportedTypes.add("lawyer");
		supportedTypes.add("library");
		supportedTypes.add("liquor_store");
		supportedTypes.add("local_government_office");
		supportedTypes.add("locksmith");
		supportedTypes.add("lodging");
		supportedTypes.add("meal_delivery");
		supportedTypes.add("meal_takeaway");
		supportedTypes.add("mosque");
		supportedTypes.add("movie_rental");
		supportedTypes.add("movie_theater");
		supportedTypes.add("moving_company");
		supportedTypes.add("museum");
		supportedTypes.add("night_club");
		supportedTypes.add("painter");
		supportedTypes.add("park");
		supportedTypes.add("parking");
		supportedTypes.add("pet_store");
		supportedTypes.add("pharmacy");
		supportedTypes.add("physiotherapist");
		supportedTypes.add("place_of_worship");
		supportedTypes.add("plumber");
		supportedTypes.add("police");
		supportedTypes.add("post_office");
		supportedTypes.add("real_estate_agency");
		supportedTypes.add("restaurant");
		supportedTypes.add("roofing_contractor");
		supportedTypes.add("rv_park");
		supportedTypes.add("school");
		supportedTypes.add("shoe_store");
		supportedTypes.add("shopping_mall");
		supportedTypes.add("spa");
		supportedTypes.add("stadium");
		supportedTypes.add("storage");
		supportedTypes.add("store");
		supportedTypes.add("subway_station");
		supportedTypes.add("synagogue");
		supportedTypes.add("taxi_stand");
		supportedTypes.add("train_station");
		supportedTypes.add("travel_agency");
		supportedTypes.add("university");
		supportedTypes.add("veterinary_care");
		supportedTypes.add("zoo");
		for(int i=0; i<supportedTypes.size(); i++) {
			if(i==0) 
				types.append(supportedTypes.get(i));
			else
				types.append("|"+supportedTypes.get(i));
		}
	}

}
