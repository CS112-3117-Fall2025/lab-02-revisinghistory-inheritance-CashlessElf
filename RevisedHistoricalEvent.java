public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public void teach() {
        System.out.print("The following historical event was originally described as such: \n" + "\n"+ HistoricalEvent.description);
        
        System.out.print("\n Now in the modern era there has been an attempt to rewrite history as it had been reported on initaly to push a more modern narrative. Here is this revisonist history: \n" + "\n" + revisedDescription);


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
