package com.agea.entidades;

import com.google.gson.annotations.SerializedName;

public class Audits {
	
	@SerializedName("speed-index")
	 private Valores speedIndex;
	private Valores interactive;
	 private String requestedURL;
	 private String finalURL;
	 
	public Audits(Valores speedIndex, Valores interactive, String requestedURL, String finalURL) {
		super();
		this.speedIndex = speedIndex;
		this.interactive = interactive;
		this.requestedURL = requestedURL;
		this.finalURL = finalURL;
	}

	public Audits() {
		super();
	}

	public Valores getSpeedIndex() {
		return speedIndex;
	}

	public void setSpeedIndex(Valores speedIndex) {
		this.speedIndex = speedIndex;
	}

	public Valores getInteractive() {
		return interactive;
	}

	public void setInteractive(Valores interactive) {
		this.interactive = interactive;
	}

	public String getRequestedURL() {
		return requestedURL;
	}

	public void setRequestedURL(String requestedURL) {
		this.requestedURL = requestedURL;
	}

	public String getFinalURL() {
		return finalURL;
	}

	public void setFinalURL(String finalURL) {
		this.finalURL = finalURL;
	}

	@Override
	public String toString() {
		return "Audits [speedIndex=" + speedIndex + ", interactive=" + interactive + ", requestedURL=" + requestedURL
				+ ", finalURL=" + finalURL + "]";
	}
	    
	    
		
	    
	

		

	



	 
}
