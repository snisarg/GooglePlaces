
package org.snisarg.googleapi.model.details;

import java.io.Serializable;

public class Northeast implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double lat;
   	private double lng;

 	public double getLat(){
		return this.lat;
	}
	public void setLat(double lat){
		this.lat = lat;
	}
 	public double getLng(){
		return this.lng;
	}
	public void setLng(double lng){
		this.lng = lng;
	}
}
