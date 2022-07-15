package com.agea.entidades;

public class Valores {
	
	 private String id;
	    private String title;
	    private String description;
	    private Double score;
	    private String scoreDisplayMode;
	    private String displayValue;
	    private Double numericValue;
	    private String numericUnit;
	    
	    

	    public Valores(String id, String title, String description, Double score, String scoreDisplayMode,
				String displayValue, Double numericValue, String numericUnit) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.score = score;
			this.scoreDisplayMode = scoreDisplayMode;
			this.displayValue = displayValue;
			this.numericValue = numericValue;
			this.numericUnit = numericUnit;
		}
	    
	    
	    
		public Valores() {
			super();
		}



		public String getID() { return id; }
	    public void setID(String value) { this.id = value; }

	    public String getTitle() { return title; }
	    public void setTitle(String value) { this.title = value; }

	    public String getDescription() { return description; }
	    public void setDescription(String value) { this.description = value; }

	    public Double getScore() { return score; }
	    public void setScore(Double value) { this.score = value; }

	    public String getScoreDisplayMode() { return scoreDisplayMode; }
	    public void setScoreDisplayMode(String value) { this.scoreDisplayMode = value; }

	    public String getDisplayValue() { return displayValue; }
	    public void setDisplayValue(String value) { this.displayValue = value; }


	    public Double getNumericValue() { return numericValue; }
	    public void setNumericValue(Double value) { this.numericValue = value; }

	    public String getNumericUnit() { return numericUnit; }
	    public void setNumericUnit(String value) { this.numericUnit = value; }
		@Override
		public String toString() {
			return "DOMSize [id=" + id + ", title=" + title + ", description=" + description + ", score=" + score
					+ ", scoreDisplayMode=" + scoreDisplayMode + ", displayValue=" + displayValue + ", numericValue="
					+ numericValue + ", numericUnit=" + numericUnit + "]";
		}
	    
	    

}
