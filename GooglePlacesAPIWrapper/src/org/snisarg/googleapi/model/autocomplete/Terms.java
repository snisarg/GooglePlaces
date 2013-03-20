
package org.snisarg.googleapi.model.autocomplete;

import java.io.Serializable;

public class Terms implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Number offset;
   	private String value;

 	public Number getOffset(){
		return this.offset;
	}
	public void setOffset(Number offset){
		this.offset = offset;
	}
 	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}
}
