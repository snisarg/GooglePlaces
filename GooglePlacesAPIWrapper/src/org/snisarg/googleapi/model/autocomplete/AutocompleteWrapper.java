
package org.snisarg.googleapi.model.autocomplete;

import java.io.Serializable;
import java.util.List;

public class AutocompleteWrapper implements Serializable{
	
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Predictions> predictions;
   	private String status;

 	public List<Predictions> getPredictions(){
		return this.predictions;
	}
	public void setPredictions(List<Predictions> predictions){
		this.predictions = predictions;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
}
