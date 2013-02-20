package org.snisarg.googleapi.tests;

import org.snisarg.googleapi.GooglePlaces;
import org.snisarg.googleapi.model.autocomplete.AutocompleteWrapper;
import org.snisarg.googleapi.model.autocomplete.Predictions;
import org.snisarg.googleapi.query.AutocompleteQuery;

public class TestAutocomplete {

	public static void main(String[] args) {
		GooglePlaces gp = new GooglePlaces("Your key here");
		AutocompleteWrapper aw = gp.query(new AutocompleteQuery("Kapaswadi").setLatitude(19.1146857).setLongitude(72.8310232).setRadius(90000));
		for(Predictions p : aw.getPredictions()) {
			System.out.println(p.getDescription());
		}
	}

}
