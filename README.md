Google Places API Wrapper for Java
===================================
The library allows Java applications to use Google API calls directly instead of dealing with REST, JSON conversions and call syntaxes.
All calls available in the Google Places API have not been added currently.

Usage
-----------
**Nearby Search Query:**

	GooglePlaces gp = new GooglePlaces("Your key here");
	NearbyWrapper nw;
	try {
		nw = gp.query(new NearbyQuery(19.1146857, 72.8310232).setRankby(RankBy.DISTANCE));
		for(Results n : nw.getResults()) {
			System.out.println(n.getName());
		}
	} catch (Exception e) {...}

**Details Query:**

	GooglePlaces gp = new GooglePlaces("Your key here");
	DetailsWrapper dw;
	try {
		dw = gp.query(new DetailsQuery("CnRwAAAAKKVouLjezXBWYnS5qm-gbpydBcLR1j7VfUA5OJ_O5wI_BYoHc-ea4NmW0HjpVFEkOK4pUR5b8xkeSTB77KWGoVhGpEhbmEd-Qufx8rxnxLhf_eI-WxJ6hgFzrX0FcGQqNZhyRXgalglK24l3bmtFhBIQCK0RuxKzgEo__yp7MvWkNBoUW60gsXqqEqmi5gx_FCjNfCzCa0o"));
		for( Address_components n : dw.getResult().getAddress_components()) {
			System.out.println(n.getShort_name());
		}
	} catch (Exception e) {...}

**Autocomplete Query:**

	GooglePlaces gp = new GooglePlaces("Your key here");
	AutocompleteWrapper aw;
	try {
		aw = gp.query(new AutocompleteQuery("kapa").setLatitude(19.1146857).setLongitude(72.8310232).setRadius(90000).setComponents("country:in"));
		for(Predictions p : aw.getPredictions()) {
			System.out.println(p.getDescription());
		}
	} catch (Exception e) {...}

Requirements
------------
GSON library. https://code.google.com/p/google-gson/