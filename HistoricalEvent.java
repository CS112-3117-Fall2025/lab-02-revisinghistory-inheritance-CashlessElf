public class HistoricalEvent {
    private String description;
    private Date eventDay;

    //Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventDay(Date eventDay) {
        this.eventDay = eventDay;
    }

    //Getters
    public String getDescription() {
        return description;
    }

    public String getEventDay() {
        return toString(eventDay);
    }

    //Other Methods
    @Override
	public String toString()
    {
        return this.description + " " + this.eventDay + " ";

    }
    //Equals
    @Override
	public boolean equals(Object other)
	{
		Date eventDay;
		
		if(other == null)
		{
			return false;
		}
		else if(! (other instanceof Date)) 
		{
			return false;
		}
		else
		{
			eventDay = (Date) other;
			return this.eventDay.equals(otherDate.eventDay);
		}
	}



    
}
