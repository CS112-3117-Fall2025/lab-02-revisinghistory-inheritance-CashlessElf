public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public void teach() {

    }
    



    @Override
	public String toString()
    {
        return this.revisedDescription + " " + this.citation + " ";

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
