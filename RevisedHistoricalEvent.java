public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    // ================== CONSTRUCTORS ==================

    /**
     * Default constructor.
     */
    public RevisedHistoricalEvent() {
        super();
        this.revisedDescription = "No Revised Description";
        this.citation = "No Citation";
    }

    /**
     * Parameterized constructor.        
     */
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {

        super(description, eventDay);

        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    /**
     * Copy constructor.
     */
    public RevisedHistoricalEvent(RevisedHistoricalEvent other) {

        super(other);

        if (other != null) {
            this.revisedDescription = other.revisedDescription;
            this.citation = other.citation;
        }
    }

    // ================== TEACH METHOD ==================
    public void teach() {

        System.out.println("The following \"history\" was told for many years:");
        System.out.println(super.getDescription() + "\n"); 

        System.out.println("By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.");
        System.out.println("Here is the revised history:");
        System.out.println(this.revisedDescription + "\n");

        System.out.println(this.citation);
    }

    // ================== SETTERS ==================

    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    // ================== GETTERS ==================

    public String getRevisedDescription() {
        return revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    // ================== OTHER METHODS ==================
    @Override
    public String toString() {

        return super.toString() +
               "\nRevised Account: " + this.revisedDescription +
               "\nSource: " + this.citation;
    }

    @Override
    public boolean equals(Object other) {

        if (!super.equals(other)) {
            return false;
        }

        if (!(other instanceof RevisedHistoricalEvent)) {
             return false;
        }

        RevisedHistoricalEvent otherRevised = (RevisedHistoricalEvent) other;

        boolean revisedDescIsEqual = this.revisedDescription.equals(otherRevised.revisedDescription);
        boolean citationIsEqual = this.citation.equals(otherRevised.citation);

        return revisedDescIsEqual && citationIsEqual;
    }
}