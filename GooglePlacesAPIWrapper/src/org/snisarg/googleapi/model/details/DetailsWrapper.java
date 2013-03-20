
package org.snisarg.googleapi.model.details;

import java.io.Serializable;
import java.util.List;

public class DetailsWrapper implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> html_attributions;
   	private Result result;
   	private String status;

 	public List<String> getHtml_attributions(){
		return this.html_attributions;
	}
	public void setHtml_attributions(List<String> html_attributions){
		this.html_attributions = html_attributions;
	}
 	public Result getResult(){
		return this.result;
	}
	public void setResult(Result result){
		this.result = result;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
}
