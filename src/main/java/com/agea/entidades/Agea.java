package com.agea.entidades;




public class Agea {
    private String captchaResult;
    private String kind;
    private String id;
    private LighthouseResult lighthouseResult;
    private Audits audits;
    
    


    public Agea() {
		super();
	}
	
	public String getCaptchaResult() {
		return captchaResult;
	}

	public void setCaptchaResult(String captchaResult) {
		this.captchaResult = captchaResult;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Audits getAudits() {
		return audits;
	}

	public void setAudits(Audits audits) {
		this.audits = audits;
	}

	public Agea(String captchaResult, String kind, String id,  LighthouseResult lighthouseResult, Audits audits) {
		super();
		this.captchaResult = captchaResult;
		this.kind = kind;
		this.id = id;
		this.lighthouseResult = lighthouseResult;
		this.audits = audits;
	}

	public String getCAPTCHAResult() { return captchaResult; }
    public void setCAPTCHAResult(String value) { this.captchaResult = value; }

    public String getKind() { return kind; }
    public void setKind(String value) { this.kind = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

 

    public LighthouseResult getLighthouseResult() { return lighthouseResult; }
    public void setLighthouseResult(LighthouseResult value) { this.lighthouseResult = value; }

	@Override
	public String toString() {
		return "Agea [captchaResult=" + captchaResult + ", kind=" + kind + ", id=" + id +", lighthouseResult="
				+ lighthouseResult + ", audits=" + audits + "]";
	}

    
}

