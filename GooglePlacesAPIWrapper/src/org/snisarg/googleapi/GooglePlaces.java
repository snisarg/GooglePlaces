package org.snisarg.googleapi;

import java.io.*;
import java.net.*;

import org.snisarg.googleapi.model.autocomplete.AutocompleteWrapper;
import org.snisarg.googleapi.model.details.DetailsWrapper;
import org.snisarg.googleapi.model.nearby.NearbyWrapper;
import org.snisarg.googleapi.query.AutocompleteQuery;
import org.snisarg.googleapi.query.DetailsQuery;
import org.snisarg.googleapi.query.NearbyQuery;

import com.google.gson.Gson;

public class GooglePlaces {
	
	Gson gson;
	private String apiKey="key here";
	
	public GooglePlaces(String key) {
		apiKey = key;
		gson = new Gson();
	}
	
	public NearbyWrapper query(NearbyQuery nearbyQuery) {
		StringBuffer query = new StringBuffer(nearbyQuery.toString());
		query.append("&key="+apiKey);
		//System.out.println(query.toString());
		return gson.fromJson(getJSON(query.toString(), 1000000), NearbyWrapper.class);
	}
	
	public AutocompleteWrapper query(AutocompleteQuery autocompleteQuery) {
		StringBuffer query = new StringBuffer(autocompleteQuery.toString());
		query.append("&key="+apiKey);
		//System.out.println(query.toString());
		return gson.fromJson(getJSON(query.toString(), 1000000), AutocompleteWrapper.class);
	}
	
	public DetailsWrapper query(DetailsQuery detailsQuery) {
		StringBuffer query = new StringBuffer(detailsQuery.toString());
		query.append("&key="+apiKey);
		//System.out.println(query.toString());
		return gson.fromJson(getJSON(query.toString(), 1000000), DetailsWrapper.class);
	}
	
	private String getJSON(String url, int timeout) {
	    try {
	        URL u = new URL(url);
	        HttpURLConnection c = (HttpURLConnection) u.openConnection();
	        c.setRequestMethod("GET");
	        c.setRequestProperty("Content-length", "0");
	        c.setUseCaches(false);
	        c.setAllowUserInteraction(false);
	        c.setConnectTimeout(timeout);
	        c.setReadTimeout(timeout);
	        c.connect();
	        int status = c.getResponseCode();

	        switch (status) {
	            case 200:
	            case 201:
	                BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
	                StringBuilder sb = new StringBuilder();
	                String line;
	                while ((line = br.readLine()) != null) {
	                    sb.append(line+"\n");
	                }
	                br.close();
	                //System.out.println(sb.toString());
	                return sb.toString();
	        }

	    } catch (MalformedURLException ex) {
	        
	    } catch (IOException ex) {
	        
	    }
	    return null;
	}
}
