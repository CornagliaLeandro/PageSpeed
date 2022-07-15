package com.agea.entidades;

public class LighthouseResult {
	 private String requestedURL;
	    private String finalURL;
	    private String lighthouseVersion;
	    private String userAgent;
	    private Audits audits;
	    
	    public LighthouseResult(String requestedURL, String finalURL, String lighthouseVersion, String userAgent,
				Audits audits) {
			super();
			this.requestedURL = requestedURL;
			this.finalURL = finalURL;
			this.lighthouseVersion = lighthouseVersion;
			this.userAgent = userAgent;
			this.audits = audits;
		}
	


	    public String getRequestedURL() { return requestedURL; }
	    public void setRequestedURL(String value) { this.requestedURL = value; }

	    public String getFinalURL() { return finalURL; }
	    public void setFinalURL(String value) { this.finalURL = value; }

	    public String getLighthouseVersion() { return lighthouseVersion; }
	    public void setLighthouseVersion(String value) { this.lighthouseVersion = value; }

	    public String getUserAgent() { return userAgent; }
	    public void setUserAgent(String value) { this.userAgent = value; }


	  

	    public Audits getAudits() { return audits; }
	    public void setAudits(Audits value) { this.audits = value; }
		@Override
		public String toString() {
			return "LighthouseResult [requestedURL=" + requestedURL + ", finalURL=" + finalURL + ", lighthouseVersion="
					+ lighthouseVersion + ", userAgent=" + userAgent + ", audits=" + audits + "]";
		}
		


	    

}
