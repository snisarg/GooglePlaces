
package org.snisarg.googleapi.model.details;

import java.io.Serializable;
import java.util.List;

public class Address_components implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String long_name;
   	private String short_name;
   	private List<String> types;

 	public String getLong_name(){
		return this.long_name;
	}
	public void setLong_name(String long_name){
		this.long_name = long_name;
	}
 	public String getShort_name(){
		return this.short_name;
	}
	public void setShort_name(String short_name){
		this.short_name = short_name;
	}
 	public List<String> getTypes(){
		return this.types;
	}
	public void setTypes(List<String> types){
		this.types = types;
	}
}
