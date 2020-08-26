package project.logic.model;

public class age {
	
	private int days;
	   private int months;
	   private int years;
	 
	   @SuppressWarnings("unused")
	public age()
	   {
	    
	   }
	 
	   public age(int days, int months, int years)
	   {
	      this.days = days;
	      this.months = months;
	      this.years = years;
	   }
	 
	   public int getDays()
	   {
	      return this.days;
	   }
	 
	   public int getMonths()
	   {
	      return this.months;
	   }
	 
	   public int getYears()
	   {
	      return this.years;
	   }
	 
	   @Override
	   public String toString()
	   {
	      return years + " years, " + months + " months, " + days + " days";
	   }

}
