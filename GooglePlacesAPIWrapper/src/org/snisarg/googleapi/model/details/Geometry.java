
package org.snisarg.googleapi.model.details;

import java.io.Serializable;

public class Geometry implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Location location;
   	private Viewport viewport;

 	public Location getLocation(){
		return this.location;
	}
	public void setLocation(Location location){
		this.location = location;
	}
 	public Viewport getViewport(){
		return this.viewport;
	}
	public void setViewport(Viewport viewport){
		this.viewport = viewport;
	}
}
