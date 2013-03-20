package org.snisarg.googleapi.model.nearby;

import java.io.Serializable;
import java.util.List;

public class NearbyWrapper implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> html_attributions;
	private String next_page_token;
	private List<Results> results;
	private String status;

	public List<String> getHtml_attributions() {
		return this.html_attributions;
	}

	public void setHtml_attributions(List<String> html_attributions) {
		this.html_attributions = html_attributions;
	}

	public String getNext_page_token() {
		return this.next_page_token;
	}

	public void setNext_page_token(String next_page_token) {
		this.next_page_token = next_page_token;
	}

	public List<Results> getResults() {
		return this.results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
