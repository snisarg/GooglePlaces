
package org.snisarg.googleapi.model.autocomplete;

import java.io.Serializable;

public class Matched_substrings implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Number length;
   	private Number offset;

 	public Number getLength(){
		return this.length;
	}
	public void setLength(Number length){
		this.length = length;
	}
 	public Number getOffset(){
		return this.offset;
	}
	public void setOffset(Number offset){
		this.offset = offset;
	}
}
