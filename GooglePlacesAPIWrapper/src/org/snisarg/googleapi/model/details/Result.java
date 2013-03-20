
package org.snisarg.googleapi.model.details;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Address_components> address_components;
   	private String adr_address;
   	private String formatted_address;
   	private Geometry geometry;
   	private String icon;
   	private String id;
   	private String name;
   	private String reference;
   	private List<String> types;
   	private String url;
   	private String vicinity;

 	public List<Address_components> getAddress_components(){
		return this.address_components;
	}
	public void setAddress_components(List<Address_components> address_components){
		this.address_components = address_components;
	}
 	public String getAdr_address(){
		return this.adr_address;
	}
	public void setAdr_address(String adr_address){
		this.adr_address = adr_address;
	}
 	public String getFormatted_address(){
		return this.formatted_address;
	}
	public void setFormatted_address(String formatted_address){
		this.formatted_address = formatted_address;
	}
 	public Geometry getGeometry(){
		return this.geometry;
	}
	public void setGeometry(Geometry geometry){
		this.geometry = geometry;
	}
 	public String getIcon(){
		return this.icon;
	}
	public void setIcon(String icon){
		this.icon = icon;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getReference(){
		return this.reference;
	}
	public void setReference(String reference){
		this.reference = reference;
	}
 	public List<String> getTypes(){
		return this.types;
	}
	public void setTypes(List<String> types){
		this.types = types;
	}
 	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}
 	public String getVicinity(){
		return this.vicinity;
	}
	public void setVicinity(String vicinity){
		this.vicinity = vicinity;
	}
}
