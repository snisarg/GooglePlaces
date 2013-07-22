Google Places API Wrapper for Java
===================================
The library allows Java applications to use Google API calls directly instead of dealing with REST, JSON conversions and call syntaxes.

Requirements
------------
GSON library. https://code.google.com/p/google-gson/

Usage
-----------
	GooglePlaces gp = new GooglePlaces("Your key here");
		NearbyWrapper nw;
		try {
			nw = gp.query(new NearbyQuery(19.1146857, 72.8310232).setRankby(RankBy.DISTANCE));
			for(Results n : nw.getResults()) {
				System.out.println(n.getName());
			}
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}