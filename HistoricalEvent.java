public class HistoricalEvent {
    private String description;
    private Date eventDay;
    


    @Override
	public String toString()
    {
        return this.description + " " + this.eventDay + " ";

    }
    
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
