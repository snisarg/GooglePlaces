package org.snisarg.googleapi.tests;

import org.snisarg.googleapi.GooglePlaces;
import org.snisarg.googleapi.model.nearby.NearbyWrapper;
import org.snisarg.googleapi.model.nearby.Results;
import org.snisarg.googleapi.query.NearbyQuery;

public class TestNearby {

	public static void main(String[] args) {
		GooglePlaces gp = new GooglePlaces("key here");
		NearbyWrapper nw = gp.query(new NearbyQuery(19.1146857, 72.8310232));
		for(Results n : nw.getResults()) {
			System.out.println(n.getName());
		}
	}
}
