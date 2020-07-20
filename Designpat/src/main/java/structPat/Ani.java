package structPat;

public class Ani {
protected FeedingAPI feedingAPI;
    
    protected Ani(FeedingAPI feedingAPI) {
        this.feedingAPI = feedingAPI;
    }
    public abstract String feed();

}
