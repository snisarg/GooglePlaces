
package org.snisarg.googleapi.model.details;

import java.io.Serializable;

public class Viewport implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Northeast northeast;
   	private Southwest southwest;

 	public Northeast getNortheast(){
		return this.northeast;
	}
	public void setNortheast(Northeast northeast){
		this.northeast = northeast;
	}
 	public Southwest getSouthwest(){
		return this.southwest;
	}
	public void setSouthwest(Southwest southwest){
		this.southwest = southwest;
	}
}
