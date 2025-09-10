public class HistoricalEvent {
    private String description;
    private Date eventDay;

    // ================== CONSTRUCTORS ==================

    /**
     * Default constructor.
     */
    public HistoricalEvent() {
        this.description = "No Description";
        this.eventDay = new Date();
    }

    /**
     * Parameterized constructor.
     */
    public HistoricalEvent(String description, Date eventDay) {

        this.description = description;

        this.eventDay = new Date(eventDay);
    }

    /**
     * Copy constructor.
     */
    public HistoricalEvent(HistoricalEvent other) {

        if (other != null) {
            this.description = other.description;

            this.eventDay = new Date(other.eventDay);
        }
    }


    // ================== SETTERS (MUTATORS) ==================

    /**
     * Sets the description of the event.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the date of the event.
     */
    public void setEventDay(Date eventDay) {

        this.eventDay = new Date(eventDay);
    }


    // ================== GETTERS ==================
    public String getDescription() {
        return description;
    }

    public Date getEventDay() {

        return new Date(this.eventDay);
    }


    // ================== OTHER METHODS ==================
    @Override
    public String toString() {

        return this.description + " on " + this.eventDay;
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (!(other instanceof HistoricalEvent)) {
            return false;
        }

        HistoricalEvent otherEvent = (HistoricalEvent) other;

        boolean descriptionIsEqual = this.description.equals(otherEvent.description);
        boolean dayIsEqual = this.eventDay.equals(otherEvent.eventDay);

        return descriptionIsEqual && dayIsEqual;
    }
}